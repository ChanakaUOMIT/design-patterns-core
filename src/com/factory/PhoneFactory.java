package com.factory;

public class PhoneFactory {
    public Phone getPhone(String phoneType){
        if(phoneType == null){
            return null;
        }
        else if(phoneType.equalsIgnoreCase("Low Price")){
            return new HuaweiPhone();
        }
        else if(phoneType.equalsIgnoreCase("Middle range price")){
            return new SamsungPhone();
        }
        else if(phoneType.equalsIgnoreCase("Expensive")){
            return new IPhone();
        }
        else{
            return null;
        }
    }
}
