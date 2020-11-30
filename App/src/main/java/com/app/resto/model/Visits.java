package com.app.resto.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Visits {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date dateVisit;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="RESTO_ID")
	private Resto resto;
	
	public Visits() {}
	
	public Visits(Long id, Date dateVisit, Resto resto) {
		this.id=id;
		this.dateVisit=dateVisit;
		this.resto=resto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateVisit() {
		return dateVisit;
	}

	public void setDateVisit(Date dateVisit) {
		this.dateVisit = dateVisit;
	}
	
	public void setResto(Resto resto) {
		this.resto=resto;
	}
}
