package com.vm.entity;

public class Employee 
{
	private int id;
	private String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void viewEmployeeInfo()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		address.viewAddress();
	}
}
