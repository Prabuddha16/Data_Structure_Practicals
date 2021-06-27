package Experiment1;
//WAP To Print all the duplicate elements present in the given array
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements present in the array");
        int numberOfElements = scanner.nextInt();
        int[] elements = new int[numberOfElements];
        System.out.println("\nNow enter the elements in a single line add space after entering each element.");
        for(int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            elements[i] = element;
        }
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : elements) {
            if (map.containsKey(element)) {
                count = map.get(element);
                map.put(element, count + 1);
            } else {
                map.put(element, 1);
            }
        }
        System.out.println();
        boolean areThereDuplicates = false;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                areThereDuplicates = true;
            }
        }
        if(!areThereDuplicates) {
            System.out.println("There are no duplicates present in the given array.");
        }
    }
}
