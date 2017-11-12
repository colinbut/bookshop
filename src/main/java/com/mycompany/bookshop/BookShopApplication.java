/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BookShopApplication {

    public static void main(String[] args) {
        Checkout checkout = new Checkout(new BookShop());

        checkout.checkoutBooks(
            new Book("The Terrible Privacy of Maxwell Sim", 13.14, 2010),
            new Book("Three Men in a Boat", 12.87, 1889));

        checkout.checkoutBooks(
            new Book("The Still Life With Woodpecker", 11.05, 1980),
            new Book("Three Men in a Boat", 12.87, 1889),
            new Book("Great Expectations", 13.21, 1861));

        checkout.checkoutBooks(
            new Book("The Terrible Privacy of Maxwell Sim", 13.14, 2010),
            new Book("Three Men in a Boat", 12.87, 1889),
            new Book("Great Expectations", 13.21, 1861));
    }
}
