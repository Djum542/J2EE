package com.gdu;

import java.beans.Expression;
import java.text.NumberFormat;

public class Bank extends Money{

    private static final boolean USD = false;
    double currency = 5;
    public Bank(int amount, String currency) {
        super(amount, currency);
    }

	/**
	 * @param sum
	 * @param string
	 * @return
	 */
	public Money reduce(Expression source, String string) {
        // if (!USD) {
        //     Money.CHF(amount*2, "USD");
        // }
        // if (source instanceof Money) {
        //     return (Money) source;
        // }
        // Sum sum = (Sum).source;
        // int amount = sum.auged.amount + sum.addend.amount;
        //     return new Money(amount, string)
		// return reduce(sum, string);
        // return Money.dollar(10);
        return source.reduce(source,string);
	}
    // NumberFormat format = NumberFormat.getCurrencyInstance();
    // String str = format.format(currency);
    public int addrate(String from, String to){
       return from.equals("CHF") && to.equals("USD")? 2: 1;
    }
}
