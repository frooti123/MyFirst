package com.psl.example4;
import java.util.*;
public class Example_four
{ static String data[];
static int k;
	 private static String[] combinations(String str)
	{
		int n = str.length();
		permute(str,0,n-1);
		return data;
	}
	private static void permute(String str,int l,int r)
	{
		
		if (l == r)
		{//System.out.println(str);
			data[k]=str;
			k++;
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}
	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	public static void main(String[] args)
	{
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		str=s.next();
		Example_four permutation = new Example_four();
		String data1[]=permutation.combinations(str);
		for(int i=0;i<data1.length;i++)
		{
			System.out.print(data[i]);
		}
	}
}