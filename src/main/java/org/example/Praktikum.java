package org.example;

public class Praktikum {

    public static void main(String[] args) {
        String inputName = "Ти"; // тестируемая строка
        Account account = new Account(inputName); // создание экземпляра класса Account

        // Проверка возможности печати на карте
        if (account.checkNameToEmboss()) {
            System.out.println("Имя и фамилия подходят для печати на банковской карте.");
        } else {
            System.out.println("Имя и фамилия не подходят для печати на банковской карте.");
        }
    }
}