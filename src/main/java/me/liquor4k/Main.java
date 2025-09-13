package me.liquor4k;

//задание 1

public class Main {
    public static void main(String[] args) {
        // Объявление переменных
        int myNumber = 42;
        byte smallNumber = 127;
        short mediumNumber = 32000;
        long bigNumber = 9223372036854775807L;
        float decimalNumber = 3.14f;
        double preciseNumber = 2.718281828459045;

        // Вывод значений в консоль
        System.out.println("Значение переменной myNumber с типом int равно " + myNumber);
        System.out.println("Значение переменной smallNumber с типом byte равно " + smallNumber);
        System.out.println("Значение переменной mediumNumber с типом short равно " + mediumNumber);
        System.out.println("Значение переменной bigNumber с типом long равно " + bigNumber);
        System.out.println("Значение переменной decimalNumber с типом float равно " + decimalNumber);
        System.out.println("Значение переменной preciseNumber с типом double равно " + preciseNumber);

        //задание 2

        // Инициализация переменных с указанными значениями
        float firstValue = 27.12f;          // float для числа с плавающей точкой
        long secondValue = 987678965549L;   // long для большого целого числа
        double thirdValue = 2.786;          // double для числа с плавающей точкой
        short fourthValue = 569;            // short для целого числа
        short fifthValue = -159;            // short для отрицательного целого числа
        int sixthValue = 27897;             // int для целого числа
        byte seventhValue = 67;             // byte для маленького целого числа

        // Вывод значений в консоль
        System.out.println("Значение переменной firstValue с типом float равно " + firstValue);
        System.out.println("Значение переменной secondValue с типом long равно " + secondValue);
        System.out.println("Значение переменной thirdValue с типом double равно " + thirdValue);
        System.out.println("Значение переменной fourthValue с типом short равно " + fourthValue);
        System.out.println("Значение переменной fifthValue с типом short равно " + fifthValue);
        System.out.println("Значение переменной sixthValue с типом int равно " + sixthValue);
        System.out.println("Значение переменной seventhValue с типом byte равно " + seventhValue);

        //задание 3

        // Количество учеников у каждого учителя
        int ludmilaPavlovnaStudents = 23;
        int annaSergeevnaStudents = 27;
        int ekaterinaAndreevnaStudents = 30;

        // Общее количество бумаги
        int totalPaper = 480;

        // Общее количество учеников
        int totalStudents = ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;

        // Расчет количества бумаги на одного ученика
        int paperPerStudent = totalPaper / totalStudents;

        // Вывод результата
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        //задание 4

        // Исходные данные
        int bottlesPer2Minutes = 16;
        int minutesIn2Minutes = 2;

        // Производительность в минуту
        int bottlesPerMinute = bottlesPer2Minutes / minutesIn2Minutes;

        // Расчет для разных промежутков времени
        int twentyMinutes = 20;
        int oneDay = 24 * 60; // 24 часа * 60 минут
        int threeDays = 3 * oneDay;
        int oneMonth = 30 * oneDay; // считаем месяц как 30 дней

        // Расчет количества бутылок
        int bottlesIn20Minutes = bottlesPerMinute * twentyMinutes;
        int bottlesInOneDay = bottlesPerMinute * oneDay;
        int bottlesInThreeDays = bottlesPerMinute * threeDays;
        int bottlesInOneMonth = bottlesPerMinute * oneMonth;

        // Вывод результатов
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + bottlesInOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesInOneMonth + " штук бутылок");

        //задание 5

        // Общее количество банок краски
        int totalPaintCans = 120;

        // Расход краски на один класс
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;

        // Общий расход краски на один класс
        int totalPaintPerClass = whitePaintPerClass + brownPaintPerClass;

        // Расчет количества классов
        int numberOfClasses = totalPaintCans / totalPaintPerClass;

        // Расчет количества банок каждой краски
        int totalWhitePaint = whitePaintPerClass * numberOfClasses;
        int totalBrownPaint = brownPaintPerClass * numberOfClasses;

        // Вывод результата
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                totalWhitePaint + " банок белой краски и " +
                totalBrownPaint + " банок коричневой краски");

        //задание 6

        // Вес компонентов в граммах
        int bananaWeight = 5 * 80;          // 5 бананов по 80 грамм = 400 г
        int milkWeight = 200 * 105 / 100;   // 200 мл молока = 210 г
        int iceCreamWeight = 2 * 100;       // 2 брикета мороженого = 200 г
        int eggsWeight = 4 * 70;            // 4 яйца = 280 г

        // Общий вес в граммах
        int totalGrams = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;

        // Перевод в килограммы
        double totalKilograms = totalGrams / 1000.0;

        // Вывод результатов
        System.out.println("Вес спортзавтрака: " + totalGrams + " грамм");
        System.out.println("Вес спортзавтрака: " + totalKilograms + " кг");

        //задание 7

        // Цель похудения в кг и граммах
        int targetLossKg = 7;
        int targetLossGrams = targetLossKg * 1000; // 7000 грамм

        // Минимальная и максимальная потеря веса в день
        int minDailyLoss = 250; // грамм в день
        int maxDailyLoss = 500; // грамм в день

        // Расчет дней при минимальной потере веса
        int daysWithMinLoss = targetLossGrams / minDailyLoss;

        // Расчет дней при максимальной потере веса
        int daysWithMaxLoss = targetLossGrams / maxDailyLoss;

        // Расчет среднего количества дней
        int averageDailyLoss = (minDailyLoss + maxDailyLoss) / 2;
        int averageDays = targetLossGrams / averageDailyLoss;

        // Вывод результатов
        System.out.println("При потере веса 250 грамм в день потребуется: " + daysWithMinLoss + " дней");
        System.out.println("При потере веса 500 грамм в день потребуется: " + daysWithMaxLoss + " дней");
        System.out.println("В среднем потребуется: " + averageDays + " дней");
        System.out.println("Для похудения на " + targetLossKg + " кг (" + targetLossGrams + " грамм)");

        //задача 8

        // Текущие зарплаты сотрудников
        int mashasSalary = 67760;
        int denisSalary = 83690;
        int kristinasSalary = 76230;

        // Повышение на 10%
        double increaseRate = 0.10;

        // Расчет новых зарплат
        int mashasNewSalary = (int) (mashasSalary * (1 + increaseRate));
        int denisNewSalary = (int) (denisSalary * (1 + increaseRate));
        int kristinasNewSalary = (int) (kristinasSalary * (1 + increaseRate));

        // Годовой доход до повышения
        int mashasAnnualOld = mashasSalary * 12;
        int denisAnnualOld = denisSalary * 12;
        int kristinasAnnualOld = kristinasSalary * 12;

        // Годовой доход после повышения
        int mashasAnnualNew = mashasNewSalary * 12;
        int denisAnnualNew = denisNewSalary * 12;
        int kristinasAnnualNew = kristinasNewSalary * 12;

        // Разница в годовом доходе
        int mashasAnnualDiff = mashasAnnualNew - mashasAnnualOld;
        int denisAnnualDiff = denisAnnualNew - denisAnnualOld;
        int kristinasAnnualDiff = kristinasAnnualNew - kristinasAnnualOld;

        // Вывод результатов
        System.out.println("Маша теперь получает " + mashasNewSalary + " рублей. Годовой доход вырос на " + mashasAnnualDiff + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinasNewSalary + " рублей. Годовой доход вырос на " + kristinasAnnualDiff + " рублей");
    }
}
