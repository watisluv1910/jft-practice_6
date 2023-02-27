package org.app.abstract_factory;

public class BankFactory extends AbstractFactory {

    public Bank getBank(String bank){

        if (bank == null) { return null; }

        if(bank.equalsIgnoreCase("TINKOFF")) {
            return new Tinkoff();
        } else if (bank.equalsIgnoreCase("SBER")) {
            return new Sber();
        } else if (bank.equalsIgnoreCase("VTB")) {
            return new VTB();
        }

        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}