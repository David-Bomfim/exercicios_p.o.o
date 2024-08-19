package org.example;

public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice(1, "Mousepad", 10, -50.0f);

        System.out.println("Valor total = " + invoice.getInvoiceAmount());


    }
}