package ru.bogachenko.lab1.banks.exceptions;

public class ResubscribeException extends BankExceptions {
    public ResubscribeException() {
        super("Client already subscribe");
    }
}
