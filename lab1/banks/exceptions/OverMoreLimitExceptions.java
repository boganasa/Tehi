package ru.bogachenko.lab1.banks.exceptions;



public class OverMoreLimitExceptions extends CreditExceptions {
    public OverMoreLimitExceptions(long sum) {
        super("You too go to negative " + sum);
    }
}
