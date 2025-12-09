package com.secure_login_out.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fullname;
	private String email;
	private String address;
	private String password;
	private String role;
	

	public User() {
	}

	public User(int id, String fullname, String email, String address, String password, String role) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User id(int id) {
		setId(id);
		return this;
	}

	public User fullname(String fullname) {
		setFullname(fullname);
		return this;
	}

	public User email(String email) {
		setEmail(email);
		return this;
	}

	public User address(String address) {
		setAddress(address);
		return this;
	}

	public User password(String password) {
		setPassword(password);
		return this;
	}

	public User role(String role) {
		setRole(role);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof User)) {
			return false;
		}
		User user = (User) o;
		return id == user.id && Objects.equals(fullname, user.fullname) && Objects.equals(email, user.email) && Objects.equals(address, user.address) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, fullname, email, address, password, role);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", fullname='" + getFullname() + "'" +
			", email='" + getEmail() + "'" +
			", address='" + getAddress() + "'" +
			", password='" + getPassword() + "'" +
			", role='" + getRole() + "'" +
			"}";
	}
	
	
}
