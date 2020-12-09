package com.learning;

public class Main {

    public static void main(String[] args) {
        //class concept
	    User user = new User("Chanaka");
        user.sayHello();

        //interface concept
        TaxCalculator calculator= getCalculator();
        calculator.calculateTax();

        //encapsulation concept
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        //abstract concept
        var mailService = new MailService();
        mailService.sendEmail();
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
