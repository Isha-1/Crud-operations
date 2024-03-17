package com.crud.operations.CRUDapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "facility" )
public class Facility {
	@Id
	@Column(name = "id")
	public int id ;
	@Column(name = "name", nullable=false  )
	public String name  ;
	@Column(name = "service", nullable=false  )
	public String service  ;
}
