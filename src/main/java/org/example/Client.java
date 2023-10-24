package org.example;

public class Client {
    private String name;
    private double accountBalance;
    private int personalCode;

    private int a;
    private int b;

    public Client(String name, double accountBalance, int personalCode) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.personalCode = personalCode;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String printWord() {
        return "Tere";
    }

    public int difference() {
        return a - b;
    }


}
