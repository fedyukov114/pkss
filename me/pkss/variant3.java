package me.pkss;

import java.util.Scanner;

public class variant3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввердите x и y, области в которую будет проходит кирпич: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Введите длину и ширну кирпича: ");
        double firstNum = sc.nextDouble();
        double secondNum = sc.nextDouble();

        variant3 mainMethod = new variant3();
        mainMethod.fourTaskPkss(x, y, firstNum, secondNum);
    }

    private Boolean fourTaskPkss(double x, double y, double firstNumber, double secondNumber) {
        if ((x * y) > (firstNumber * secondNumber)) {
            System.out.println("Кирпич размером " + firstNumber * secondNumber + " " +
                    "пройдет в область размером " + x * y);
            return true;
        } else {
            System.out.println("Кирпич не пройдет в заданную область.");
            return false;
        }
    }
}
