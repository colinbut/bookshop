/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

import com.mycompany.bookshop.model.Book;
import com.mycompany.bookshop.model.BookShop;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BookShopUTest {

    private BookShop bookShop;

    @Before
    public void setUp(){
        bookShop = new BookShop();
    }

    @Test
    public void givenBookWithYearGreaterThan2010_whenBuyBook_thenBuyBookWith10PercentDiscount() {
        double expectedCostOfBook = 11.826;
        Book book = new Book("The Terrible Privacy of Maxwell Sim ", 13.14, 2010);

        double costOfBook = bookShop.buyBook(book);

        assertThat(costOfBook).isEqualTo(expectedCostOfBook);
    }

    @Test
    public void givenBookWithYearNotGreaterThan2010_whenBuyBook_thenBuyBookWithOriginalPrice() {
        double expectedCostOfBook = 15.16;
        Book book = new Book("The Terrible Privacy of Maxwell Sim ", 15.16, 1851);

        double costOfBook = bookShop.buyBook(book);

        assertThat(costOfBook).isEqualTo(expectedCostOfBook);
    }

    @Test
    public void givenTotalAmountOfBookWorthOver30Pounds_whenBuyBooks_thenGet5PercentDiscountOnTheTotal() {
        double expectedCostOfBook = 35.27;

        Book book1 = new Book("Still Life With Woodpecker", 11.05, 1980);
        Book book2 = new Book("Three Men in a Boat", 12.87, 1889);
        Book book3 = new Book("Great Expectations", 13.21, 1861);

        double costOfBooks = bookShop.buyBooks(Arrays.asList(book1, book2, book3));

        assertThat(costOfBooks).isEqualTo(expectedCostOfBook);
    }
}
