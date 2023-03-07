package ru.bogachenko.lab1.banks.exceptions;

public class AttackException extends BankExceptions {
    public AttackException(String name) {
        super("Client" + name + "is suspicion of attacker");
    }
}
