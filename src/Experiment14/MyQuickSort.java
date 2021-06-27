package Experiment14;

import java.util.Arrays;import java.util.Scanner;
public class MyQuickSort {
    public void quickSort(int[] arr, int lower, int upper){
        if(lower >= upper){
            return;
        }
        int pivotIndex = partition(arr, lower, upper);
        quickSort(arr, lower, pivotIndex -1);
        quickSort(arr, pivotIndex +1 , upper);
    }
    private int partition(int[] arr, int lower, int upper) {
        int pivot = arr[lower];
        int down = lower;
        int up = upper;
        while(down < up){
            while(down <= upper && arr[down] <= pivot){
                down = down + 1;
            }
            while(up >= lower && arr[up] > pivot){
                up = up - 1;
            }
            if(down < up){
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        arr[lower] = arr[up];
        arr[up] = pivot;
        return up;
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
        System.out.println(Arrays.toString(elements));MyQuickSort obj = new MyQuickSort();
        obj.quickSort(elements,0,elements.length - 1);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(elements));
    }
}
