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


        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";

        int[] myArray = new int[10];

        String[] surnames = {
                "Ivanov", "Petrov", "Sidorov"
        };


    }
}
