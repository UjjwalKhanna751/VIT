package com.example.vit.javaexms;

public class DemoLamdas {
    public static void main(String[] args) {
        IMessage message = () ->{
            System.out.println("Sending message from lamdas");
        };
        message.sendmessage();

    }
}
