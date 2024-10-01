package com.lalethbook;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;

public class Inventory
{
	Statement stmt;
	ResultSet rs;
	String qry=null;
	Dbutil db=new Dbutil();
	Connection con;
	bookshop b=new bookshop();

 public void add(bookshop b)
 {
	 try
	 {
		 int count=0;
		 Connection con=db.getDBConnection();
		 stmt=con.createStatement();
		 qry="insert into book(name,shop_name,book_name,author,price,cust_id) values('"+b.getName()+"','"+b.getShop_name()+"','"+b.getBook_name()+"','"+b.getAuthor()+"','"+b.getPrice()+"','"+b.getCust_id()+"')";
		 count = stmt.executeUpdate(qry);
		 if(count==1)
			 System.out.println("Data inserted successfully");
		 else
			 System.out.println("Data is not inserted");
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.getMessage());
	 }
 }

public void show()
 {
	try
	{
		con=db.getDBConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from book");
		while(rs.next())
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
 }
 public void update(bookshop b)
 {
	
	 
	 try
	 {
		 int count=0;
		 con=db.getDBConnection();
		 stmt=con.createStatement();
		 count=stmt.executeUpdate("update book set name='"+b.getName()+"' where cust_id='"+b.getCust_id()+"'");
		 if(count==1)
			 System.out.print("Updation done successfully");
		 else
			 System.out.println("Updation is not done");
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.getMessage()); 
 }
 }
 public void remove(String cust_id)
 {
	 try
	 {
		 int count=0;
		 con=db.getDBConnection();
		 stmt=con.createStatement();
		 qry="delete from book where cust_id='"+cust_id+"'";
		 count=stmt.executeUpdate(qry);
		 if(count==1)
			 System.out.println("Deleted successfully");
		 else
			 System.out.println("Not deleted");
				
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.getMessage());
	 }
 }
 
}

