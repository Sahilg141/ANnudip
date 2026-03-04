//Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(7);
        numbers.add(8);

        int sum = 0;

        // Loop through the ArrayList
        for(int i = 0; i < numbers.size(); i++) {

            // Check if number is even
            if(numbers.get(i) % 2 == 0) {
                sum = sum + numbers.get(i);
            }
        }

        // Print the sum of even numbers
        System.out.println("Sum of even numbers = " + sum);
    }
}

// output

Sum of even numbers = 68