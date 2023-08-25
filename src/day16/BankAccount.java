package day16;

import day5.Address;

import java.util.Arrays;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private double[] transactions;


    public BankAccount(int numberOfTransaction){
        this.transactions = new double[numberOfTransaction];
    }
    public void getTransactions(double[] transactions){
        this.transactions = transactions;
    }
    public double[] getTransactions(){
        return Arrays.copyOf(transactions,transactions.length);

    }

}
