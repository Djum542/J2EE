package com.gdu;

import java.lang.reflect.Constructor;

public class CHF extends Money{
    static int sotien;
    public CHF(){
        this.sotien = sotien;

    }
    public CHF(int i) {
    }
    public CHF times(int number){
        return new CHF(number * this.sotien);
    }
@Override
public boolean equals(Object obj) {
    CHF franc = (CHF)obj;
    return this.sotien == CHF.sotien;
}
@Override
public int currency() {
    // TODO Auto-generated method stub
    //System.out.println("CHF");
    return 0;
}
}
