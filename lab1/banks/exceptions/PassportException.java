package ru.bogachenko.lab1.banks.exceptions;

public class PassportException extends ClientExceptions {
    public PassportException(int num) {
        super("Not correct passport " + num);
    }
}
