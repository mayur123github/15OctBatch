package com.arrrylistdemo;

import java.util.ArrayList;

public class Arraylistdemo9 
 // design method which return Arraylist of Employee
{ 
	int x =20;
	
	public ArrayList<Employee> getEmployeeList()
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(78, "kajal", "506")); // object 1
		al.add(new Employee(89, "devansh", "109")); // object 2
		return al;
	}
	
	
	 

	
	public static void main(String[] args) 
	{
		Arraylistdemo9 arraylistdemo9 = new Arraylistdemo9();
	      ArrayList<Employee> emplist = arraylistdemo9.getEmployeeList();
	      System.out.println(emplist);
		
		
		
	}
	
	
}



