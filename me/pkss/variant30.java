package me.pkss;

import java.util.Scanner;

public class variant30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первой точки (x,y): ");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        System.out.println("Введите координаты второй точки (x,y): ");
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        System.out.println("Введите радиус окружности: ");
        double r = sc.nextDouble();

        variant30 mainMethod = new variant30();
        mainMethod.thirdTaskPkss(a1, a2, b1, b2, r);
    }

    private Boolean thirdTaskPkss (double a1, double a2, double b1, double b2, double r) {
        double point1 = a1 * a1 + a2 * a2;
        double point2 = b1 * b1 + b2 * b2;
        double radius = r * r;

        if (point1 < radius && point2 < radius) {
            System.out.println("Точки лежат в окружности");
            return true;
        } else {
            System.out.println("Одна из точек не лежит внутри окружности");
            return false;
        }
    }
}
