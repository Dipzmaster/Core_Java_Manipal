package com.manipal.restaurant.dao;
import java.util.List;

import com.manipal.restaurant.bean.*;
public interface RestaurantDaoInterface {

	public int enterNewFoodItem(FoodItem foodItem);
	public List<FoodItem> getMenu();
	public boolean orderItem(String itemId);
	public FoodItem getItemAvailability(String itemName);
	
}
