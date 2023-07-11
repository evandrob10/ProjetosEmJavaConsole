package Application;

import entites.Order;
import entites.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(10, OrderStatus.valueOf("PENDING_PAYMENT"));
		System.out.println(order.toString());
	}

}
