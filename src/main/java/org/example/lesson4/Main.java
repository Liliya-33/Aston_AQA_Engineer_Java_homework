package org.example.lesson4;

import org.example.lesson6.Employee;
import org.example.lesson6.Park;
import org.example.lesson6.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Урок 4
        //Первое задание
        System.out.println("Первое задание:");
        printThreeWords();
        System.out.println("---------------");

        //Второе задание
        System.out.println("Второе задание:");
        checkSumSign(-2, -4);
        System.out.println("---------------");

        //Третье задание
        System.out.println("Третье задание:");
        printColor(6);
        System.out.println("---------------");

        //Четвертое задание
        System.out.println("Четвертое задание:");
        compareNumbers(3, 7);
        System.out.println("---------------");

        //Пятое задание
        System.out.println("Пятое задание:");
        boolean resultSum = checkSumEntryLimit(20, 5);
        System.out.println(resultSum);
        System.out.println("---------------");

        //Шестое задание
        System.out.println("Шестое задание:");
        checkNumberSign(0);
        System.out.println("---------------");

        //Седьмое задание
        System.out.println("Седьмое задание:");
        boolean resultIsNegative = isNegative(-8);
        System.out.println(resultIsNegative);
        System.out.println("---------------");

        //Восьмое задание
        System.out.println("Восьмое задание:");
        printStringForNumber("Привет, мир!", 3);
        System.out.println("---------------");

        //Девятое задание
        System.out.println("Девятое задание:");
        boolean resultIsLeapYear = isLeapYear(2024);
        System.out.println(resultIsLeapYear);
        System.out.println("---------------");

        //Десятое задание
        System.out.println("Десятое задание:");
        int[] arrayNumber = {0, 1, 1, 0, 0, 0, 0};
        int[] modifiedArray = changeArray(arrayNumber);
        System.out.println(Arrays.toString(modifiedArray));
        System.out.println("---------------");

        //Одинадцатое задание
        System.out.println("Одинадцатое задание:");
        int[] inputArray = new int[100];
        int[] completedArray = completionArray(inputArray);
        for (int num : completedArray) {
            System.out.print(num + " ");
        }
        System.out.println("---------------");

        //Двенадцатое задание
        System.out.println("Двенадцатое задание:");
        int[] initialArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArrayNumber(initialArr);
        System.out.println("---------------");

        //Тринадцатое задание
        System.out.println("Тринадцатое задание:");
        int n = 5; // размер квадратного массива
        int[][] arrDiagonal = createAndFillDiagonalArray(n);
        printArray(arrDiagonal);
        System.out.println("---------------");

        //Четырнадцатое задание
        System.out.println("Четырнадцатое задание:");
        int len = 5;
        int initialValue = 10;
        int[] oneDimensionalArray = createInitialArray(len, initialValue);
        printArray(oneDimensionalArray);
        System.out.println("---------------");
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }


    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }


    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


    public static boolean checkSumEntryLimit(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }


    public static void checkNumberSign(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }


    public static boolean isNegative(int a) {
        return a < 0;
    }


    public static void printStringForNumber(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }


    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] changeArray(int[] changeArray) {
        for (int i = 0; i < changeArray.length; i++) {
            if (changeArray[i] == 0) {
                changeArray[i] = 1;
            } else {
                changeArray[i] = 0;
            }
        }
        return changeArray;
    }


    public static int[] completionArray(int[] arrayInput) {
        for (int i = 0; i < 100; i++) {
            arrayInput[i] = i + 1;
        }
        return arrayInput;
    }


    public static void modifyArrayNumber(int[] arrNumber) {
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] < 6) {
                arrNumber[i] *= 2;
            }
            System.out.print(arrNumber[i] + " ");
        }
    }


    public static int[][] createAndFillDiagonalArray(int n) {
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }

        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }


    public static int[] createInitialArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}




