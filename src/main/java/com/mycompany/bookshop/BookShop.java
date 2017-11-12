/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

import java.util.List;

public class BookShop {

    private static final int BOOK_YEAR_OVER_2010 = 2010;
    private static final int BOOK_YEAR_OVER_2010_DISCOUNT = 10; // in %
    private static final int TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS_DISCOUNT = 5;
    private static final double TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS = 30.00;

    public double buyBook(Book book) {
        double bookPrice = book.getPrice();
        if (book.getYear() >= BOOK_YEAR_OVER_2010) {
            return bookPrice - (bookPrice * ((double) BOOK_YEAR_OVER_2010_DISCOUNT / 100));
        }
        return bookPrice;
    }

    public double buyBooks(List<Book> books) {
        double totalCost = 0.0;
        for (Book book : books) {
            totalCost += buyBook(book);
        }

        if (totalCost > TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS) {
            return totalCost - (totalCost * ((double) TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS_DISCOUNT / 100));
        }

        return totalCost;
    }
}
