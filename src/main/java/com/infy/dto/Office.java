package com.infy.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="off_det")
public class Office {
	
	@Id
	int officeid;
	String ostreet;
	String ocity;
	
	
	
	public Office() {
		super();
	}



	public Office(int officeid, String ostreet, String ocity) {
		super();
		this.officeid = officeid;
		this.ostreet = ostreet;
		this.ocity = ocity;
	}



	public int getOfficeid() {
		return officeid;
	}



	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}



	public String getOstreet() {
		return ostreet;
	}



	public void setOstreet(String ostreet) {
		this.ostreet = ostreet;
	}



	public String getOcity() {
		return ocity;
	}



	public void setOcity(String ocity) {
		this.ocity = ocity;
	}



	@Override
	public String toString() {
		return "Office [officeid=" + officeid + ", ostreet=" + ostreet + ", ocity=" + ocity + "]";
	}
	

}
