

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double billAmount;
	
	
	public Customer(String name, double billAmount) {
		super();
		this.name = name;
		this.billAmount = billAmount;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
	
	
}
