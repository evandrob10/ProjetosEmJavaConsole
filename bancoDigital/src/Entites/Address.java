package Entites;

public class Address {
	private String street, city , country;
	private Integer numberHouse,id;
	private Boolean merchant;
	
	public Address(Integer id,String street,Integer numberHouse,String country,String city,Boolean merchant){
		this.id = id;
		this.street = street;
		this.numberHouse = numberHouse;
		this.country = country;
		this.city = city;
		this.merchant = merchant;
	}
	public Integer getId() {
		return id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getNumberHouse() {
		return numberHouse;
	}
	public void setNumberHouse(Integer numberHouse) {
		this.numberHouse = numberHouse;
	}
	public Boolean getMerchant() {
		return merchant;
	}
	public void setMerchant(Boolean merchant) {
		this.merchant = merchant;
	}
	public String toString() {
		return String.format("ID: %d | Street: %s ,%d - %s - %s ",id,street,numberHouse,country,city);
	}
	
}
