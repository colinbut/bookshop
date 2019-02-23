/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop.model;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Checkout {

    private BookShop bookShop;

    public Checkout(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    public void checkoutBooks(Book... books) {
        Money totalBookCost = bookShop.buyBooks(Arrays.asList(books));
        log.info("Total Cost of books: {} is {}", books, totalBookCost);
    }
}
