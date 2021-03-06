
package com.ing.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employees")
public class IngViewModel {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
//	@NotNull
//	@Size(min=2, message="first name should have atleast 2 characters")
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
