package me.pkss.prac224;

import java.math.BigInteger;

public class Server {
    protected Double exOneThree(double numT, double numS) {
        double result = 0;
        double numA;
        double numB;

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    numA = 12;
                    numB = numS;
                    double G0 = (2 * numA + numB * numB) / (numA * numB * 2 + numB * 5);
                    result += G0;
                    break;
                case 1:
                    numA = numT;
                    numB = numS;
                    double G1 = (2 * numA + numB * numB) / (numA * numB * 2 + numB * 5);
                    result += G1;
                    break;
                case 2:
                    numA = 2 * numS - 1;
                    numB = numS * numT;
                    double G3 = (2 * numA + numB * numB) / (numA * numB * 2 + numB * 5);
                    result += G3;
                    break;
            }
        }
        System.out.println("Итоговое значение функции равно: " + result);
        return result;
    }

    protected Integer exTwo(int N) {
        int sumOfSimpleNums = 0;
        int flag = 0;
        // Начинаем с 2 т.к. простое число это любое число большее 1
        for (int i = 2; i < N; i++) {
            BigInteger bigInt = BigInteger.valueOf(i);
            if (bigInt.isProbablePrime((int) Math.log(i))) {
                flag = 1;
                sumOfSimpleNums += 1;
                trueOrFalse(flag);
            } else {
                flag = 2;
                trueOrFalse(flag);
            }
        }
        System.out.println(sumOfSimpleNums);
        return sumOfSimpleNums;
    }

    protected Boolean trueOrFalse(int flag) {
        if (flag == 1) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    protected Double exFour(double numT, double numS) {
        double result = 0;
        double numA;
        double numB;
        double numC;

        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    numA = numT;
                    numB = -2 * numS;
                    numC = 1.17;
                    double T0 = (2 * numA - numB - Math.sin(numC)) / (5 + numC);
                    result += T0;
                    break;
                case 1:
                    numA = 2.2;
                    numB = numT;
                    numC = numS - numT;
                    double T1 = (2 * numA - numB - Math.sin(numC)) / (5 + numC);
                    result += T1;
                    break;
            }
        }
        System.out.println("Итоговое значение функции равно: " + result);
        return result;
    }

    protected Double exFive(double cathetusA, double cathetusB) {
        double result = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
        System.out.println(result);
        return result;
    }
}
