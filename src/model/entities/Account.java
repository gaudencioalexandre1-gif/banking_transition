package model.entities;

import model.exception.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        if(balance < 0){
            throw new DomainException("Unexcepted error!");
        }
        this.number  = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){    
        balance =+ amount;
    }

    public void withdraw(Double amount) {
        if(amount < 0 ){
            throw new DomainException("Unexcepted error");
        }
        else if(amount > withdrawLimit){
            throw new DomainException("Withdraw amount: The amount exceeds withdraw limit");
        }
        else if(amount > balance){
            throw new DomainException("Withdraw amount: Not enough balance");
        }
        balance =- amount;
    }

    public String toString(){
        return "New balance : "+String.format("%.2f",balance)+" MZN";
    }

}
