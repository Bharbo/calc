package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long num1 = null;
        Long num2 = null;
        String sign;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt(10))
            num1 = sc.nextLong(10);
        sign = sc.next();
        if (sc.hasNextInt(10))
            num2 = sc.nextLong(10);

        if (num1 != null && sign != null && num2 != null) {
            if (sign.equals("/") && num2 == 0) {
                System.out.println("Ошибка: Деление на ноль запрещено");
                System.exit(0);
            }
            if ("-".equals(sign)) {
                System.out.println(num1 - num2);
            } else if ("+".equals(sign)) {
                System.out.println(num1 + num2);
            } else if ("/".equals(sign)) {
                System.out.println(num1 / num2);
            } else if ("*".equals(sign)) {
                System.out.println(num1 * num2);
            } else {
                System.out.println("Ошибка: Выбрана некорректная операция");
            }
        } else {
            System.out.println("Ошибка: Для совершения операции доступны только целые числа");
        }
    }
}
