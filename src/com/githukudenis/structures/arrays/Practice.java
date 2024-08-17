package com.githukudenis.structures.arrays;

public class Practice {
    public static void main(String[] args) {
        int [] arr = {4, 7, 9, 8, 5 , 6, 0};
        System.out.println("Greatest number: " + greatestNeighbour(arr));
        System.out.println("Sum: " + sum(arr));
        System.out.println("--------Pairs--------");
        printPairs(arr);
    }

    // Find the peak element
    public static int greatestNeighbour(int []arr) {
        // Return the first element if array has length as 1;
        if (arr.length == 1) {
            return arr[0];
        }
        // Return the first element if the element is greater than the second.
        if (arr[0] > arr[1]) {
            return arr[0];
        }

        // Return the last element if it is greater than the second last.
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        /* loop through the list checking if the current element is greater
        than it's neighbours either to the left or right.
         */
        int greatest = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > greatest) greatest = arr[index];

            if (arr[index] > arr[index-1] && arr[index] > arr[index+1] && arr[index] > greatest) {
                greatest = arr[index];
            }
        }
        return greatest;
    }

    // Find the sum of all numbers within an array
    public static int sum(int [] arr) {
        // Create temp value
        int sum = 0;
        int index = 0;
        while (index < arr.length) {
            sum = sum + arr[index];
            index++;
        }
        return sum;
    }

    // Print all pairs
    public static void printPairs(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("[" + arr[i] + arr[j] + "]" + " ");
            }
            System.out.println();
        }
    }
}
