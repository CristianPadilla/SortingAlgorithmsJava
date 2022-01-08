package test;

import domain.SelectionSort;
import domain.SortingAlgorithm;

public class test {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1, 4, 2};
        int[] arr2 = {12, 35, 89, 2, 40, 78, 200, 3};
        int[] arr3 = {1045, 700, 5, 662, 57, 2342};

        //Selection sort
        SortingAlgorithm sorter = new SelectionSort();
        sorter.sort(arr1);
        printArray(arr1);
        sorter.sort(arr2);
        printArray(arr2);
        sorter.sort(arr3);
        printArray(arr3);
    }

    public static void printArray(int[] list) {
        System.out.println("\n");
        for (int element : list) {
            System.out.print(element + " ");
        }

    }
}
