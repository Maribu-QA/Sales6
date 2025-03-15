package ru.netologi.javaqa.Sales6.services;


public class StatService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum; // сумма всех продаж за 12 месяцев
    }


    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length; // средние продажи за месяц
    }


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i; // номер месяца с минимальными продажами
            }
        }
        return minMonth + 1;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; // номер месяца с максимальными продажами
            }
        }
        return maxMonth + 1;
    }


    public int lessThanAvg(long[] sales) {
        int months = 0;
        long avg = avgSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                months++;
            }
        }
        return months;
    }


    public int moreThanAvg(long[] sales) {
        int months = 0;
        long avg = avgSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                months++;
            }
        }
        return months;
    }


}
