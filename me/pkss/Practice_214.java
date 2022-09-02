package me.pkss;

import java.util.Scanner;

public class Practice_214 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первой число: ");
        double firstNum = sc.nextDouble();
        System.out.println("Введите второе число: ");
	    double secondNum = sc.nextDouble();
	    System.out.println("Введите третье число: ");
        double thirdNum = sc.nextDouble();

        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double r = sc.nextDouble();

        System.out.println("Ввердите x и y");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Practice_214 mainMethod = new Practice_214();
        mainMethod.firstTaskPkss(firstNum, secondNum);
        mainMethod.secondTaskPkss(firstNum,secondNum, thirdNum);
        mainMethod.thirdTaskPkss(a1, a2 ,b1, b2, r);
        mainMethod.fourTaskPkss(x, y, firstNum, secondNum);
    }

    //Вариант 24
    private Double firstTaskPkss (double firstNumber, double secondNumber) {
        if (firstNumber > 0 && secondNumber > 0) {
            System.out.println("Так как числа имеют одинаковый знак, то мы возводим в степень и получаем: "
                    + Math.pow(firstNumber,secondNumber));
            return Math.pow(firstNumber,secondNumber);
        }
        else
            System.out.println("Так как числа имеют разные знаки, то мы умножаем их и получаем :" +
                    firstNumber*secondNumber);
            return firstNumber*secondNumber;
    }

    //Вариант 27
    private Double secondTaskPkss (double firstNumber, double secondNumber, double thirdNumber) {
        if (Math.abs(firstNumber) > Math.max(Math.abs(secondNumber), Math.abs(thirdNumber))) {
            System.out.println("Наибольшее значение: " + Math.abs(firstNumber));
            return Math.abs(firstNumber);
        }
        if (Math.abs(secondNumber) > Math.max(Math.abs(firstNumber), Math.abs(thirdNumber))) {
            System.out.println("Наибольшее значение: " + Math.abs(secondNumber));
            return Math.abs(secondNumber);
        }
        else
            System.out.println("Наибольшее значение: " + Math.abs(thirdNumber));
            return Math.abs(thirdNumber);
    }

    //Вариант 30
    private Double thirdTaskPkss (double a1, double a2, double b1, double b2, double r) {
        double point1 = a1 * a1 + a2 * a2;
        double point2 = b1 * b1 + b2 * b2;
        double radius = r * r;

        if (point1 < radius && point2 < radius) {
            System.out.println("Точки лежат в окружности");
            return 1.0;
        } else {
            System.out.println("Одна из точек не лежит внутри окружности");
            return 0.0;
        }
    }

    //Вариант 3
    private Boolean fourTaskPkss (double x, double y, double firstNumber, double secondNumber) {
        if ((x * y) > (firstNumber * secondNumber)) {
            System.out.println("Кирпич размером " + firstNumber * secondNumber +
                    "пройдет в отверстие размером" + x * y);
            return true;
        }
        else
            return false;
    }

    //Вариант 6
    private Double fiveTaskPkss (double a1, double a2, double b1) {
        if (b1 > a2 && a2 > a1 && b1 > a1) {
            return a1 = a2 + b1;
        }
        else
            return a1 = b1 - a2;
    }
}