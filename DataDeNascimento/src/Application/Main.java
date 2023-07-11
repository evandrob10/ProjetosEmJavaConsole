package Application;

import java.util.ArrayList;
import java.util.List;

import Entites.Account;
import Entites.AccountBunises;

public class Main {

	public static void main(String[] args) {
		
		List <Account> accounts =  new ArrayList<>();
		
		accounts.add(new Account("Evandro",10.00));
		accounts.add(new AccountBunises("Evandro",10.00,13.00));
	}

}

