package com.gdu;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.beans.Expression;

import org.junit.Test;
public class moneytest {
    @Test
   public void testNhando(){
        Money five = Money.dollar(5);
        //Dollar tendollar = five.nhan(2);
    assertEquals(Money.dollar(10), five.times(2));    
        //tendollar =  five.nhan(3);
    assertEquals(Money.dollar(15), five.times(3));
}
@Test
public void sosanh() {
    Money product = Money.dollar(5);
    Money duc = product.times(2);
    assertEquals(10, duc.amount);
    duc = product.times(3);
    assertEquals(15, duc.amount);
}
@Test
public void testMulti(){
    CHF chf = Money.CHF(5);
   // CHF dodo = chf.times(2);
    assertEquals(Money.CHF(10), chf.times(2));
    //assertEquals(Money.CHF(5), new CHF(5));
    assertNotEquals(Money.CHF(5), chf.times(2));
    // Dollar with franc
    assertNotEquals(Money.CHF(5), Money.dollar(5));
}
@Test 
public void testCurreny(){
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.CHF(0).currency());
}
@Test
public void testPlus(){
    Money pl = Money.dollar(5);
    Expression sum = pl.plus(pl);
    //assertEquals(Money.dollar(5), plus.plus(0).currency());
    Bank bank = new Bank(0, "USD");
    Money reduced = bank.reduce(sum, "USD");
    assertEquals(Money.dollar(10), reduced);
}

}
