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

        MathUtils calc = new MathUtils();
        System.out.println(calc.square(2.3f));

        Solver solver = new Solver();
        System.out.println(solver.numberOfRoots(-5, 6, 15));



    }
}
