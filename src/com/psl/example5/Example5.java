package com.psl.example5;

import java.util.Scanner;

public class Example5 {
	static char array[][]=new char[3][3];
	static int flag=0;
	static char win;
	//inital value of data
	static void initvalue()
	{
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				array[i][j]=' ';
		}
	}
	//board initialisation
	static void initboard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+ "|");
			}
			System.out.print("\n-----------------\n");
		}
	}
	//get input from user
	static void getValues()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{   Scanner d=new Scanner(System.in);
				System.out.println("Enter X or O at position " +i+"row,"+j+"column");
				array[i][j]=d.next().charAt(0);
			}
		}
	}
	//final display of board with user input
	static void setValues()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+ "|");
			}
			System.out.print("\n-----------------\n");
		}
	}
	//check for row
	static void checkrow()
	{
		int i=0;
		
		do{
		if(array[i][0]==array[i][1]&& array[i][0]==array[i][2])
		{
		 win=array[i][0];
		 flag=1;
		 break;
		}
		else
			i++;
		}while(i<3);
		if (flag==1)
		System.out.println( "winner "+win);
	}
	//check for column
	static void checkcol()
	{
		int i=0;
		do{
			if(array[0][i]==array[1][i]&& array[0][i]==array[2][i])
			{ win=array[0][i];
			flag=1;
			 break;
			}
			else
				i++;
			}while(i<3);
	if(flag==1)
		System.out.println( "winner "+win);
	}
	//check for diagonal
	static void checkdiag()
	{
		if(array[0][0]==array[1][1]&& array[0][0]==array[2][2])
		{win=array[0][0];
			flag=1;		}
		else if(array[0][2]==array[1][1]&& array[0][2]==array[2][0])
			{win=array[1][1];
			 flag=1;
			}
		else
		{	System.out.println("Game Over"); 
		 }
		if(flag==1)
			System.out.println( "winner "+win);
	}
	public static void main(String args[])
	{
		initvalue();
		initboard();
		getValues();
		setValues();
		checkrow();
		if(flag!=1)
		{
			checkcol();
			if(flag!=1)
				checkdiag();
		}
	}

	}


