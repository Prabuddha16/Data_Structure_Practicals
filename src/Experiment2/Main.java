package Experiment2;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static int getNumber(LinkedList<Integer> list) {
        StringBuilder result = new StringBuilder();
        int index = 0,size = list.size();
        while(size != 0) {
            result.append(list.get(index).toString());
            size -= 1;
            index += 1;
        }
        return Integer.parseInt(result.toString());
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
        int result = getNumber(elementList);
        System.out.println("\nThe number formed from the elements of the linked list is " + result);
    }
}

