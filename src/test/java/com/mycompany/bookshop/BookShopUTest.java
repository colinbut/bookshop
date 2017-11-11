/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookShopUTest {

    @Test
    public void givenBookWithYearGreaterThan2010_whenBuyBook_thenBuyBookWith10PercentDiscount() {
        double expectedCostOfBook = 10.89;
        Book book = new Book();

        BookShop bookShop = new BookShop();
        double costOfBook = bookShop.buyBook(book);

        assertThat(costOfBook).isEqualTo(12.0);

    }
}
