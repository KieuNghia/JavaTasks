package com.epam.tal5.kieu.Task2;


import java.util.Arrays;

import java.util.Scanner;


public class Methods {

    public static void task1(int[] n) { //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        System.out.println("Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        int max = 2;
        int min = 10;
        int maxPos = 0;
        int minPos = 0;
        for (int i = 0; i < n.length; i++) {
            int length = (int) Math.log10(n[i]) + 1;
            if (length > max) {
                max = length;
                n[i] = maxPos;
                continue;

            } else {
                if (length < min) {
                    min = length;
                    n[i] = minPos;
                    continue;
                }
            }

        }

        System.out.println("max " + n[maxPos]);
        System.out.println("min " + n[minPos]);


    }

    public static void task2(int[] n) { //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.println("Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
        int max = 0;
        int min = 0;
        int maxPos = 0;
        int minPos = 0;
        int temp = 0;
        int temp2 = 0;

        int[] lengthMas = new int[n.length];
        for (int i = 0; i < n.length - 1; i++) {
            int length = (int) Math.log10(n[i]) + 1;
            lengthMas[i] = length;

        }

        for (int i = 0; i < n.length - 1; i++) {
            if (lengthMas[i] > lengthMas[i + 1]) {
                temp = lengthMas[i];
                lengthMas[i] = lengthMas[i + 1];
                lengthMas[i + 1] = temp;
                temp2 = n[i];
                n[i] = n[i + 1];
                n[i + 1] = temp2;

            }


        }
        System.out.println("task 2");
        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length / 2; i++) {
            int tempReverse = n[i];
            n[i] = n[n.length - i - 1];
            n[n.length - i - 1] = tempReverse;
        }

        System.out.println("task 2 reversed");
        System.out.println(Arrays.toString(n));


    }

    public static void task3(int[] n) { //3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        System.out.println("Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        System.out.println(Arrays.toString(n));

        int max = 2;
        int min = 10;
        int maxPos = 0;
        int minPos = 0;
        for (int i = 0; i < n.length - 1; i++) {
            int length = (int) Math.log10(n[i]) + 1;
            if (length > max) {
                max = length;
                n[i] = maxPos;
                continue;

            } else {
                if (length < min) {
                    min = length;
                    n[i] = minPos;
                    continue;
                }
            }

        }

        int average = max / min;
        System.out.println("Больше среднего");
        System.out.println();
        for (int i = 0; i < n.length - 1; i++) {

            int length = (int) Math.log10(n[i]) + 1;
            if (length > average) {
                System.out.print(n[i] + "(" + length + ")");
            }

        }
        for (int i = 0; i < n.length - 1; i++) {
            System.out.println("Меньше среднего");
            System.out.println();
            int length = (int) Math.log10(n[i]) + 1;
            if (length < average) {
                System.out.print(n[i] + "(" + length + ")");
            }

        }


    }


    public static void task4(int[] n) { //4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
        String[] array = new String[n.length];
        String number;
        String current;
        String digit;
        int i;
        int j;
        for (i = 0; i < n.length; i++) {
            current = "";
            number = Integer.toString(n[i]);
            for (j = 0; j < number.length(); j++) {
                digit = String.valueOf(number.charAt(j));
                if (current.contains(digit)) {
                    continue;
                } else {
                    current = current + digit;
                }
            }
            array[i] = current;
        }
        digit = array[0];
        j = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i].length() < digit.length()) {
                digit = array[i];
                j = i;
            }

        }
        System.out.println(" //4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.");
        System.out.println("Число с минимальным колличеством различных цифр: " + n[j]);


    }


    public static void task5(int[] n) {
        System.out.println("Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.");
        System.out.println(Arrays.toString(n));

        String arrVal;
        int evenNum;
        int oddNum;
        int result;
        for (int k : n) {
            arrVal = Integer.toString(k);
            evenNum = 0;
            oddNum = 0;
            if ((arrVal.length() % 2 == 0) && (k % 2 == 0)) {
                while (k > 0) {
                    result = k % 10;
                    k = k / 10;
                    if (result % 2 == 0) {

                        evenNum++;
                    } else {
                        oddNum++;
                    }

                }

                if (evenNum == oddNum) {
                    System.out.print("Число с равным количеством четных и нечетных цифр ");
                    System.out.print(arrVal + " ");
                }
            }

        }
    }


    public static void task6(int[] n) {

        System.out.println("Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.");
        System.out.println(Arrays.toString(n));


        for (int i = 0; i < n.length; i++) {
            int checker = 0;
            String number = new Integer(n[i]).toString();

            for (int counter = 0; counter < number.length() - 1; counter++) {

                if (number.charAt(counter) < number.charAt(counter + 1)) {

                    checker++;
                    continue;
                } else {
                    break;
                }

            }

            if (checker == number.length() - 1) {
                System.out.println("Искомое число " + number);
            }


        }
    }

    public static void task7(int[] n) {

        System.out.println("Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
        System.out.println(Arrays.toString(n));
        String temp;


        for (int i = 0; i < n.length; i++) {
            temp = "";
            int checker = 0;
            String number = new Integer(n[i]).toString();

            for (int counter = 0; counter < number.length() - 1; counter++) {
                String digit = String.valueOf(number.charAt(counter));

                if (temp.contains(digit)) {

                    continue;
                } else {
                    temp = temp + digit;
                    checker++;
                }

            }

            if (checker == number.length() - 1) {
                System.out.println("Искомое число " + number);
                break;
            }


        }


    }

    public static void task8() {
        System.out.print("Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.");
        System.out.println("Выберите размерность матрицы:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mas = new int[n][n];
        System.out.println("Определите максимальный элемент:");

        Scanner scn2 = new Scanner(System.in);
        int k = scn2.nextInt();

        int counter = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (counter != k) {
                    mas[i][j] = counter++;
                } else {
                    mas[i][j] = k;
                    counter = 1;
                }


            }


        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++)
                System.out.print(mas[i][j] + "  ");
            System.out.println();

        }

        System.out.println("----------------------------");

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length; i++)
                System.out.print(mas[i][j] + "  ");
            System.out.println();


        }
    }


}









