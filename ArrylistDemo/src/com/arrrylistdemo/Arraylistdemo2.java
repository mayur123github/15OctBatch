package com.arrrylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo2 
{

	public static void main(String[] args) 
	{
		 ArrayList  al = new ArrayList ();
		   al.add(10); 
		   al.add(20); 
		   al.add(30);   
		   al.add ("mayur");
		   al.add('a');
		  
		   
		   
		   // way 1 - printing  in one line 
		   System.out.println(al);
		                         System.out.println("************************"); // only put for sepration 
		   // way2  -  printing each object in each line 
		   for (Object i : al)
		   {
			   System.out.println(i);
		   }
		                         System.out.println("************************");// only put for sepration
		   // way 3 - printing each object in each line 
		   Iterator itr = al.iterator();
		   while (itr.hasNext())
		   {
			   System.out.println(itr.next());
		   }
	}
}



//ArrayList <Integer> al1 = new ArrayList<Integer>();
//al1.add(40); 
//al1.add(50);          
//
//al.addAll(al1);
