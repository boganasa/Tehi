package ru.bogachenko.lab1.banks.exceptions;



public class GoToNegativeExceptions extends DebitExceptions {
    public GoToNegativeExceptions(long sum) {
        super("You can't go to negative " + sum);
    }
}
