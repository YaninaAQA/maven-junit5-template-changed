package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person human = new Person("Ivan", 25);

        human.celebrateBirthday();

        human.changeName("Marja");

        System.out.println(human.getName());

        System.out.println(human.getAge());


    }
}
