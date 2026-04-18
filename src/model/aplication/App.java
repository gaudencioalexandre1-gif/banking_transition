package model.aplication;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import model.entities.Account;

public class App {
    public static void main(String []args) throws Exception{

        InputStreamReader ips = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ips);

        System.out.println("\n===========ACCOUNT==========\n");
        System.out.println("Enter account data:");

        System.out.print("Account Number: ");
        Integer number = Integer.parseInt(br.readLine());

        System.out.print("Holder: ");
        String holder = br.readLine();

        System.out.print("Inicial Balance: ");
        Double balance = Double.parseDouble(br.readLine());

        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = Double.parseDouble(br.readLine());

        Account acccount = new Account(number,holder,balance,withdrawLimit);

        System.out.println("");

        System.out.print("Enter amount for withdraw: ");
        Double amount = Double.parseDouble(br.readLine());
        acccount.deposit(amount);

        System.out.println(acccount);
        System.out.println("");

    }
}
