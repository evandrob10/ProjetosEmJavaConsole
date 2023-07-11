package Application;

import java.util.Scanner;
import Entites.Estoque;

public class Main {	
	static Scanner x = new Scanner(System.in);
	static Estoque [] products = new Estoque[10]; 
	public static void main(String[] args) {
		byte opcaoEscolhida = 0;
		do {
			opcaoEscolhida = viewNavigation();
			controller(opcaoEscolhida);
		}while(opcaoEscolhida != 7);
		System.out.println("Sistema encerrado com sucesso!");
	}
	public static byte viewNavigation() {
		byte opcao;
		System.out.println("Selection a opcion below: ");
		System.out.println("1 - Consult Stock");
		System.out.println("2 - Register product");
		System.out.println("3 - Update product");
		System.out.println("6 - Delete a product");
		System.out.println("7 - Exit");
		opcao = x.nextByte();
		if(opcao == 3) {
			do {
				System.out.println("4 - Add quantity product");
				System.out.println("5 - Removed quantity product");
				System.out.println("0 - Back");
				opcao = x.nextByte();
			}while(opcao != 0 && opcao != 4 && opcao != 5);
			if(opcao == 0) viewNavigation();
		}
		return opcao;
	}
	public static void controller(byte opcaoEscolhida) {
		Estoque producte;
		switch(opcaoEscolhida) {
			case 1:
				try {
					for(Estoque product : products) { 
						if(product != null) {
							System.out.println(product.toString());							
						}	
					};
				}catch(java.lang.NullPointerException e) {
					System.out.println("Error: " + e);
				}
				break;
			case 2:
				createProduct ();
				break;
			case 4:
				producte = seachProduct();
				if(producte.getName() != null) {
					System.out.println("Enter Quantity: ");
					producte.addProduct(x.nextInt());
				}
				break;
			case 5:
				producte = seachProduct();
				if(producte.getName() != null) {
					System.out.println("Enter Quantity: ");
					producte.removedProduct(x.nextInt());
				}
				break;
			case 6:
				producte = seachProduct();
				if(producte.getName() != null) {
					deleteProduct(producte);
					System.out.println("Produto deletado com sucesso");
				}
				break;
		}
	}
	public static void deleteProduct(Estoque product) {
		for(Estoque producte : products ) if(producte != null) if (producte.equals(product)) products[product.getById()] = null;	
	}
	public static Estoque seachProduct() {
		System.out.println("Digite o id do product: ");
		int id = x.nextInt();
		Estoque product = new Estoque();
		for(int i = 0; i < products.length;i++) {
			if(products[i] != null) {
				if(products[i].getById() == id) {
					product = products[i];
					return product;
				}
			}
		}
		System.out.println("Produto não localizado!");
		return product;
	}
	public static void createProduct () {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		String name = x.nextLine();
		System.out.printf("Price: ");
		double price = x.nextDouble();
		System.out.printf("Quantity in stock: ");
		int quantity = x.nextInt();		
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				Estoque product = new Estoque(i,name,price,quantity);
				products[i] = product;
				break;
			}
		}
	}
}
