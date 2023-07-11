package Entites;

public class Funcionarios {
	private int id;
	private String name;
	private Double salary;
	
	public Funcionarios(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double newSalary) {
		salary = newSalary;
	}
	public void updateSalary(Double percentage ) {
		salary = (salary * percentage) + salary;
	}
	public String toString() {
		return String.format("ID: %d | name: %s | salary: %.2f\n", id,name,salary);
	}
}
