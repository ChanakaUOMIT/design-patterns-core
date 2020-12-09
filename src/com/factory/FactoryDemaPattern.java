package com.factory;

public class FactoryDemaPattern {
    public static void main(String[] args){
        System.out.println("Factory Design Pattern");
//        HuaweiPhone hp=new HuaweiPhone();
        PhoneFactory phoneFactory = new PhoneFactory();

        Phone myPhone=phoneFactory.getPhone("low price");
        myPhone.showSpec();

    }
}
