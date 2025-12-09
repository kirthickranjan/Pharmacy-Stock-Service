package com.secure_login_out.demo.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class p_order {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String medicine_name;
		private int quantity;
		

	public p_order() {
	}

	public p_order(int id, String medicine_name, int quantity) {
		this.id = id;
		this.medicine_name = medicine_name;
		this.quantity = quantity;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicine_name() {
		return this.medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public p_order id(int id) {
		setId(id);
		return this;
	}

	public p_order medicine_name(String medicine_name) {
		setMedicine_name(medicine_name);
		return this;
	}

	public p_order quantity(int quantity) {
		setQuantity(quantity);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof p_order)) {
			return false;
		}
		p_order p_order = (p_order) o;
		return id == p_order.id && Objects.equals(medicine_name, p_order.medicine_name) && quantity == p_order.quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, medicine_name, quantity);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", medicine_name='" + getMedicine_name() + "'" +
			", quantity='" + getQuantity() + "'" +
			"}";
	}
		
		
	}