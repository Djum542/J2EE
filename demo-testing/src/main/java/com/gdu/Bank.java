package com.gdu;

import java.beans.Expression;

public class Bank extends Money{

    private static final boolean USD = false;

    public Bank(int amount, String currency) {
        super(amount, currency);
    }

	public Money reduce(Expression sum, String string) {
        if (!USD) {
            Money.CHF(amount*2, "USD")
        }
		return reduce(sum, string);
	}
}
