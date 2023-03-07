package ru.bogachenko.lab1.banks.exceptions;

public class AccountExistException extends BankExceptions {
    public AccountExistException(String name) {
        super("there is no such type of account" + name);
    }
}
