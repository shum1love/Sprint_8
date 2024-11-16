package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private final Account account = new Account("Имя Фамилия");

    @Test
    public void testCheckNameToEmboss_Positive() {
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testCheckNameToEmboss_InvalidLength() {
        // длина меньше 3 символов
        Account shortNameAccount = new Account("ёй");
        assertFalse(shortNameAccount.checkNameToEmboss());

        // длина больше 19 символов
        Account longNameAccount = new Account("Очень Длинное Имя и Фамилия Засыпают на Лекциях");
        assertFalse(longNameAccount.checkNameToEmboss());
    }

    @Test
    public void testCheckNameToEmboss_MoreThanOneSpace() {
        Account invalidAccount = new Account("Имя Фамилия");
        assertTrue(invalidAccount.checkNameToEmboss());
    }

    @Test
    public void testCheckNameToEmboss_LeadingOrTrailingSpaces() {
        Account invalidAccount = new Account(" Имя Фамилия");
        assertFalse(invalidAccount.checkNameToEmboss());

        invalidAccount = new Account("Имя Фамилия ");
        assertFalse(invalidAccount.checkNameToEmboss());
    }
}