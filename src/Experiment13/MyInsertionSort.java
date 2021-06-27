package Experiment13;

import java.util.Arrays;
import java.util.Scanner;
public class MyInsertionSort {
    public void insertionSort(int[] arr){
        int unsortedIndex = 1;
        for (int i = unsortedIndex; i < arr.length ; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
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
        MyInsertionSort obj = new MyInsertionSort();
        obj.insertionSort(elements);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(elements));
    }
}