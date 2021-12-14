package com.manipal.restaurant.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.restaurant.bean.*;
public class RestaurantDaoImplementation implements RestaurantDaoInterface{

	@Override
	public int enterNewFoodItem(FoodItem foodItem) {
		Connection con=DbConnection.getConnection();
		try
		{
		String query="INSERT INTO fooditem VALUES(itemseq.nextval,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		//ps.setString(1,foodItem.getItemId());
		ps.setString(1, foodItem.getItemName());
		ps.setString(2,foodItem.getItemType());
		ps.setDouble(3,foodItem.getPrice());
		ps.setInt(4, foodItem.getQuantity());
		return ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		return 0;
	}

	@Override
	public List<FoodItem> getMenu() {
		
		Connection con=DbConnection.getConnection();
		String query="SELECT * FROM fooditem";
		try
		{		
		PreparedStatement ps=con.prepareStatement(query);		
		ResultSet rs=ps.executeQuery();
		List <FoodItem>itemList=new ArrayList<FoodItem>();		
		while(rs.next())
		{
					FoodItem item=new FoodItem();
					item.setItemId(rs.getString(1));
					item.setItemName(rs.getString(2));
					item.setItemType(rs.getString(3));
					item.setPrice(rs.getDouble(4));
					item.setQuantity(rs.getInt(5));					
					itemList.add(item);					
		}
				
		return itemList;		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
    return null;
}

	@Override
	public boolean orderItem(String itemId) {
		//  Insert a record into order table
				
		return true;
	}

	@Override
	public FoodItem getItemAvailability(String itemName) {
		
		FoodItem item=new FoodItem();
		Connection con=DbConnection.getConnection();
		String query="SELECT * FROM FoodItem WHERE itemname=?";
		try
		{
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,itemName.trim());
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			item.setItemId(rs.getString(1));
			item.setItemName(rs.getString(2));
			item.setItemType(rs.getString(3));
			item.setPrice(rs.getDouble(4));
			item.setQuantity(rs.getInt(5));
			System.out.println("item retrived");
		
		
			return item;
		}
		
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		return null;
	}
}
