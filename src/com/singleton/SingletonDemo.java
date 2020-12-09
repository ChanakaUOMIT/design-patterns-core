package com.singleton;

public class SingletonDemo {
    public static  void main(String[] args){
//        WashingMachine wm=new WashingMachine();

        WashingMachine wm = WashingMachine.getInstance();
        wm.showMessage();
    }
}
