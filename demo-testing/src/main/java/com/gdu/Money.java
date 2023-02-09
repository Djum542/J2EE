package com.gdu;

import java.beans.Expression;

public class Money {
    protected int amount;
    private String currency;
    
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    /**
     * @param testMulti
     * @return
     */
    public Money times(int testMulti){
       return times(testMulti);
    }
    public  String currency(){
        return currency();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
       // return super.equals(obj);
       Money money = (Money)obj;
       //return this.amount == money.amount && this.getClass().equals(obj.getClass());
    return this.amount == money.amount && this.currency().equals(obj);
    }
    
    public static Money dollar(int i){
        return new Dollar(i, "USD");

    }
    public static CHF CHF(int i) {
        return new CHF(i, "CHF" );
    }
    /**
     * @param mul
     * @return
     */
   
    public Money plus(int plu) {
        return new Money(plu+this.amount, this.currency);
    }
    /**
     * @param pl
     * @return
     */
    public Expression plus(Money pl) {
        return plus(pl);
    }
    public static Money CHF(int i, String string) {
        return null;
    }
    
}
