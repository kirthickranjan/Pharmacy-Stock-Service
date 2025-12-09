package com.secure_login_out.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String medicine_name;
	private String expiry_date;
	private int quantity;
	private float prize;
	


	public Product() {
	}

	public Product(int id, String medicine_name, String expiry_date, int quantity, float prize) {
		this.id = id;
		this.medicine_name = medicine_name;
		this.expiry_date = expiry_date;
		this.quantity = quantity;
		this.prize = prize;
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

	public String getExpiry_date() {
		return this.expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrize() {
		return this.prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}

	public Product id(int id) {
		setId(id);
		return this;
	}

	public Product medicine_name(String medicine_name) {
		setMedicine_name(medicine_name);
		return this;
	}

	public Product expiry_date(String expiry_date) {
		setExpiry_date(expiry_date);
		return this;
	}

	public Product quantity(int quantity) {
		setQuantity(quantity);
		return this;
	}

	public Product prize(float prize) {
		setPrize(prize);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Product)) {
			return false;
		}
		Product product = (Product) o;
		return id == product.id && Objects.equals(medicine_name, product.medicine_name) && Objects.equals(expiry_date, product.expiry_date) && quantity == product.quantity && prize == product.prize;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, medicine_name, expiry_date, quantity, prize);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", medicine_name='" + getMedicine_name() + "'" +
			", expiry_date='" + getExpiry_date() + "'" +
			", quantity='" + getQuantity() + "'" +
			", prize='" + getPrize() + "'" +
			"}";
	}
	
}
