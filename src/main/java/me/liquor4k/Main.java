package me.liquor4k;

//задание 1
public class VariableDeclaration {
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
    }
}