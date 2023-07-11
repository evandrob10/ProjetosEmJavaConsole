package Entites;

public class Estoque {
	private int id;
	private String name; 
	private double price;
	private int quantity;
	
	public Estoque () {}
	public Estoque(int id, String name, double price, int quantity){
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getById() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void addProduct( int quantity) {
		this.quantity += quantity;
	}
	public void removedProduct( int quantity) {
		this.quantity -= quantity;
	}
	public double valueTotalInStock() {
		return this.price * this.quantity;
	}
	public String toString() {
		return String.format("ID: %d | Product data: %s, price: $ %.2f, %d units, total: $ %.2f",id,name,price,quantity,valueTotalInStock());
	}
}
