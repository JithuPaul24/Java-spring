package com.jithu.spring.Java_spring;
/**
 * @author Jithu Paul
 *
 */
public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public Person(){
		
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
		public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void onCreate(){
		System.out.println("oncreate"+this);
	}
	public void onDestroy(){
		System.out.println("onDestroy"+this);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", Address=" + address + "]";
	}
	public void display(){
		System.out.println("checking Person class for name");
	}
	public void log(){
		System.out.println("Name Loading complete");
	}
}
