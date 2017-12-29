package com.psl.example1;

import java.io.DataInputStream;

public class Example1 {
	static String[] initProductNames()
	{
		String productName[]=new String[3];
		productName[0]="Samsung";
		productName[1]="Nokia";
		productName[2]="Honor";
		return(productName);
	}
	static boolean isPresent(String[] productNames,String keyword)
	{
		for(int i=0;i<productNames.length;i++)
		{
			if(productNames[i].equalsIgnoreCase(keyword))
			{
				 return true;
			}
			
		}return(false);
	}
	public static void main(String args[])
	{
		//example1 a=new example1();
		String keyword;
		DataInputStream d=new DataInputStream(System.in);
		try{
			System.out.println("Enter the keyword u want to search");
		keyword=d.readLine();
		String productNames[]=initProductNames();
		Boolean data=isPresent(productNames,keyword);
		if(data==true)
			System.out.print("Product available");
		
		else 
			System.out.print("No product available");
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
}}
