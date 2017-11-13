/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

import com.mycompany.bookshop.model.Book;
import com.mycompany.bookshop.model.BookShop;
import com.mycompany.bookshop.model.Money;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
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
        Book book = new Book("The Terrible Privacy of Maxwell Sim ", new Money(BookShop.CURRENCY, new BigDecimal(13.14)), 2010);

        Money costOfBook = bookShop.buyBook(book);

        assertThat(costOfBook.getValue().doubleValue()).isEqualTo(expectedCostOfBook);
    }

    @Test
    public void givenBookWithYearNotGreaterThan2010_whenBuyBook_thenBuyBookWithOriginalPrice() {
        double expectedCostOfBook = 15.16;
        Book book = new Book("The Terrible Privacy of Maxwell Sim ", new Money(BookShop.CURRENCY, new BigDecimal(15.16)), 1851);

        Money costOfBook = bookShop.buyBook(book);

        assertThat(costOfBook.getValue().doubleValue()).isEqualTo(expectedCostOfBook);
    }

    @Test
    public void givenTotalAmountOfBookWorthOver30Pounds_whenBuyBooks_thenGet5PercentDiscountOnTheTotal() {
        double expectedCostOfBook = 35.27;

        Book book1 = new Book("Still Life With Woodpecker", new Money(BookShop.CURRENCY, new BigDecimal(11.05)), 1980);
        Book book2 = new Book("Three Men in a Boat", new Money(BookShop.CURRENCY, new BigDecimal(12.87)), 1889);
        Book book3 = new Book("Great Expectations", new Money(BookShop.CURRENCY, new BigDecimal(13.21)), 1861);

        Money costOfBooks = bookShop.buyBooks(Arrays.asList(book1, book2, book3));

        assertThat(costOfBooks.getValue().doubleValue()).isEqualTo(expectedCostOfBook);
    }
}
