package com.gdu;

public abstract class Money {
    protected int amount;
    public  abstract Money times(int testMulti);
    public abstract Money currency();
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
       // return super.equals(obj);
       Money money = (Money)obj;
       return this.amount == money.amount && this.getClass().equals(obj.getClass());
    }
    // protected Money times(int ntime){
    //     return new Money() {
            
    //     };
    // }
    public static Dollar dollar(int i){
        return new Dollar(0);

    }
    public static CHF chf(){
        return new CHF();

    }
    public static Dollar Dollar(int i) {
        return null;
    }
    public static CHF CHF(int i) {
        return null;
    }
}
