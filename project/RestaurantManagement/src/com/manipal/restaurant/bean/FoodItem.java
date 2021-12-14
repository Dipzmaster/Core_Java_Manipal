package com.manipal.restaurant.bean;

public class FoodItem {
String itemId;
String itemName;
String itemType;
double price;
int quantity;


public FoodItem()
{
	
	
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getItemId() {
	return itemId;
}

public void setItemId(String itemId) {
	this.itemId = itemId;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public String getItemType() {
	return itemType;
}

public void setItemType(String itemType) {
	this.itemType = itemType;
}



}
