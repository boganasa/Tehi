package ru.bogachenko.lab1.banks.exceptions;

public class CantDoException extends DepositExceptions {
    public CantDoException(String doing) {
        super("You can't " + doing + " money from deposit now");
    }
}
