package Entites;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class User {
	protected Integer id;
	List <Address> address = new ArrayList<>();
	List <AccountSimple> card = new ArrayList<>();
	public User(Integer id) {
		this.id = id;
	}
	public void setAccountSimple(AccountSimple cardSimple) {
		card.add(cardSimple);
	}
	public void viewSingleCard(AccountSimple card) {
		List <AccountSimple> findCard = this.card.stream().filter(element -> element.equals(card)).collect(Collectors.toList()); 
		System.out.println(findCard);
	}
	
	public void setAddress(Address newAddress) {
		address.add(newAddress.getId(),newAddress);
	}
	public void viewSingleAddress(Address address) {
		System.out.println(this.address.get(address.getId()));
	}
	public void viewAllAddress() {
		for(Address endereco : address) {
			System.out.println(endereco.toString());
		}
	}
}
