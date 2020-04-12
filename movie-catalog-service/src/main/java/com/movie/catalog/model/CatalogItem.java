package com.movie.catalog.model;

public class CatalogItem {

	private String ItemName;
	private String Description;
	private int rating;
	
	
	public CatalogItem() {
		super();
	}


	public CatalogItem(String itemName, String description, int rating) {
		super();
		ItemName = itemName;
		Description = description;
		this.rating = rating;
	}


	public String getItemName() {
		return ItemName;
	}


	public void setItemName(String itemName) {
		ItemName = itemName;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "CatalogItem [ItemName=" + ItemName + ", Description=" + Description + ", rating=" + rating + "]";
	}
	
	
}
