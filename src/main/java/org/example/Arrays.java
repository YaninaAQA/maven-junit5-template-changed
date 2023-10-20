package org.example;

/**
 * Hello world!
 */
public class Arrays {
    public static void main(String[] args) {

        // task 1.1

        int[] myNewArray = new int[5];
        myNewArray[0] = 2;


        for (int i = 0; i < myNewArray.length; i++) {
            System.out.println(myNewArray[i]);
        }

        // task 1.2

        String[] vegetables = {"Tomato", "Cucumber", "Pumpkin"};

        Arrays strings = new Arrays();


        for (int i = 0; i < vegetables.length; i++) {
            System.out.println(vegetables[i]);
        }

        // task 2

        String str = "Good morning!";
        char[] charArray = str.toCharArray();
        char compare = 'm';
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == compare) {
                System.out.println("Char was found");
                break;
            }
        }

        int i = 0;
        while (i < charArray.length) {
            if (charArray[i] == compare) {
                System.out.println("Char was wound again");
            }
            i++;
        }


    }

}

