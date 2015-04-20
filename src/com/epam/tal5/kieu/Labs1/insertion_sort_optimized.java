package com.epam.tal5.kieu.Labs1;

import java.util.Arrays;

public class insertion_sort_optimized {


    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int newElementPosition = Arrays.binarySearch(arr, 0, k, newElement);
            newElementPosition = (newElementPosition >= 0) ? newElementPosition : -newElementPosition - 1;

            int lengthToCopy = k - newElementPosition;

            System.arraycopy(arr, newElementPosition, arr, newElementPosition + 1, lengthToCopy);

            arr[newElementPosition] = newElement;
        }
    }
}




