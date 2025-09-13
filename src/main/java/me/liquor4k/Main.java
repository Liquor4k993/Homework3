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
    }
}
