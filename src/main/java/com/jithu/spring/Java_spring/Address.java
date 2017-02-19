/**
 * 
 */
package com.jithu.spring.Java_spring;

/**
 * @author Jithu Paul
 *
 */
public class Address {
	private String street;
	private String zipcode;
	public Address(){
		
	}
	public Address(String street, String zipcode) {
		this.street = street;
		this.zipcode = zipcode;
	}
	public void display(){
		System.out.println("checking Address class for address details");
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}
	public void log(){
		System.out.println("Address Loading complete");
	}
	public String getStreet() {
		return street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
