package com.vm.entity;

public class Address 
{
	private String city;
	private String state;
	private String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void viewAddress()
	{
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Country: "+country);
	}
	
}
