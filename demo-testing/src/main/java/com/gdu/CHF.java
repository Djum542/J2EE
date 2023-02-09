package com.gdu;

import java.lang.reflect.Constructor;
import java.util.Currency;

public class CHF extends Money{
   
    /**
     * @param i
     * @param string
     */
    public CHF(int amount, String currency){
        super(amount, currency);
    }
    
// @Override
// public boolean equals(Object obj) {
//     CHF franc = (CHF)obj;
//     return this.sotien == CHF.sotien;
// }
// @Override
// public String currency() {
//     // TODO Auto-generated method stub
//     //System.out.println("CHF");
//     return currency();
// }

}
