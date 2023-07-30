package br.com.br.deiltel.capitulo3.swing.figura39;

import java.util.Scanner;

import br.com.br.deiltel.capitulo3.swing.figura38.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account("Jane Gree", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());

		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.print("Enter depoist amount for account1: ");
		double depositAmount = input.nextDouble();

		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());

		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		System.out.print("Enter depoist amount for account2: ");
		depositAmount = input.nextDouble();

		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());

		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

	}

}
