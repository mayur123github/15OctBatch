package com.arrrylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo5Sort 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList ();
		al.add("sham");
		al.add("ashok");
		al.add("ram");
		al.add("zishan");
		al.add("rahul");
		
		
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}
}

