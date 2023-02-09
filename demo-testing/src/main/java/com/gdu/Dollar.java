package com.gdu;

public class Dollar extends Money{
    
    /**
     * @param sotien
     * @param string
     */
    public Dollar(int amount, String currency){
        super(amount, currency);
    }
    // public Dollar nhan(int sonhan) {
    //    // this.sotien = this.sotien * sonhan;
    //     return Money.dollar(sonhan * this.sotien);
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     // TODO Auto-generated method stub
    //     return super.equals(obj);
    // }
    // @Override
    // public String currency() {
    //     // TODO Auto-generated method stub
    //     System.out.println("USD");
        
    //     return currency();
    // }
}
