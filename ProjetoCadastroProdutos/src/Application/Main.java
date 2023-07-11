package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entites.ImportedProduct;
import Entites.Product;
import Entites.UsedProduct;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Product> products = new ArrayList<>();
		
		System.out.printf("Enter the number of products: ");
		int num = sc.nextInt();
		
		int count = 1;
		
		while(count <= num) {
			System.out.printf("Product #%d data:\n",count);
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(typeProduct == 'i') {
				System.out.print("Customs fee: ");
				products.add(new ImportedProduct(name,price,sc.nextDouble()));
			}else if(typeProduct == 'u') {
				sc.nextLine();
				System.out.print("Manufacture date: ");
				products.add(new UsedProduct(name,price,LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
			}else {
				products.add(new Product(name,price));
			}
						
			count++;
		}
		
		System.out.println("PRICE TAGS");
		
		for(Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
