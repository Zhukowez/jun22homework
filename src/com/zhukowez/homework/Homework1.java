package com.zhukowez.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        taskAdvanced();

    }

    public static void task1() {
        System.out.println("1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight on earth");
        double yourWeightOnEarth = scanner.nextDouble();

        double yourWeightOnMoon = yourWeightOnEarth * 0.16;
        System.out.println("Your weight on Moon = " + yourWeightOnMoon);
    }

    public static void task2() {
        System.out.println("2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int numberElementsArray = scanner.nextInt();

        Random random = new Random();
        double[] array = new double[numberElementsArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }

        System.out.print("Array before increasing elements by 10% : ");
        for (double i : array) {
            System.out.print("[" + i + "]");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] *= 1.1;
        }

        System.out.print("\n" + "Array after increasing elements by 10% : ");
        for (double i : array) {
            System.out.print("[" + i + "]");
        }

    }

    public static void task3() {
        System.out.println("\n3. Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numberCheck = scanner.nextInt();
        int numberCheckBuffer = numberCheck;

        //Reversed number and save as String
        String numberReversedString = "";
        while (numberCheck > 0) {
            numberReversedString = numberReversedString + numberCheck % 10;
            numberCheck /= 10;
        }

        //convert reversed number a String to int
        int numberCheckReversed = Integer.parseInt(numberReversedString);

        //check number for palindrome
        if (numberCheckBuffer == numberCheckReversed) {
            System.out.println(numberCheckBuffer + " is palindrome");
        } else {
            System.out.println(numberCheckBuffer + " is not palindrome");
        }

    }

    public static void task4() {
        System.out.println("4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ";");
            }
        }
    }

    public static void task5() {
        System.out.println("\n5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)");
        int i = 1;
        while (i < 16) {
            if (i % 2 != 0)
                System.out.print(i + ";");
            i++;
        }
    }

    public static void task6() {
        System.out.println("\n6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)");
        for (int i = 1; i <= 100; i++) {
            i++;
            System.out.print(i + ";");
        }
    }

    public static void task7() {
        System.out.println("\n7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)");
        int sum = 0;
        for (int i = 20; i <= 100; i++) {
            sum += 20;
        }
        System.out.println(sum + " = Amount from 20 to 200");
    }

    public static void task8() {
        System.out.println("8. Пройти циклом по числам от 1 до 12 и вывести название месяца,\n" +
                " соответствующее каждому числу (используя цикл и оператор if else)");
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println("Январь");
            } else if (i == 2) {
                System.out.println("Февраль");
            } else if (i == 3) {
                System.out.println("Март");
            } else if (i == 4) {
                System.out.println("Апрель");
            } else if (i == 5) {
                System.out.println("Май");
            } else if (i == 6) {
                System.out.println("Июнь");
            } else if (i == 7) {
                System.out.println("Июль");
            } else if (i == 8) {
                System.out.println("Август");
            } else if (i == 9) {
                System.out.println("Сентябрь");
            } else if (i == 10) {
                System.out.println("Октябрь");
            } else if (i == 11) {
                System.out.println("Ноябрь");
            } else
                System.out.println("Декабрь");
        }
    }

    public static void task9() {
        System.out.println("9. Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, \n" +
                "чтобы значение первой оказалось во второй, а второй - в первой.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Variable");
        int firstVariable = scanner.nextInt();
        System.out.println("Enter second Variable");
        int secondVariable = scanner.nextInt();

        int buffer = firstVariable;
        firstVariable = secondVariable;
        secondVariable = buffer;

        System.out.println("first Variable = " + firstVariable + "\n" + "second Variable = " + secondVariable);

    }

    public static void task10() {
        System.out.println("10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения,\n" +
                " а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Variable");
        int firstVariable = scanner.nextInt();
        System.out.println("Enter second Variable");
        int secondVariable = scanner.nextInt();

        int sum = firstVariable + secondVariable;
        System.out.println("Sum of variables = " + sum);
    }

    public static void task11() {
        System.out.println("11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Variable");
        int firstVariable = scanner.nextInt();
        System.out.println("Enter second Variable");
        int secondVariable = scanner.nextInt();
        System.out.println("Enter third Variable");
        int thirdVariable = scanner.nextInt();

        if (firstVariable >= secondVariable && firstVariable >= thirdVariable) {
            System.out.println("First variable greater than others : "
                    + firstVariable + " >= " + secondVariable + " and " + firstVariable + " >= " + thirdVariable);
        } else if (secondVariable >= thirdVariable) {
            System.out.println("Second variable greater than others : "
                    + secondVariable + " >= " + firstVariable + " and " + secondVariable + " >= " + thirdVariable);
        } else System.out.println("Third variable greater than others : "
                + thirdVariable + " >= " + firstVariable + " and " + thirdVariable + " >= " + secondVariable);
    }

    public static void task12() {
        System.out.println("12. Напишите программу, в которой используются две переменные логического типа (boolean), \n" +
                "присвойте им значения и выведете для каждой переменной на экран строку \"истина\", \n" +
                "если переменная имеет значение true и \"ложь\", если переменная имеет значение false.");
        boolean booleanTrue = true;
        boolean booleanFalse = false;

        if (booleanTrue == true) {
            System.out.println("истина");
        }

        if (booleanFalse == false) {
            System.out.println("ложь");
        }
    }

    public static void task13() {
        System.out.println("13. Напишите программу, где двум строковым переменным присваиваются значения, \n" +
                "третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк. \n" +
                "Затем напечатайте значение третьей строковой переменной.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value first string");
        String string1 = scanner.nextLine();
        System.out.println("Enter value second string");
        String string2 = scanner.nextLine();

        String string3 = string1 + string2;
        System.out.println(string3);

    }

    public static void task14() {
        System.out.println("14. Создайте программу с двумя переменными целого типа, \n" +
                "присвойте им значения, если первая переменная больше второй, то увеличьте её значение на 3, \n" +
                "иначе увеличьте значение второй переменной на 8. \n" +
                "В конце программы выведите значения обоих чисел на экран.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value first variable");
        int variable1 = scanner.nextInt();
        System.out.println("Enter value second variable");
        int variable2 = scanner.nextInt();

        if (variable1 > variable2) {
            variable1 += 3;
        } else variable2 += 8;

        System.out.println("variable1 = " + variable1 + "\n" + "variable2 = " + variable2);
    }

    public static void task15() {
        System.out.println("15. Выведете на экран все числа от 1 до 100 с помощью цикла\n" +
                " (можно все три варианта в одной программе): for ; while ; do while");
        Scanner scanner = new Scanner(System.in);

        boolean bool = true;
        while (bool) {
            System.out.println("Select loop to output numbers\n" +
                    "1 - for\n" +
                    "2 - while\n" +
                    "3 - do while\n" +
                    "0 - Exit");
            String selectLoop = scanner.nextLine();

            switch (selectLoop) {
                case "1":
                    for (int i = 1; i <= 100; i++) {
                        System.out.println(i + " ");
                    }
                    break;
                case "2":
                    int j = 1;
                    while (j <= 100) {
                        System.out.println(j + " ");
                        j++;
                    }
                    break;
                case "3":
                    int k = 1;
                    do {
                        System.out.println(k + " ");
                        k++;
                    } while (k <= 100);
                    break;
                case "0":
                    bool = false;
                    break;
                default:
                    System.out.println("Something is wrong");
            }
        }
    }

    public static void task16() {
        System.out.println("16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. \n" +
                "Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. \n" +
                "Минимум, максимум и шаг указываются пользователем (можно захардкодить).");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum number");
        int min = scanner.nextInt();
        System.out.println("Enter maximum number");
        int max = scanner.nextInt();
        System.out.println("Enter step");
        int step = scanner.nextInt();

        while (min <= max) {
            System.out.println(min);
            min += step;
        }

    }

    public static void task17() {
        System.out.println("17. Все элементы массива поделить на значение наибольшего элемента этого массива.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int numberElementsArray = scanner.nextInt();

        Random random = new Random();
        double[] array = new double[numberElementsArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }

        for (double i : array) {
            System.out.print("[" + i + "]");
        }

        double maxNum = array[0];
        for (double i : array) {
            maxNum = i > maxNum ? i : maxNum;
        }

        System.out.println("\nmaximum number = " + maxNum);

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / maxNum;
        }

        for (double i : array) {
            System.out.print("[" + i + "]");
        }

    }

    public static void task18() {
        System.out.println("\n18. Напишите метод переводящий рубли в доллары по заданному курсу. \n" +
                "В качестве аргументов укажите кол-во рублей и курс.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount rubles");
        double rubles = scanner.nextDouble();
        System.out.println("Enter dollar rate");
        double dollarRate = scanner.nextDouble();

        System.out.println("conversion result = " + rubles / dollarRate + " dollars");
    }

    public static void taskAdvanced() {
        System.out.println("Advanced Level: 2.Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount day");
        int day = scanner.nextInt();

        final int hours = 24;
        final int minutes = 60;
        final int seconds = 60;

        System.out.println("In " + day + " day = " + day * hours + " hours " + day * hours * minutes +
                " minutes " + day * hours * minutes * seconds + " seconds");


    }


}