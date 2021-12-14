package com.manipal.restaurant.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.restaurant.bean.FoodItem;
import com.manipal.restaurant.dao.RestaurantDaoImplementation;
import com.manipal.restaurant.dao.RestaurantDaoInterface;


public class RestaurantControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		
		
		String str=request.getServletPath();
		
		switch (str)
		{
		
		case "/createItem.do" :
		
			FoodItem item=new FoodItem();
			item.setItemName(request.getParameter("itemname"));
			item.setItemType(request.getParameter("itemtype"));
			item.setPrice(Double.parseDouble(request.getParameter("price")));
			item.setQuantity(Integer.parseInt(request.getParameter("quantity")));
			
			RestaurantDaoInterface restDao=new RestaurantDaoImplementation();
			int result=restDao.enterNewFoodItem(item);
			
			if(result>0)
			{
				request.setAttribute("item",item);
				RequestDispatcher rd2=request.getRequestDispatcher("/itemcreated.jsp");
				rd2.forward(request,response);
			}
			
			break;
			
		case "/getMenu.do" :
			
			RestaurantDaoInterface restDao2=new RestaurantDaoImplementation();					
			List <FoodItem>items=restDao2.getMenu();
			
			HttpSession session=request.getSession();
			session.setAttribute("items", items);
			
			 RequestDispatcher rd=request.getRequestDispatcher("/viewmenu.jsp");
			 rd.forward(request,response);			 
			  break;
			  
			  
		case "/orderitem.do" :
			RestaurantDaoInterface restDao3=new RestaurantDaoImplementation();
			 boolean status=restDao3.orderItem(request.getParameter("itemid"));
			 if(status)
			 {
				 RequestDispatcher rd3=request.getRequestDispatcher("/viewmenu.jsp");
				 
				 request.setAttribute("orderStatus", " Your order is successsfully placed");
				 
				 rd3.forward(request, response);
			 }
			 
			 break;
			 
			 
		case "/getItemAvailability.do" :
			String itemname=request.getParameter("itemname");
			RestaurantDaoInterface obj=new RestaurantDaoImplementation();
			FoodItem i=obj.getItemAvailability(itemname);
			if(i!=null)
			{
		    request.setAttribute("status","Item available");
			request.setAttribute("availableItem",i);
			}
			else
			{
			request.setAttribute("status","Item not avaibalble");
			}
			RequestDispatcher rd4=request.getRequestDispatcher("/index.jsp");
			rd4.forward(request,response);
			
		}

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		processRequest(request,response);
	}

}
