package Experiment12;

import java.util.Arrays;
import java.util.Scanner;
public class MySelectionSort {
    public void selectionSort(int[] arr) {
        int sortedIndex = arr.length;
        int maxElement;
        int maxElementIndex;
        for (int i = 0; i < arr.length; i++) {
            maxElement = arr[0];
            maxElementIndex = 0;
            for (int j = 0; j < sortedIndex; j++) {
                if (maxElement < arr[j]) {
                    maxElement = arr[j];
                    maxElementIndex = j;
                }
            }
            int temp = arr[maxElementIndex];
            sortedIndex--;
            arr[maxElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
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
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(elements));
        MySelectionSort obj = new MySelectionSort();
        obj.selectionSort(elements);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(elements));
    }
}