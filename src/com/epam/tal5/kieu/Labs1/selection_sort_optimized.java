package com.epam.tal5.kieu.Labs1;


public class selection_sort_optimized {


        public static void sort(int[] arr) {

            for (int barrier = 0; barrier < arr.length - 1; barrier++) {

                for (int index = barrier + 1; index < arr.length; index++) {

                    if (arr[barrier] > arr[index]) {

                        int tmp = arr[index];

                        arr[index] = arr[barrier];

                        arr[barrier] = tmp;

                    }

                }

            }

        }

    }


