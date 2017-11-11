/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

public class BookShop {

    private static final int BOOK_YEAR_OVER_2010 = 2010;
    private static final int BOOK_YEAR_OVER_2010_DISCOUNT = 10; // in %

    public double buyBook(Book book) {
        double bookPrice = book.getPrice();
        if (book.getYear() >= BOOK_YEAR_OVER_2010) {
            return bookPrice - (bookPrice * ((double) BOOK_YEAR_OVER_2010_DISCOUNT / 100));
        }
        return bookPrice;
    }
}
