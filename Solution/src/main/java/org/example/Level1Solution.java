package org.example;

import java.util.Arrays;

public class Level1Solution {
    public static int solution(int[] x, int[] y) {

        // get sum of arrays
        int sumX = Arrays.stream(x).sum();
        int sumY = Arrays.stream(y).sum();

        // get array sum difference to get the unique ID
        if (x.length > y.length){
            return sumX - sumY;
        }

        return sumY - sumX;
    }
}