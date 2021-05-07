package com.bah.msd.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EVENTS")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String eventName;
	private Date eventDate;
	private Double eventPrice;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return eventName;
	}

	public void setName(String name) {
		this.eventName = name;
	}

	public Date getDate() {
		return eventDate;
	}

	public void setDate(Date date) {
		this.eventDate = date;
	}

	public Double getPrice() {
		return eventPrice;
	}

	public void setPrice(Double price) {
		this.eventPrice = price;
	}

	
}
