package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Billing billing = new Billing();
        Billing total = new Billing();
        System.out.println("       Billing system \n**********************************************************");
        billing.billDate();  // format date 2022-05-2012 12:00
        System.out.println("Banch:City Mall");
        System.out.println("Banch Mobile:+962xxxxxxx");
        System.out.println("**********************************************************");

        billing.intiData();
        billing.print();


        }
    }
