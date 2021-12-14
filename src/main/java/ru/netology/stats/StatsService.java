package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            sum += sale; //сумма всех продаж
        }
        return sum;

    }

    public int averageAmount(int[] sales) {
        int averageAmount = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            averageAmount = sumSales(sales) / sales.length; //средние продажи за весь период
        }
        return averageAmount;

    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth (последнем)
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int belowAverageAmount(int[] sales) {
        int belowAverageAmount = 0;
        int month = 1;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                belowAverageAmount = month++;
            }
        }
        return belowAverageAmount;
    }

    public int aboveAverageAmount(int[] sales) {
        int aboveAverageAmount = 0;
        int month = 1;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                aboveAverageAmount = month++;
            }
        }
        return aboveAverageAmount;
    }
}