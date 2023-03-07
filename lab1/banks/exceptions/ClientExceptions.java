package ru.bogachenko.lab1.banks.exceptions;

public abstract class ClientExceptions extends Exception{
    protected ClientExceptions(String message) { super(message); }
}