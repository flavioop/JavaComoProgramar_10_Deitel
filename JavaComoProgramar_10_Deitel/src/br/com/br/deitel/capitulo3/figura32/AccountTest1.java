package br.com.br.deitel.capitulo3.figura32;

import java.util.Scanner;

public class AccountTest1 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Account1 account1 = new Account1("Jane Green");
		Account1 account2 = new Account1("Joh Blue");
		
		System.out.printf("Initial name is:  %s%n%n", account1.getName());
		System.out.printf("Initial name is:  %s%n%n", account2.getName());
		
	}
}
