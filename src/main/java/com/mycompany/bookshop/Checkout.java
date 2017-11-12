/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Checkout {

    private BookShop bookShop;

    public Checkout(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    public void checkoutBooks(Book... books) {

    }
}
