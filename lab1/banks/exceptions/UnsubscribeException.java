package ru.bogachenko.lab1.banks.exceptions;

public class UnsubscribeException extends BankExceptions {
    public UnsubscribeException() {
        super("Client is not subscribe");
    }
}
