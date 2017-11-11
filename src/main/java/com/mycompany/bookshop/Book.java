/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop;

public class Book {

    private String title;
    private double price;
    private int year;

    public Book(String title, double price, int year) {
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
