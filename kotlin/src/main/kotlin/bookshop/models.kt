/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bookshop

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

data class Book(val title: String, val price: Money, val year: Int)

data class Money(val currency: Currency, val value: BigDecimal) {

    infix fun addMoney(amount: Money) : Money {
        return Money(currency, value.add(amount.value).setScale(2, RoundingMode.HALF_EVEN))
    }

    infix fun subtractMoney(amount: Money) : Money {
        return Money(currency, value.subtract(amount.value).setScale(2, RoundingMode.HALF_EVEN))
    }
}

