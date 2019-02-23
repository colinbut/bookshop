/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop.model;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

@NoArgsConstructor
public final class BookShop {

    public static final Currency CURRENCY = Currency.getInstance("GBP");

    private static final int BOOK_YEAR_OVER_2010 = 2010;
    private static final int BOOK_YEAR_OVER_2010_DISCOUNT = 10; // in %
    private static final int TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS_DISCOUNT = 5; // in %
    private static final double TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS = 30.00;

    public Money buyBook(Book book) {
        Money bookPrice = book.getPrice();
        if (book.getYear() >= BOOK_YEAR_OVER_2010) {

            return bookPrice.subtractMoney(
                new Money(
                    CURRENCY,
                    bookPrice.getValue().multiply(BigDecimal.valueOf((double)BOOK_YEAR_OVER_2010_DISCOUNT / 100))));
        }
        return bookPrice;
    }

    public Money buyBooks(List<Book> books) {
        Money totalCost = new Money(CURRENCY, BigDecimal.ZERO);

        for (Book book : books) {
            totalCost = totalCost.addMoney(buyBook(book));
        }

        if (totalCost.getValue().doubleValue() > TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS) {
            return totalCost.subtractMoney(
                new Money(
                    CURRENCY,
                    totalCost.getValue().multiply(BigDecimal.valueOf((double) TOTAL_BOOKS_WORTH_MORE_THAN_30_POUNDS_DISCOUNT / 100))));
        }

        return totalCost;
    }
}
