package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creating an array of 15 items
        int[] array = {45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};

        // Displaying the initial view of the array
        System.out.println("Starting view of the array: " + Arrays.toString(array));

        // Sorting an array by insertion algorithm
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Shifting array elements that are larger than key
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        // Displaying a sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        // Binary search
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                index = mid;
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Displaying the search result
        if (index != -1) {
            System.out.printf("Index of the number %d in the sorted array: %d%n", target, index);
        } else {
            System.out.printf("Number %d is not found in array.", target);
        }

        scanner.close();
    }
}

