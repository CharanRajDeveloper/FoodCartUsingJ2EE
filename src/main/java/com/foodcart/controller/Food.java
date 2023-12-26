package com.foodcart.controller;

public class Food {
	private int id;
	private String item;
	private Float price;

	public Food(int id, String item, Float price) {
		this.id = id;
		this.item = item;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
