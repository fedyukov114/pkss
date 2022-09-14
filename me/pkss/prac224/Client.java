package me.pkss.prac224;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Server server = new Server();

        System.out.println("Введите два числа: ");
        double T = sc.nextDouble();
        double S = sc.nextDouble();

        // Вызов метода для выполнения первой и третьей задачи
        server.exOneThree(T, S);
        System.out.println("---------------" + "\n");

        // Вызов метода для выполнения второй задачи
        System.out.println("Введите число. До него будет идти поиск простых чисел");
        int N = sc.nextInt();
        server.exTwo(N);
        System.out.println("---------------" + "\n");

        // Вызов метода для выполнения четвертой задачи
        server.exFour(T, S);
        System.out.println("---------------" + "\n");


        System.out.println("Введите размеры катетов, для поиска гипотенузы: ");
        double firstCathetus = sc.nextDouble();
        double secondCathetus = sc.nextDouble();

        // Вызов метода для выполнения пятой задачи
        server.exFive(firstCathetus, secondCathetus);
    }
}