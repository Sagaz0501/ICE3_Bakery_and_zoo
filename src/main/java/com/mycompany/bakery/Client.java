package com.mycompany.bakery;

public class Client {

	private String name;

	/**
	 * 
	 * @param name
	 */
	public Client(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param deliveredBy
	 */
	public void receiveBread(String deliveredBy) {
            System.out.println(name + " received his bread. (Delivered by " + deliveredBy + ")");
	}

	public String getName() {
		return this.name;
	}

}