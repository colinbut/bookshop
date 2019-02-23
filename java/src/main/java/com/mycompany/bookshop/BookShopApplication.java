/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

import com.mycompany.bookshop.model.Book;
import com.mycompany.bookshop.model.BookShop;
import com.mycompany.bookshop.model.Checkout;
import com.mycompany.bookshop.model.Money;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BookShopApplication {

    public static void main(String[] args) {
        Checkout checkout = new Checkout(new BookShop());

        checkout.checkoutBooks(
            new Book("The Terrible Privacy of Maxwell Sim", new Money(BookShop.CURRENCY, new BigDecimal(13.14)), 2010),
            new Book("Three Men in a Boat", new Money(BookShop.CURRENCY, new BigDecimal(12.87)), 1889));

        checkout.checkoutBooks(
            new Book("The Still Life With Woodpecker", new Money(BookShop.CURRENCY, new BigDecimal(11.05)), 1980),
            new Book("Three Men in a Boat", new Money(BookShop.CURRENCY, new BigDecimal(12.87)), 1889),
            new Book("Great Expectations", new Money(BookShop.CURRENCY, new BigDecimal(13.21)), 1861));

        checkout.checkoutBooks(
            new Book("The Terrible Privacy of Maxwell Sim", new Money(BookShop.CURRENCY, new BigDecimal(13.14)), 2010),
            new Book("Three Men in a Boat", new Money(BookShop.CURRENCY, new BigDecimal(12.87)), 1889),
            new Book("Great Expectations", new Money(BookShop.CURRENCY, new BigDecimal(13.21)), 1861));
    }
}
