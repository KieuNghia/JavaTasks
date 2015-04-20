package com.epam.tal5.kieu.Task2;

import java.util.*;


public class Task9 {
    public static void masPrint(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++)
                System.out.print(n[i][j] + "  ");
            System.out.println();

        }
    }

    public static int[][] task9() {

        System.out.println("Введите размерность матрицы");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (random.nextInt(n * 2) - n);
            }
        }

        return array;
    }

    public static void task9_1(int[][] n) {
        System.out.print("Какой вид упорядочивания? 0 - столбец, 1 - строка");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();


        if (c == 1) {
            for (int i = 0; i < n.length; i++) {
                Arrays.sort(n[i]);
            }
        } else if (c == 0) {

            for (int i = 0; i < n.length; i++) {
                int[] temp = new int[n[i].length];

                for (int j = 0; j < temp.length; j++) {
                    temp[j] = n[j][i];
                }

                Arrays.sort(temp);

                for (int k = 0; k < temp.length; k++) {
                    n[k][i] = temp[k];
                }

            }

        }


        masPrint(n);


    }

    public static void task9_2_right(int[][] n) {
        masPrint(n);
        System.out.println("Введите позиций для сдвига");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int counter = 0;
        while (counter != k) {
            for (int i = 0; i < n.length; i++) {
                int temp = n[i][n[i].length - 1];
                for (int j = n[i].length - 1; j > 0; j--) {
                    n[i][j] = n[i][j - 1];
                }
                n[i][0] = temp;
            }

            counter++;
        }
        masPrint(n);


    }


    public static void task9_2_left(int[][] n) {
        masPrint(n);
        System.out.println("Введите позиций для сдвига");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int counter = 0;
        while (counter != k) {
            for (int i = 0; i < n.length; i++) {
                int temp = n[i][0];
                for (int j = 1; j < n[i].length; j++) {
                    n[i][j - 1] = n[i][j];
                }
                n[i][n[i].length - 1] = temp;
            }

            counter++;
        }
        masPrint(n);


    }

    public static void task9_2_up(int[][] n) {
        masPrint(n);
        System.out.println("Введите позиций для сдвига");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int counter = 0;
        while (counter != k) {
            for (int i = 0; i < n.length; i++) {
                int temp = n[0][i];
                for (int j = 1; j < n[i].length; j++) {
                    n[j - 1][i] = n[j][i];
                }
                n[n[i].length - 1][i] = temp;
            }
            counter++;
        }
        masPrint(n);


    }

    public static void task9_2_down(int[][] n) {
        masPrint(n);
        System.out.println("Введите позиций для сдвига");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int counter = 0;
        while (counter != k) {for (int i = 0; i < n.length; i++) {
            int temp = n[0][i];
            for (int j = 1; j < n[i].length; j++) {
                n[j - 1][i] = n[j][i];
            }
            n[n[i].length - 1][i] = temp;
        }
            counter++;
        }
        masPrint(n);


    }


    public static void task9_4(int [][] n){ //помогал валентину дебажить код, скопировал с чистой совестью

            System.out.println(n.length);
            for (int i = 0; i < n.length - 1; i++) {
                int sum = 0;
                for (int j = 0; j < n[i].length - 1; j++) {
                    if (n[i][j] > 0 && n[i][j + 1] < 0)  {
                        while (n[i][j + 1] < 0) {
                            sum += n[i][j + 1];
                            j++;
                        }
                        System.out.println("СТрока" + (i + 1) + " - " + sum + " ");
                        break;
                    }
                }

            }
    }


    public static void task9_5_90degree(int [][] n){
        int[][] temp = null;
        temp = new int[n.length][n.length];
        for (int i = 0, i2 = 0; i < n.length; i++, i2++) {
            for (int j = n[i].length - 1, j2 = 0; j >= 0; j--, j2++) {
                temp[j2][i2] = n[i][j];
            }
        }
        masPrint(n);
    }

    public static void task9_5_180degree(int [][] n){
        int[][] temp = null;
        temp = new int[n.length][n.length];
        for (int i = n.length - 1, i2 = 0; i >= 0; i--, i2++) {
            for (int j = n[i].length - 1, j2 = 0; j >= 0; j--, j2++) {
                temp[i2][j2] = n[i][j];
            }
        }
        masPrint(n);
    }

    public static void task9_5_270degree(int [][] n){
        int[][] temp = null;
        temp = new int[n.length][n.length];
        for (int i = n.length - 1, i2 = 0; i >= 0; i--, i2++) {
            for (int j = n[i].length - 1, j2 = 0; j >= 0; j--, j2++) {
                temp[j2][i2] = n[j][i];
            }
        }
        masPrint(n);
    }

    public static void task9_6(int[][] array) {
        double [] avg = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                avg[i] += array[i][j];
            }
            avg[i] = avg[i] / array.length;
        }



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (array[i][j] - Math.floor(avg[i]));
            }
        }
        System.out.println("Avg array" + Arrays.toString(avg));
        masPrint(array);
    }

    public static void  task9_8(int [][] n){


        for (int i = 0; i < n.length; i++) {
            List<Integer> list = new ArrayList<Integer>();

            int counter = 0;

            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] != 0)
                    list.add(n[i][j]);
                else
                    counter++;
            }

            for (int j = 0; j < counter; j++) {
                list.add(0);
            }

            for (int j = 0; j < list.size(); j++) {
                n[i][j] = list.get(j);
            }

            masPrint(n);
        }
    }






    public static void main(String[] args) {
        Task9 task = new Task9();
        int[][] array = task.task9();
        masPrint(array);
        System.out.println("------------------------");
        task9_6(array);



    }


}
