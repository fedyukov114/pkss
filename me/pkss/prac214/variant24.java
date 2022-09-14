package me.pkss;

import java.util.Scanner;

public class variant24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первой число: ");
        double firstNum = sc.nextDouble();
        System.out.println("Введите второе число: ");
	    double secondNum = sc.nextDouble();

        variant24 mainMethod = new variant24();
        mainMethod.firstTaskPkss(firstNum, secondNum);
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
}