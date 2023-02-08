package com.gdu;

public class Dollar extends Money{
    int sotien;
    public Dollar(int sotien){
        this.sotien = sotien;
    }
    public Dollar nhan(int sonhan) {
       // this.sotien = this.sotien * sonhan;
        return new Dollar( sonhan * this.sotien);
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    public Money currency() {
        // TODO Auto-generated method stub
        //System.out.println("USD");
        return new Dollar(1);
    }
    @Override
    public Money times(int testMulti) {
        // TODO Auto-generated method stub
        return new Dollar(testMulti);
    }
   
}
