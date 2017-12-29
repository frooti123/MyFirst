package com.psl.example3;

import java.io.DataInputStream;

public class Example3 {
	private static int array[];
	static int start,end,flag=0,k=0,i;
	static int[] findPrime()
	{
		DataInputStream d=new DataInputStream(System.in);
		try{
		System.out.println("Enetr the start range you want to search prime numbers");
		start=Integer.parseInt(d.readLine());
		System.out.println("Enetr the end range you want to search prime numbers");
		end=Integer.parseInt(d.readLine());
		array=new int[(end-start)]; //array size
		for ( i=start;i<=end;i++)
		{flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag++;
				}
			}
			if (flag==0)
			{array[k]=i;k++;}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}
		return array;
	}
	public static void main(String args[])
	{
		try{
			int value[]=findPrime();
			for(int i=0;i<k;i++)
			System.out.println(value[i]);
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}
	}
}
