package org.example;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

        class dee {

        }

        dee dd = new dee();
        dee ddd = new dee();
        System.out.println(dd.hashCode() == ddd.hashCode());

        System.out.println(dd.equals(ddd));
        Objects.hash();

        System.out.println(21/2);
        System.out.println((int)Math.ceil((double) 21 /2));

        int[] s = {1, 2, 3};
        System.out.println(s[s.length/2]);*/

        // int size = 98;

        // int gg = size/2;

        /*int size = 30;




        int startIndex = 0;
        int stopIndex = (size/2) - 1;
        int step = stopIndex + 1;


        for (int i = 0; i < size; i++){
            System.out.println("Size = " + size);
            System.out.println("startIndex = " + startIndex);
            System.out.println("stopIndex = " + stopIndex);

            // sets stop index to the next index after the current stop index
            startIndex = stopIndex + 1;
            // recalibrates the size of the remaining half array
            size = size - step;
            // halves the step count
            step = size/2;
            // sets the stop index to the last index of the first half of the remaining half array
            stopIndex = stopIndex + step;
            // starts checking process again

        }*/

        // Solution sol = new Solution();
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, -89};
        int[] y = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Level1Solution.solution(x, y));
    }
}