package Experiment15;

import java.util.Arrays;
import java.util.Scanner;
public class MyMergeSort {
    void merge(int arr[], int l, int m, int r)
    {
        int size1 = m - l + 1;
        int size2 = r - m;
        int L[] = new int[size1];
        int R[] = new int[size2];
        for (int i = 0; i < size1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < size2; ++j)
            R[j] = arr[m + 1 + j];
        int index1 = 0, index2 = 0;
        int mergedIndex = l;
        while (index1 < size1 && index2 < size2) {
            if (L[index1] <= R[index2]) {
                arr[mergedIndex] = L[index1];
                index1++;
            }
            else {
                arr[mergedIndex] = R[index2];
                index2++;
            }
            mergedIndex++;
        }
        while (index1 < size1) {
            arr[mergedIndex] = L[index1];
            index1++;
            mergedIndex++;
        }while (index2 < size2) {
        arr[mergedIndex] = R[index2];
        index2++;
        mergedIndex++;
    }
    }
    void sort(int arr[], int low, int high)
    {
        if (low < high) {
            int m = low + (high - low)/2;
            sort(arr, low, m);
            sort(arr, m + 1, high);
            merge(arr, low, m, high);
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
        MyMergeSort obj = new MyMergeSort();
        obj.sort(elements,0,elements.length - 1);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(elements));
    }
}
