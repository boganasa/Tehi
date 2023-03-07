package ru.bogachenko.lab1.banks.bankAccountRealisation;

import ru.bogachenko.lab1.banks.exceptions.GoToNegativeExceptions;
import ru.bogachenko.lab1.banks.interfaces.BankAccount;

import java.util.ArrayList;

public class DebitAccount implements BankAccount{
    private String id;
    private ArrayList<String> transactionHistory;
    private long sum;
    private long monthlyPayment;
    private float interestOnTheBalance;
    private float commission;
    private long limit;
    public DebitAccount(String id, long sum, float interestOnTheBalance){
        this.sum = sum;
        this.commission = 0;
        this.interestOnTheBalance = interestOnTheBalance;
        this.monthlyPayment = 0;
        this.id = id + "/" +java.util.UUID.randomUUID().toString();
        this.transactionHistory = new ArrayList<String>();
    }

    public String getId(){
        return this.id.toString();
    }
    public ArrayList<String> getTransactionHistory(){
        return this.transactionHistory;
    }
    public long getSum(){
        return this.sum;
    }
    public long getMonthlyPayment(){
        return this.monthlyPayment;
    }
    public float getInterestOnTheBalance(){
        return this.interestOnTheBalance;
    }
    public void setInterestOnTheBalance(float interestOnTheBalance)
    {
        this.interestOnTheBalance = interestOnTheBalance;
    }
    public float getCommission(){
        return this.commission;
    }

    public void setCommission(float commission){
        this.commission = commission;
    }
    public void setByIndex(int index, String comment){
        var newArrayList = new ArrayList<String>(this.transactionHistory);
        newArrayList.get(index).replace("success", comment);
        this.transactionHistory = newArrayList;
    }

    public String getByIndex(int index){
        return this.transactionHistory.get(index);
    }

    public Boolean canwithdrawMoney(){
        return true;
    }

    public Boolean canGoIntoNegative(){
        return false;
    }

    public void withdrawMoney(long sum){
        if (this.sum - sum < 0){
            try {
                throw new GoToNegativeExceptions(sum);
            } catch (GoToNegativeExceptions e) {
                throw new RuntimeException(e);
            }
        }

        this.sum -= sum;
        addTransaction(sum, "Withdraw");
    }

    public void putMoney(long sum){
        this.sum += sum;
        addTransaction(sum, "Put");
    }

    public void transferMoney(long sum, BankAccount otherAccount){
        if (this.sum - sum < 0){
            try {
                throw new GoToNegativeExceptions(sum);
            } catch (GoToNegativeExceptions e) {
                throw new RuntimeException(e);
            }
        }

        this.sum -= sum;
        addTransaction(sum, "Transfer/" + otherAccount.getId());
    }

    public void dailyAccrualOfInterestInTheBalance(int days){
        this.monthlyPayment += (this.interestOnTheBalance / 365 / 100 * this.sum * days);
    }

    public void interestPayment(){
        this.sum += this.monthlyPayment;
        this.monthlyPayment = 0;
    }

    public void сommissionDeduction(){}

    private void addTransaction(long sum, String typeOfTransaction){
        String newTransaction = typeOfTransaction + "/" + sum + "/success";
        var newArrayList = new ArrayList<String>(this.transactionHistory);
        newArrayList.add(newTransaction);
        this.transactionHistory = newArrayList;
    }
}