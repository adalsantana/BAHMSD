package com.bah.msd.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="REGISTRATIONS")
public class Registration {
	//  Workshop:
	//
	//  Implement Registration.  Your implementation is very likely going to change 
	//  over time as you add functionality 
	long event_id;
	long customer_id;
	Date registration_date;
	String notes;
	
	public Registration(long event_id, long customer_id, Date registration_date, String notes) {
		super();
		this.event_id = event_id;
		this.customer_id = customer_id;
		this.registration_date = registration_date;
		this.notes = notes;
	}
	
	
	//return null;
}