package org.example;

public class DivisibleCheck {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 15, 16, 19, 33, 66};
        System.out.println("Divisible of 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
