package demo1;

import java.util.Scanner;

public class Febbonance_Series // 0 1 1 2 3 5 8 13 .......
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=0;
		int d=10;
	//	System.out.println("How many digit you want =");
	    
	//	Scanner obj =new Scanner(System.in);
	//	d=obj.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		
        for(int i=1;i<=d-2;i++)
		{
        	c=a+b;
			System.out.print(c+" ");
			
			  
		      a=b;
		      b=c;
		}
		
	}

}
