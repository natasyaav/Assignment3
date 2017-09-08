import java.util.Scanner;

/**
 * @author Natasya Virgichalia
 * Date: 09/07/2017
 * CSC-201.
 * Assignment 3, problem 3.26
 * This program prompts the usert to enter an integer and determines whether it is divisible by 5 and 6,
 * whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */
public class divisibleInt {
    /**
     * This method test if an integer is divisible by 5 and 6
     * @param number an integer input by the user
     * @return true if the number can be divided by 5 and 6
     */
    public static boolean divideAnd (int number) {
        return (number%5 == 0 && number%6 == 0);
    }

    /**
     * This method test if an integer is divisible by 5 or 6
     * @param number an integer input by the user
     * @return true if the number can be divided by 5 or 6
     */
    public static boolean divideOr (int number) {
        return (number%5 == 0 || number%6 ==0);
    }

    /**
     * this method test if an integer is divisible by 5 or 6, but not both
     * @param number an integer input by the user
     * @return true if the number can be divided by 5 or 6, but not both
     */
    public static boolean divideBoth (int number) {
        return (number%5 == 0 ^ number%6 == 0);
    }
    public static void main(String[] args) {
        int number = 0;
        boolean intAnd = true;
        boolean intOr = true;
        boolean intBoth = true;

        System.out.println("Enter an integer");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        intAnd = divideAnd(number);
        intOr = divideOr(number);
        intBoth = divideBoth(number);

        System.out.println("Is " + number + " divisible by 5 and by 6? " + intAnd);
        System.out.println("Is " + number + " divisible by 5 or by 6? " + intOr);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + intBoth);
        keyboard.close();
    }

}
