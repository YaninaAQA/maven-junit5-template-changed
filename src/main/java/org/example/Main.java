package org.example;


public class Main {
    public static void main(String[] args) {

        // task 1

        Client Client1 = new Client("Ivanova", 1000.50, 12345);
        Client Client2 = new Client("Petrov", 23.55, 67891);
        Client Client3 = new Client("Sidorov", 15000.43, 32165);

        System.out.println(Client3.printWord());
        Client1.setA(5);
        Client1.setB(3);
        System.out.println(Client1.difference());

        // task 2

        Phone Phone1 = new Phone(123.4, "Motorola");
        System.out.println(Phone1.getModel());
        System.out.println(Phone1.getNumber());


    }
}
