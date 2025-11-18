package com.hust.kstn.models;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private String id, title, category, director;
	private int length;
	private float cost;
	private int quantity;
	
	public DigitalVideoDisc() { id = Integer.toString(++nbDigitalVideoDiscs); }
	public DigitalVideoDisc(String title) {
		this();
		this.title = title;
		this.quantity = 1;
	}
	public DigitalVideoDisc(String category, String title, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		this(category, title, cost);
		this.director = director;
	}
	public DigitalVideoDisc(String id, String title, String category, String director, int length, float cost, int quantity) {
		this(director, category, title, cost);
		this.id = id;
		this.length = length;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void play() {
		// TODO
	}
	public void playDemo() {
		// TODO
	}
	
	@Override
	public String toString() {
//		float total = cost * quantity;
//		return "[ID]: " + id + ", [Title]: " + title + ", [Cost]: " + cost + "/DVD, [Total]: " + total + ", [Length]: " + length + ", [Category]: " + category + ", [Director]: " + director);
		return "DVD" + "[" + id + "]" + " - [" + title + "]" + " - [" + cost + "]" + " - [" + director + "]" + " - [" + length + "]" + " - [" + category + "]";
	}
}
