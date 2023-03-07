package ru.bogachenko.lab1.banks.models;

public interface ClientBuilders {
    ClientBuilders withAddress(String address);

    ClientBuilders withPassportNumber(int passport);

    Client build();
}
