/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bookshop

class Checkout(private val bookshop : BookShop) {

    internal fun checkoutBooks(vararg books : Book) {
        val totalBookCost = bookshop.buyBooks(books.toList())
        println("Total Cost of books: $books is $totalBookCost")
    }
}