/**
 * 
 */
package com.jithu.spring.Java_spring;

import java.util.List;

/**
 * @author Jithu Paul
 *
 */
public class Customer {
	private String Customername_;
	private List<String> namelist;
	
	public Customer(String Customername_,List<String> namelist){
	this.Customername_= Customername_;
	this.namelist= namelist;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Customer names in "+ Customername_);
		sb.append(" are:\n");
		
		for(String namelist:namelist ){
			sb.append(namelist);
			sb.append("\n");
		}
		return sb.toString();
	}	

}
