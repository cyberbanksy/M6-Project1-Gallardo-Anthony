package com;

import java.util.Scanner;

public class ArrayFun5Words{
        public static void errorMessage(String msg){
            System.out.println("an error has occurred. + msg");
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] numbers = new String[5];
            String stringIn;

            // Read in 5 ints
            for (int i = 0; i < numbers.length; i++) {

                System.out.println("Please enter a word: ");
                stringIn = scanner.nextLine();
                numbers[i] = (stringIn);
                errorMessage("What kind of word was that?");
            }
            //System.out.println(Arrays.toString(numbers));
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

        }
}
