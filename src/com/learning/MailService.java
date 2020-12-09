package com.learning;

public class MailService {
    public void sendEmail(){
        connect(1);
        authenticate();
        //send email
        System.out.println("Mail Send Successfully");
        disconnect();

    }

    private void connect(int timeout){
        System.out.println("Timeout : "+timeout);
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticated");
    }
}
