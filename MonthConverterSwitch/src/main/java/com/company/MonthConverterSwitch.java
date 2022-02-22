package com.company;

import java.util.Scanner;

public class MonthConverterSwitch {
    // type pvsm tab to produce the following line
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 12: ");
        // convert UserInput into an int
        int monthNumber = Integer.parseInt(scan.nextLine());
        // convert monthNumber into a month of the year and print it out to the screen switch (monthNumber)
       switch(monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
          //Error if user inputs numbers outside parameters.
            default:
                System.out.println("You entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }




    }
}
