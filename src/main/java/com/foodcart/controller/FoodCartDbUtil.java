package com.foodcart.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {
	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/food?characterEncoding=utf8&autoReconnect=true&useSSL=false";
	static String userName = "root";
	static String password = "";

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {
		ArrayList<Food> food = new ArrayList<Food>();
		// Register the Driver
		Class.forName(driver);
		// Create the connection
		Connection con = DriverManager.getConnection(url, userName, password);
		// create the statement
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM foodcart;");
		// Execute the query
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String item = rs.getString(2);
			float price = rs.getFloat(3);
			Food f = new Food(id, item, price);
			food.add(f);
		}
		return food;

	}

}
