package com.kg.demo.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String todayInFormat = format.format(today);
		System.out.println(todayInFormat);
		
		format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		todayInFormat = format.format(today);
		System.out.println(todayInFormat);
		
		format = new SimpleDateFormat("dd-M-yyyy z hh:mm:ss");
		todayInFormat = format.format(today);
		System.out.println(todayInFormat);
		
		format = new SimpleDateFormat("E, dd-MMMM-yyyy hh:mm:ss z");
		todayInFormat = format.format(today);
		System.out.println(todayInFormat);
			
		format = new SimpleDateFormat("EEEE, dd-MMMM-yyyy hh:mm:ss");
		todayInFormat = format.format(today);
		System.out.println(todayInFormat);
		
		
	}

}
