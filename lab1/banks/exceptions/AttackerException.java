package ru.bogachenko.lab1.banks.exceptions;

public class AttackerException extends ClientExceptions {
    public AttackerException(String num) {
        super("Not attacker " + num);
    }
}
