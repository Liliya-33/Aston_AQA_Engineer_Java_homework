package org.example;

public class Main {
    public static void main(String[] args) {
        //Урок 6
        //Первое задание
        Employee employee1 = new Employee();
        employee1.full_name = "Иванов Иван Иванович";
        employee1.job_title = "Старший разработчик";
        employee1.email = "ivanov@mail.ru";
        employee1.phone = "8 999 676 56 56";
        employee1.salary = 200000;
        employee1.age = 25;
        employee1.infoEmployee();

        //Второе задание
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Петров Петр Петрович", "Ручной тестировщик", "petrov@mail.ru", "8 987 654 65 56", 70000, 20);
        personArray[1] = new Person("Сергеев Сергей Сергеевич", "Автоматизированный тестировщик", "sergeev@mail.ru", "8 987 354 25 26", 180000, 27);
        personArray[2] = new Person("Марков Марк Маркович", "Младший разработчик", "markov@mail.ru", "8 987 604 45 52", 170000, 30);
        personArray[3] = new Person("Кириллов Кирилл Кириллович", "Руководитель отдела разработки", "kirillov@mail.ru", "8 987 624 25 55", 230000, 23);
        personArray[4] = new Person("Матвеев Матвей Матвеевич", "Руководитель проектов", "matveev@mail.ru", "8 987 644 45 54", 350000, 35);

        for (Person person : personArray) {
            person.infoPersons();
            System.out.println();
        }

        //Третье задание
        Park.Attractions atrraction1 = new Park() .new Attractions();
        Park.Attractions atrraction2 = new Park() .new Attractions();
        Park.Attractions atrraction3 = new Park() .new Attractions();
        atrraction1.name = "Колесо обозрения";
        atrraction1.work_schedule = "12:00 - 00:00";
        atrraction1.price = 500;
        atrraction2.name = "Комната страха";
        atrraction2.work_schedule = "10:00-20:00";
        atrraction2.price = 350;
        atrraction3.name = "Американские горки";
        atrraction3.work_schedule = "09:00-21:00";
        atrraction3.price = 700;

        atrraction1.infoAttractions();
        atrraction2.infoAttractions();
        atrraction3.infoAttractions();




        /* Урок 4
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
        System.out.println();*/
    }
}




