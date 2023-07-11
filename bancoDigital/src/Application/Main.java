package Application;

import Entites.User;
import Entites.Address;

public class Main {
	public static void main(String[] args) {
		Address endereco = new Address(0,"Rua corrego do curio",29,"Dois unidos","Recife",false);
		User p1 = new User(10);
		p1.setAddress(endereco);
		p1.viewSingleAddress(endereco);
	}
}
