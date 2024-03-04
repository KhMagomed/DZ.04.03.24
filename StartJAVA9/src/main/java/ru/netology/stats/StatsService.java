package ru.netology.stats;

public class StatsService {
    public int minSales(int[] salesArr) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < salesArr.length; i++) {
            if (salesArr[i] <= salesArr[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getSumSales(int[] salesArr) {
        int sumsales = 0;
        for (int i : salesArr) {
            sumsales = i + sumsales;
        }

        return sumsales;
    }

    public int getAvrgSumSales(int[] salesArr) {
        int avrg = 0;
        for (int i : salesArr) {
            avrg = getSumSales(salesArr) / salesArr.length;
        }

        return avrg;
    }
    public int maxSales(int[] salesArr) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < salesArr.length; i++) {
            if (salesArr[i] >= salesArr[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int getCountdownAvgSales(int[] salesArr) {
        int countMounth = 0;
        int avg = getAvrgSumSales(salesArr);
        for (int i : salesArr) {
            if (i < avg)
                countMounth++;
        }

        return countMounth;
    }
    public int getCountUpAvgSales(int[] salesArr) {
        int countMounth = 0;
        int avg = getAvrgSumSales(salesArr);
        for (int i : salesArr) {
            if (i > avg)
                countMounth++;
        }

        return countMounth;
    }
}




