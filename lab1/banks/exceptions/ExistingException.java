package ru.bogachenko.lab1.banks.exceptions;

public class ExistingException extends BankExceptions {
    public ExistingException(String name) {
        super("There is no such bank" + name);
    }
}
