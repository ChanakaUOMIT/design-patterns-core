package com.learning;

public class Main {

    public static void main(String[] args) {
        var MessageIndicator = new MessageIndicator();
        //class concept
        MessageIndicator.topicDeclaration("Class Concept");
	    User user = new User("Chanaka");
        user.sayHello();

        //interface concept
        MessageIndicator.topicDeclaration("Interface Concept");
        TaxCalculator calculator= getCalculator();
        float rate=calculator.calculateTax();
        System.out.println(rate);

        //encapsulation concept
        MessageIndicator.topicDeclaration("Encapsulation Concept");
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        //abstract concept
        MessageIndicator.topicDeclaration("Abstract Concept");
        var mailService = new MailService();
        mailService.sendEmail();

        //inheritance concept
        MessageIndicator.topicDeclaration("Inheritance Concept");
        var textBox= new TextBox();
        textBox.enable();

        //polymorphism concept
        MessageIndicator.topicDeclaration("Polymorphism Concept");
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
