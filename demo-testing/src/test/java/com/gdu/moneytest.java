package com.gdu;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
public class moneytest {
    @Test
   public void testNhando(){
        Dollar five = Money.Dollar(5);
        //Dollar tendollar = five.nhan(2);
    assertEquals(Money.Dollar(10), five.nhan(2));    
        //tendollar =  five.nhan(3);
    assertEquals(Money.Dollar(15), five.nhan(3));
}
@Test
public void sosanh() {
    Dollar product = new Dollar(5);
    Dollar duc = product.nhan(2);
    assertEquals(10, duc.sotien);
    duc = product.nhan(3);
    assertEquals(15, duc.sotien);


}
@Test
public void testMulti(){
    CHF chf = Money.CHF(5);
   // CHF dodo = chf.times(2);
    assertEquals(Money.CHF(10), chf.times(2));
    //assertEquals(Money.CHF(5), new CHF(5));
    assertNotEquals(Money.CHF(5), chf.times(2));
    // Dollar with franc
    assertNotEquals(new CHF(5), new Dollar(5));
}
@Test 
public void testCurreny(){
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.CHF(0).currency());
}
}
