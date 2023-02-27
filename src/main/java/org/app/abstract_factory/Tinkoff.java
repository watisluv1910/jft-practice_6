package org.app.abstract_factory;

public class Tinkoff implements Bank {
    private final String name;

    public Tinkoff() {
        name = "TINKOFF BANK";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
