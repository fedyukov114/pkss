package me.pkss;

import java.util.Scanner;

public class variant6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа");
        double numberA = sc.nextDouble();
        double numberB = sc.nextDouble();
        double numberC = sc.nextDouble();

        variant6 mainMethod = new variant6();
        mainMethod.fiveTaskPkss(numberA, numberB, numberC);
    }

    private Double fiveTaskPkss (double A, double B, double C) {
        if (C > B && B > A && C > A) {
            A = B + C;
            System.out.println("Так как C > B > A, то A = B + C");
            return A;
        } else {
            A = C - B;
            System.out.println("Так как условие не выполняется, то A = B - C");
            return A;
        }
    }
}
