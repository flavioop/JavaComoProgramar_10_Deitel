package br.com.br.deitel.capitulo3.figura36;

import br.com.br.deitel.capitulo3.figura35.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account("Jane Green");
		Account account2 = new Account("John Blue");
		
		System.out.printf("account name is %s%n", account1.getName());
		System.out.printf("account name is %s%n", account2.getName());

	}

}


