package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("task 1");
        int requiredAmount = 2_459_000;
        int amount = 0;
        int deposit = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (amount < requiredAmount) {
            amount = amount + deposit;
            amount = (int) (amount * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей");
        }
        System.out.println("task 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("task 3");
        int population = 12_000_000;
        int mortalityPerThousand = 8;
        int natalityPerThousand = 17;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * natalityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численнсть населения составляет " + population);
        }
        System.out.println("task 4");
        percent = 7D / 100;
        requiredAmount = 12_000_000;
        amount = 15_000;
        month = 0;
        while (amount < requiredAmount) {
            amount = (int) (amount * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей");
        }
        System.out.println("task 5");
        amount = 15_000;
        month = 0;
        while (amount < requiredAmount) {
            amount = (int) (amount * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей");
            }
        }
        System.out.println("task 6");
        amount = 15_000;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            amount = (int) (amount * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей");
            }
        }
        System.out.println("task 7");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт");
        }
        System.out.println("task 8");
        int period = 79;
        int firstFlyYear = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = firstFlyYear; year < end; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }

    }
}
