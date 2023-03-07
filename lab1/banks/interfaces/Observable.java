package ru.bogachenko.lab1.banks.interfaces;

public interface Observable
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}