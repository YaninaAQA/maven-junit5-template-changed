package org.example;

public class Solver {

    public int numberOfRoots(int a, int b, int c) {
        int D = b * b - 4 * a * c;

        if (D < 0) {
            return 0;
        } else if (D == 0) {
            return 1;
        } else {
            return 2;
        }
    }

}
