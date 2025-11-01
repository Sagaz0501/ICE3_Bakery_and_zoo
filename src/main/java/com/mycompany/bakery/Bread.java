package com.mycompany.bakery;

public class Bread {

	private int id;

	/**
	 * 
	 * @param id
	 */
	public Bread(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

        @Override
	public String toString() {
		return "Bread #" + id;
	}

}