package com.epam.tal5.kieu.Task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Executor {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.println("Введите число n");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();

        } else {
        scanner.next();

        }
        System.out.println("Введите элементы матрицы");
        int[] array = new int[n];

        int i = 0;
        while (i < array.length) {
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("Не число, повторите ввод");
                scanner.next();
            }


        }
        System.out.println(Arrays.toString(array));

        Methods.task1(array);
        Methods.task8();


    }


}





