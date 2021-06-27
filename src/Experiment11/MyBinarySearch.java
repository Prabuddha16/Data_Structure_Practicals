package Experiment11;

import java.util.Scanner;
public class MyBinarySearch {
    public boolean binarySearch(int low, int high, int searchElement, int[]
            elements) {
        if (low > high) {
            return false;
        }
        int mid = (low + high) / 2;
        if (elements[mid] == searchElement) {
            return true;
        } else if (elements[mid] < searchElement) {
            return binarySearch(mid + 1, high, searchElement, elements);
        } else {
            return binarySearch(low, mid - 1, searchElement, elements);
        }
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
        MyBinarySearch obj = new MyBinarySearch();
        boolean result = obj.binarySearch(0, elements.length - 1, searchElement,
                elements);
        if (result) {
            System.out.println("Number was found in the array");
        } else {
            System.out.println("Number was not found in the array.");
        }
    }
}
