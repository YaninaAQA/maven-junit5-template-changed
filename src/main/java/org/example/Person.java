package org.example;

public class Person {
    String name;
    int age;
    String newName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void celebrateBirthday() {
        this.age += 1;
        System.out.println("Happy Birthday!");
    }

    public void changeName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
