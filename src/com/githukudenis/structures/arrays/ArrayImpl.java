package com.githukudenis.structures.arrays;

public class ArrayImpl {
    public static String [] students = new String[10];

    public static void printArray(String[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String [] args) {
//        printArray(students);
//
//        // Get an item inside an array
//        System.out.println(getItem(4));

        // Insert item inside an array
        insertItem("A", 0);
        insertItem("B", 1);
        insertItem("C", 2);
        insertItem("D", 3);
        insertItem("E", 4);
        insertItem("F", 5);
        insertItem("G", 6);
        insertItem("H", 7);
        insertItem("I", 8);
        insertItem("J", 9);
        insertItem("K", 10);


        printArray(students);
        deleteItem(8);
        printArray(students);

        reverseArray();

    }

    public static String getItem(int index) {
        return students[index];
    }

    public static void deleteItem(int index) {
        if (index >= students.length) {
            System.out.println("Invalid index");
            return;
        }

        students[index] = null;
        System.out.println("Item at index" + index + " deleted!");
    }

    public static void insertItem(String item, int index) {
        if (index < 0 || students.length <= index) {
            System.out.println("Invalid index.");
            return;
        }
        students[index] = item;
    }
    
    public static void reverseArray() {
        if (students.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int index = students.length - 1; index >= 0; index--) {
            System.out.print(students[index]);
            if (index > 0) {
                System.out.print(" -> ");
            }
        }
    }
}
