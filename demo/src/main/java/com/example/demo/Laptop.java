package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {

	public Laptop() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Laptop - Constructor");
	}
	
	private int lapId;
	private int lapBrand;
	
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	
	public int getLapBrand() {
		return lapBrand;
	}
	public void setLapBrand(int lapBrand) {
		this.lapBrand = lapBrand;
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inside Laptop - Show()");
	}
}
