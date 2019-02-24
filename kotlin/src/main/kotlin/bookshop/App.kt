package bookshop

import java.math.BigDecimal

fun main(args: Array<String>) {

    val checkout = Checkout(BookShop())

    val theTerriblePrivacyOfMaxWellSim = Book("The Terrible Privacy of Maxwell Sim", Money(BookShop.CURRENCY, BigDecimal(13.14)), 2010)
    val threeManInABoat = Book("Three Men in a Boat", Money(BookShop.CURRENCY, BigDecimal(12.87)), 1889)
    val theStillLifeWithWoodpecker = Book("The Still Life With Woodpecker", Money(BookShop.CURRENCY, BigDecimal(11.05)), 1980)
    val greatExpectation = Book("Great Expectations", Money(BookShop.CURRENCY, BigDecimal(13.21)), 1861)

    checkout.checkoutBooks(books = *arrayOf(theTerriblePrivacyOfMaxWellSim, threeManInABoat))
    checkout.checkoutBooks(books = *arrayOf(theStillLifeWithWoodpecker, threeManInABoat, greatExpectation))
    checkout.checkoutBooks(books = *arrayOf(theTerriblePrivacyOfMaxWellSim, threeManInABoat, greatExpectation))

}
