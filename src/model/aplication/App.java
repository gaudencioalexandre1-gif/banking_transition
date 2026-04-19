package model.aplication;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import model.entities.Account;

import model.exception.DomainException;

public class App {
    public static void main(String []args) throws Exception{

        InputStreamReader ips = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ips);

        try{
            System.out.println("\n============ACCOUNT===========\n");
        
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
            acccount.withdraw(amount);

            System.out.println(acccount);
            System.out.println("");
        }
        catch(DomainException e){
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e){
            System.out.print("Unexcepted error");
        }

    }
}
