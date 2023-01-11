package com.arrrylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ArraylistDemo 
{
 
	public static void main(String[] args) 
	{ 
	
	   ArrayList  al = new ArrayList ();
	   al.add(10); 
	   al.add(20); 
	   al.add(30);    
	   al.add("mayur");
	   al.add("rahul");
	   al.add('a');
	   
	   //way1
	   System.out.println(al);
	   //way2  if our arrylist has no return type then we can use object class as datatype 
	   for (Object h : al)
	   {
		   System.out.println(h);
	   }
	   
             List list  = Collections.synchronizedList(al);
	   
		   LinkedList<Integer>  l1 = new LinkedList<Integer>();
    
		   
	   
	}

}
