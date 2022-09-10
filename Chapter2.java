package Chapter2;

import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {

        // declaring a variable
        int yourNumber;

        // assign the value 10 to the variable yourNumber
        yourNumber = 10;

        System.out.println("Your number is:" + yourNumber);

        // declare and assign - I like this way
        int myFavoriteNumber = 42;

        System.out.println("My favorite number is: " + myFavoriteNumber);

        double numberWithADecimal = 7.7;

        yourNumber = 12;
        // a double can hold an int
        numberWithADecimal = 12.1;

        // Java doesn't care about variable names
        // People care about your variable names

        int a = 10;
        int b = 20;
        int c = 30;


        // but int can't hold a double
        // yourNumber = 7.7;

        numberWithADecimal = yourNumber;

        System.out.println("Number with a decimal's value is: " + numberWithADecimal);

        System.out.println("Your number is:" + yourNumber);
        // Section 2 - Arithmetic
        // Please excuse my dear aunt sally
        // Parenthesis Exponents ( Multiplication Division ) ( Addition Subtraction )

        System.out.println("What is 5 - 2 + 3");
        System.out.println(5 - 2 + 3);
        System.out.println("95% of people can't figure this one out: 9 / 3 * 3 + 2");
        System.out.println(9 / 3 * 3 + 2);

        myFavoriteNumber = 10 + 2;
        myFavoriteNumber = myFavoriteNumber + 10;
        // Combined assignment operator
        myFavoriteNumber += 10;

        // not a combined assignment operator - this will set the value to Positive 10
        myFavoriteNumber =+ 10;

        myFavoriteNumber = yourNumber * 3 + 6;
        System.out.println("My favorite number is now: " + myFavoriteNumber);

        // Integer division gives integer results - % is the modulus operator, gives the remainder
        System.out.println("5 / 2 == " + 5 / 2 + " with a remainder of: " + 5 % 2 );

        // to get a double result from division, one or both need to be a double
        double answer = 5.0 / 2;

        System.out.println("5 / 2 with a decimal result is: " + answer);

        // to treat a value as a double, you can 'cast' it as a double with (double)
        double myFavoriteNumberDividedByYourFavoriteNumber = (double)myFavoriteNumber / yourNumber;

        System.out.println(myFavoriteNumberDividedByYourFavoriteNumber);

        String firstName = "Eric";
        String lastName = "Charnesky";

        // we're not "adding" we're concatenating

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        String ericsNameAndFavoriteNumber = fullName + " " + myFavoriteNumber;

        System.out.println(ericsNameAndFavoriteNumber);

        // the backslash is the 'escape' character - means the next letter is special
        System.out.println("My friend O'shane said \"Hey Eric!\"");

        // \n new line - goes down a line
        System.out.println("New Line == \n \\n");

        // \t for tab
        // Spaces work just fine, don't have to use tabs (\t) if you don't want too.
        System.out.println("My Coffee Menu:");
        System.out.println("$1\t\t1-Coffee");
        System.out.println("$1.5\t2-Espresso");
        System.out.println("$2\t\t3-Latte");

        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        System.out.println("Please enter your name");

        System.out.println("Hi there " + name);

        System.out.println("How many coffees do you want to buy today?");
        // don't use this nextInt() - it causes problems later
        //int coffeesForToday = keyboard.nextInt();

        // I always recommend Integer.parseInt
        int coffeesForToday = Integer.parseInt (keyboard.nextLine());

        System.out.println("How much does a coffee cost?");
        double costPerCoffee = Double.parseDouble(keyboard.nextLine());

        System.out.println("That will cost you $" + coffeesForToday * costPerCoffee);


















    }
}
