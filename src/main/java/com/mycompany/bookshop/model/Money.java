/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.bookshop.model;

import lombok.Value;

import java.math.BigDecimal;
import java.util.Currency;

@Value
public class Money {
    private Currency currency;
    private BigDecimal value;

    public Money addMoney(Money money) {
        return new Money(currency, value.add(money.getValue()));
    }

    public Money subtractMoney(Money money) {
        return new Money(currency, value.subtract(money.getValue()));
    }

    public Money multiplyMoney(Money money) {
        return new Money(currency, value.multiply(money.getValue()));
    }
}
