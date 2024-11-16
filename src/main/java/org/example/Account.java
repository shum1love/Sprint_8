package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19) {
            if (name.contains(" ")) {
                if (name.charAt(0) != ' ' && name.charAt(name.length() -1 ) != ' ') {
                    return true;
                }
            } else {
                // Если имя не содержит пробел, возвращаем false
                return false;
            }
        }
        // Возвращаем false, если имя не удовлетворяет условиям
        return false;
    }
}
