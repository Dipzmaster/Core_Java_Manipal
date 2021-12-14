package com.manipal.restaurant.dao;

import com.manipal.restaurant.bean.FoodItem;

public class TestMain {
public static void main(String[] args) {
	
	
	FoodItem item=new FoodItem();
	item.setItemId("101");
	item.setItemName("Masala Dosa");
	item.setItemType("Tiffin");
	item.setPrice(40.00);
	item.setQuantity(2);
	
	RestaurantDaoInterface ri=new RestaurantDaoImplementation();
	int status=ri.enterNewFoodItem(item);
	if(status>0)
		System.out.println("item inserted");
	else
		System.out.println("error in inserting item");
	
}
}
