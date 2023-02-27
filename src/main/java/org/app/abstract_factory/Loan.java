package org.app.abstract_factory;

public abstract class Loan {

    protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
        /*
          to calculate the monthly loan payment i.e. EMI

          rate = annual interest rate / 12 * 100;
          n = number of monthly installments;
          1 year = 12 months => n = years * 12;
         */

        double EMI;
        int n = years * 12;

        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n))
                / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;

        System.out.println("your monthly EMI is "
                + EMI + " for the amount "
                + loanAmount +" you have borrowed.");
    }
}
