package org.app.abstract_factory;

public class VTB implements Bank {
    private final String name;

    public VTB() {
        name = "VTB BANK";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
