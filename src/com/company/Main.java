package com.company;

public class Main {

    public static void main(String[] args) {

        int ticketNumber = 921309, firstPart, secondPart, digit1, digit2, digit3, sum1, sum2;


        firstPart = ticketNumber / 1000;
        System.out.println("Первая часть номера билета = " + firstPart);

        secondPart = ticketNumber - (firstPart * 1000);
        System.out.println("Вторая часть номера билета = " + secondPart);

        digit1 = firstPart / 100;
        System.out.println("Первая цифра 1 части = " + digit1);

        digit2 = (firstPart / 10) % 10;
        System.out.println("Вторая цифра 1 части = " + digit2);

        digit3 = firstPart % 10;
        System.out.println("Третья цифра 1 части = " + digit3);

        sum1 = digit1 + digit2 + digit3;
        System.out.println("Cумма 1 части = " + sum1);


        digit1 = secondPart / 100;
        System.out.println("Первая цифра 2 части = " + digit1);

        digit2 = (secondPart / 10) % 10;
        System.out.println("Вторая цифра 2 части = " + digit2);

        digit3 = secondPart % 10;
        System.out.println("Третья цифра 2 части = " + digit3);

        sum2 = digit1 + digit2 + digit3;
        System.out.println("Cумма 2 части = " + sum2);

        if (sum1 == sum2) {
            System.out.println("Вам попался счастливый билет, поздравляю!");
        } else {
            System.out.println("Вам попался обычный билет");
        }


    }
}
