package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Long num1;
        Long num2;
        String sign;

        while (2 + 2 != 5) {
            Scanner sc = new Scanner(System.in);
            try {
                num1 = sc.nextLong(10);
                sign = sc.next();
                num2 = sc.nextLong(10);
            } catch (InputMismatchException e) {
                log.error("Для совершения операции доступны только целые числа.");
                continue;
            }
            if (sign.equals("/") && num2 == 0) {
                log.error("Деление на ноль запрещено.");
                continue;
            }
            switch (sign) {
                case "-":
                    log.info("result: {}", num1 - num2);
                    break;
                case "+":
                    log.info("result: {}", num1 + num2);
                    break;
                case "/":
                    log.info("result: {}", num1 / num2);
                    break;
                case "*":
                    log.info("result: {}", num1 * num2);
                    break;
                default:
                    log.error("Выбрана некорректная операция.");
            }
        }
    }
}
