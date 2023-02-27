package org.app.abstract_factory;

public class Sber implements Bank {
    private final String name;

    public Sber() {
        name = "SBER BANK";
    }

    @Override
    public String getBankName() {
        return name;
    }
}