/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

public class BookShop {

    public double buyBook(Book book) {
        if (book.getYear() >= 2010) {
            return book.getPrice() - (book.getPrice() * 0.10);
        }
        return book.getPrice();
    }
}
