package bookshop

import java.math.BigDecimal
import java.util.*

class BookShop {

    companion object {
        val CURRENCY : Currency = Currency.getInstance("GBP")
        const val TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS : Double = 30.00
    }

    internal fun buyBook(book: Book) : Money {
        val bookPrice = book.price

        if (book.year >= 2010) {
            return bookPrice subtractMoney
                    Money(
                            BookShop.CURRENCY,
                            bookPrice.value.multiply(BigDecimal.valueOf(10 / 100.toDouble())))
        }

        return bookPrice
    }

    internal fun buyBooks(books : List<Book>) : Money {
        var totalCost = Money(CURRENCY, BigDecimal.ZERO)

        for (book in books) {
            totalCost = totalCost addMoney buyBook(book)
        }

        if (totalCost.value.toDouble() > TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS) {
            return totalCost subtractMoney Money(CURRENCY,
                    totalCost.value.multiply(BigDecimal.valueOf(5 / 100.toDouble())))
        }

        return totalCost
    }
}
