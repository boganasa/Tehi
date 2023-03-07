package ru.bogachenko.lab1.banks.interfaces;

import java.util.ArrayList;

public interface BankAccount{
    public String getId();
    public ArrayList<String> getTransactionHistory();
    public long getSum();
    public long getMonthlyPayment();
    public float getInterestOnTheBalance();
    public float getCommission();
    public void setCommission(float commission);
    Boolean canwithdrawMoney();
    Boolean canGoIntoNegative();
    void withdrawMoney(long sum);
    void putMoney(long sum);
    void transferMoney(long sum, BankAccount otherAccount);
    void dailyAccrualOfInterestInTheBalance(int days);
    void interestPayment();
    void сommissionDeduction();
    void setByIndex(int index, String comment);
    String getByIndex(int index);
}
