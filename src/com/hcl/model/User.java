package com.hcl.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registered_users")
public class User implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lname;
	private String email;
	private String username;
	private String password;
	private String hobby;
	private String gender;
	private String country;
	public User() {
		
	}
	public User( String fName, String lname, String email, String username, String password, String hobby,
			String gender, String country) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.hobby = hobby;
		this.gender = gender;
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lname=" + lname + ", email=" + email + ", username="
				+ username + ", password=" + password + ", hobby=" + hobby + ", gender=" + gender + ", country="
				+ country + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
