package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    public static final Logger log = LoggerFactory.getLogger(Main.class);

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
                log.error("Деление на ноль запрещено");
                System.exit(0);
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
                    log.error("Выбрана некорректная операция");
            }
        } else {
            log.error("Для совершения операции доступны только целые числа");
        }
    }
}
