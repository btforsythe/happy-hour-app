package com.teamhappyapp.happyhourapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Establishment {

	@GeneratedValue
	@Id
	private Long establishmentId; // bc null

	private String name;

	private String address;

	private String latitude;
	
	private String longitude;

	public Long getEstablishmentId() {
		return establishmentId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public Establishment(String name, String address, String latitude, String longitude) {
		this.name = name;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	// for jpa
	private Establishment() {
	}

}
