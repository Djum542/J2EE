package com.gdu;
/**
 * Sum
 */
import java.beans.Expression;

public class Sum{
    public Money auged;
    public Money addend;
    public Sum(Money auged, Money addend) {
        this.auged = auged;
        this.addend = addend;
    }
    public Money reduce(String to){
        int amount = this.auged.amount + this.addend.amount;
        return reduce(to);
    }
    
}