package com.epam.tal5.kieu.Labs1;

import java.util.Arrays;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/16/2015.
 */
public class Executor {


    public static void main(String[] args) {

        int[] array1 = {8, 7, 4, 6, 5, 1, 2, 3, 9, 0};

        System.out.println(Arrays.toString(array1));

        selection_sort_optimized.sort(array1);

        System.out.println(Arrays.toString(array1));


    }

}
