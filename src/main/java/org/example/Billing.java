package org.example;

import java.util.ArrayList;
import java.time.LocalDateTime;
// import the LocalDateTime class

public class Billing {
    private String currency;

    private Item[] items;
    private ArrayList<Item> itemArrayList;

    public static void billDate() {
        LocalDateTime myObj = LocalDateTime.now();  // Create a date object
        System.out.println("Bill Date:" + myObj);  // Display the current date

    }

    public void intiData() {
        items = new Item[]{
                new Item("Apple", 1.5, 2.0, 1),
                new Item("Banana", 1.5, 1, 2.5),
                new Item("Apple", 1.5, 2.0, 1),
                new Item("Apple", 1.5, 2.0, 1),
                new Item("Apple", 1.5, 2.0, 1),
        };

        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("Apple ", 3.5, 2.0, 2));
        itemArrayList.add(new Item("banana", 1.5, 2.0, 1));
        itemArrayList.add(new Item("mango ", 1.0, 2.0, 3));
        itemArrayList.add(new Item("orange", 2.6, 2.0, 1));
        itemArrayList.add(new Item("cherry", 2.5, 3.0, 2));
        itemArrayList.add(new Item("lime  ", 1.5, 1.0, 2));
        itemArrayList.add(new Item("Apple ", 1.5, 4.0, 2));

    }

    public void print() {
        System.out.println("\t\t\t|" + " \t  ItemName" + "\t\t\t|" + "\t\tprice" + "\t\t|" + " \t Amount" + "\t\t\t|" + " \t Quantity" + "\t\t|" + " \t total");
        double total =0;
        double itemTax;
        double itemTotal = 0;
        double tax = .16;
        for (int i = 0; i < itemArrayList.size(); i++) {
             itemTotal = itemArrayList.get(i).getPrice() * itemArrayList.get(i).getQuantity();
            System.out.println(i + 1 + "\t\t\t|\t\t" + itemArrayList.get(i).getItemName() + "\t\t\t|\t\t" + itemArrayList.get(i).getPrice() + "\t\t\t|\t\t" + itemArrayList.get(i).getAmount() + "\t\t\t|\t\t" + itemArrayList.get(i).getQuantity() + "\t\t\t|\t\t" + itemArrayList.get(i).getPrice() * itemArrayList.get(i).getQuantity());

            total = total+itemTotal;

        }

        itemTax =(( total + ( total  * tax)));
        System.out.println("total ="+total );

        System.out.println("total with tax ="+ itemTax);
        System.out.println("**********************************************************");
        System.out.println("\t\t\t\t" + "Thanks for your visit");
        }
    }








