package Experiment16;

import java.util.LinkedList;
import java.util.Scanner;public class MySort {
    void sortList(LinkedList list) {
        int[] count = {0,0,0};
        int size = list.size();
        for(int i = 0; i < size;i++) {
            count[(int) list.get(i)]++;
        }
        for(int i = 0; i < size; i++) {
            list.remove(0);
        }
        for(int i = 0; i < 3; i++) {
            while(count[i] != 0) {
                list.add(i);
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements present in the linked list");
        int numberOfElements = scanner.nextInt();
        LinkedList<Integer> elementList = new LinkedList<>();
        System.out.println("\nNow enter the elements in a single line add space after entering each element.");
        for(int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            elementList.add(element);
        }
        System.out.println("Before Sorting");
        System.out.println(elementList);
        MySort obj = new MySort();
        obj.sortList(elementList);
        System.out.println("After Sorting");
        System.out.println(elementList);
    }
}
