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
        double expectedCostOfBook = 11.826;
        Book book = new Book("The Terrible Privacy of Maxwell Sim ", 13.14, 2010);

        BookShop bookShop = new BookShop();
        double costOfBook = bookShop.buyBook(book);

        assertThat(costOfBook).isEqualTo(expectedCostOfBook);

    }
}
