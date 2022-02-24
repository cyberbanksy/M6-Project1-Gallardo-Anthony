package com.company;

public class ArrayFunReverselt {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 9, 11};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] reversed = new int [numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - (i + 1)];
        }
        for (int i = 0; i <reversed.length; i++) {
            System.out.println(reversed[i]);
        }

    }

}




