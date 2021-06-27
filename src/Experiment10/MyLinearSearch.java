package Experiment10;

import java.util.Scanner;

public class MyLinearSearch {
    public boolean linearSearch(int[] arr, int searchElement) {
        boolean response = false;
        for (int j : arr) {
            if (j == searchElement) {
                response = true;
                break;
            }
        }
        return response;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements present in the array");
        int numberOfElements = scanner.nextInt();
        int[] elements = new int[numberOfElements];
        System.out.println("\nNow enter the elements in a single line add space after entering each element.");
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            elements[i] = element;
        }
        System.out.println("Enter the number to be searched");
        int searchElement = scanner.nextInt();
        MyLinearSearch obj = new MyLinearSearch();
        boolean result = obj.linearSearch(elements, searchElement);
        if (result) {
            System.out.println("Number was found in the array");
        } else {
            System.out.println("Number was not found in the array.");
        }
    }
}
