package com.jithu.spring.Java_spring;
/**
 * @author Jithu Paul
 *
 */
public class Person {
	private int id;
	private String name;
	private int taxId;
	
	public Person(){
		
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}
	public void display(){
		System.out.println("Container class Person displaying and reading from beans.xml-");
	}
	public void log(){
		System.out.println("Reading complete");
	}
}
