package bookshop

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {

    private val bookShop : BookShop = BookShop()

    @Test fun `buying book with year greater than 2010 should get 10% discount` () {
        val bookPrice = 11.83
        val expectedCostOfBook = Money(BookShop.CURRENCY, BigDecimal(bookPrice).setScale(2, RoundingMode.HALF_EVEN))

        val theTerriblePrivacyOfMaxWellSim = Book("The Terrible Privacy of Maxwell Sim", Money(BookShop.CURRENCY, BigDecimal(13.14)), 2010)

        val costOfBook = bookShop.buyBook(theTerriblePrivacyOfMaxWellSim)

        assertEquals(expectedCostOfBook.value, costOfBook.value)
    }

    @Test fun `buying book with year not greater than 2010 should be original price`() {
        val expectedCostOfBook = 15.16
        val theTerriblePrivacyOfMaxWellSim = Book("The Terrible Privacy of Maxwell Sim", Money(BookShop.CURRENCY, BigDecimal(15.16)), 1851)

        val costOfBook = bookShop.buyBook(theTerriblePrivacyOfMaxWellSim)

        assertEquals(BigDecimal(expectedCostOfBook), costOfBook.value)
    }

    @Test fun `when total cost of books is more than 30 pounds then get a 5% discount off total price` () {
        val bookPrice = 35.27
        val expectedCostOfBooks = Money(BookShop.CURRENCY, BigDecimal(bookPrice).setScale(2, RoundingMode.HALF_EVEN))

        val theTerriblePrivacyOfMaxWellSim = Book("Still Life With Woodpecker", Money(BookShop.CURRENCY, BigDecimal(11.05)), 1980)
        val threeMenInABoat = Book("Three Men in a Boat", Money(BookShop.CURRENCY, BigDecimal(12.87)), 1889)
        val greatExpectations = Book("Great Expectations", Money(BookShop.CURRENCY, BigDecimal(13.21)), 1861)

        val costOfBooks = bookShop.buyBooks(arrayOf(theTerriblePrivacyOfMaxWellSim, threeMenInABoat, greatExpectations).toList())

        assertEquals(expectedCostOfBooks.value, costOfBooks.value)
    }
}
