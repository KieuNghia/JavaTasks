package com.epam.tal5.kieu.Labs1;


public class array_inverter_optimized {


    public static void ArrayInverter(int[] arr) {

        for (int k = arr.length / 2 - 1; k >= 0; k--) {

            int tmp = arr[k];

            arr[k] = arr[arr.length - k - 1];

            arr[arr.length - k - 1] = tmp;

        }

    }
}
