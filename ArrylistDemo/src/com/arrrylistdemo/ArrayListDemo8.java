package com.arrrylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo8 
{

	public static void main(String[] args) {

     ArrayList<Employee> al = new ArrayList<Employee>();
     
 	al.add(new Employee(10, "mayur", "12000"));
 	al.add(new Employee(11, "raj", "62211"));
 	Employee employee = new Employee(71, "sham", "4562");
 	al.add(employee);
     
 	// way1
 	System.out.println(al);
 	                       System.out.println("******************");
 	// way2
 	for (Employee e1 :al)
 	{
 		System.out.println("data is "+e1);
 		                        
 	} 
 	                       System.out.println("******************");
 	// way3
 	Iterator<Employee>itr = al.iterator();
 	while(itr.hasNext())
 	{
 		System.out.println("employee list"+itr.next());
 	}	
  }
}


