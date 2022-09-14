package me.pkss;

import java.util.Scanner;

public class variant27 {
    public static void main(String[] args) {
        variant27 mainMethod = new variant27();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первой число: ");
        double firstNum = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNum = sc.nextDouble();
        System.out.println("Введите третье число: ");
        double thirdNum = sc.nextDouble();

        mainMethod.secondTaskPkss(firstNum, secondNum, thirdNum);
    }

    private Double secondTaskPkss (double firstNumber, double secondNumber, double thirdNumber) {
        if (Math.abs(firstNumber) > Math.max(Math.abs(secondNumber), Math.abs(thirdNumber))) {
            System.out.println("Наибольшее значение: " + Math.abs(firstNumber));
            return Math.abs(firstNumber);
        }
        if (Math.abs(secondNumber) > Math.max(Math.abs(firstNumber), Math.abs(thirdNumber))) {
            System.out.println("Наибольшее значение: " + Math.abs(secondNumber));
            return Math.abs(secondNumber);
        } else {
            System.out.println("Наибольшее значение: " + Math.abs(thirdNumber));
            return Math.abs(thirdNumber);
        }
    }
}
