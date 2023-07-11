package entites;

import java.time.Instant;

import entites.enums.OrderStatus;

public class Order {
	private int id;
	private Instant moment;
	private OrderStatus status;
	
	public Order() {}
	
	public Order(int id, OrderStatus status) {
		this.id = id;
		this.moment = Instant.now();
		this.status = status;
	}	
	public int getId() {
		return id;
	}
	public Instant getMoment() {
		return moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}
