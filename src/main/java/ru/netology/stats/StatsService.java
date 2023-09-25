package ru.netology.stats;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public int calculateTotalSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    // Метод для расчета средней суммы продаж в месяц
    public int calculateAverageSales(int[] sales) {
        int totalSales = calculateTotalSales(sales);
        return totalSales / sales.length;
    }

    // Метод для поиска номера месяца с максимальными продажами
    public int findMonthWithMaxSales(int[] sales) {
        int maxSales = sales[0];
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Метод для поиска номера месяца с минимальными продажами
    public int findMonthWithMinSales(int[] sales) {
        int minSales = sales[0];
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Метод для подсчета количества месяцев с продажами ниже среднего
    public int countMonthsBelowAverage(int[] sales) {
        int averageSales = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета количества месяцев с продажами выше среднего
    public int countMonthsAboveAverage(int[] sales) {
        int averageSales = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}

