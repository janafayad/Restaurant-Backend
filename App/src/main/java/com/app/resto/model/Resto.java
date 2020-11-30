package com.app.resto.model;

import java.util.List;

import javax.persistence.*;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;


@Entity
@Table(name="restos")
public class Resto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nameResto")
	private String nameResto;
	
	@Column(name="typeResto")
	private String typeResto;
	
	@Column(name="costForTwo")
	private int costForTwo;
	
	@Column(name="addressResto")
	private String addressResto;
	
	@Column(name="phoneNumber")
	private int phoneNumber;
	
	@OneToMany(mappedBy = "resto")
	private List<Visits> visits;
	
	public Resto() {}

	public Resto(String nameResto, String typeResto, int costForTwo, String addressResto, int phoneNumber) {
		super();
		this.nameResto = nameResto;
		this.typeResto = typeResto;
		this.costForTwo = costForTwo;
		this.addressResto = addressResto;
		this.phoneNumber = phoneNumber;
	}
	
	public Long getId() {
		return id;
	}

	public String getNameResto() {
		return nameResto;
	}

	public void setNameResto(String nameResto) {
		this.nameResto = nameResto;
	}

	public String getTypeResto() {
		return typeResto;
	}

	public void setTypeResto(String typeResto) {
		this.typeResto = typeResto;
	}

	public int getCostForTwo() {
		return costForTwo;
	}

	public void setCostForTwo(int costForTwo) {
		this.costForTwo = costForTwo;
	}

	public String getAddressResto() {
		return addressResto;
	}

	public void setAddressResto(String addressResto) {
		this.addressResto = addressResto;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setVisits(List<Visits> visits) {
		this.visits = visits;
	}
	

	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Resto{");
	        sb.append("Name: ").append(nameResto);
	        sb.append(", Type: '").append(typeResto).append('\'');
	        sb.append(", Cost For Two: '").append(costForTwo).append('\'');
	        sb.append(", Address: '").append(addressResto).append('\'');
	        sb.append(", Phone Number: ").append(phoneNumber);
	        sb.append('}');
	        return sb.toString();
	    }
	
}
