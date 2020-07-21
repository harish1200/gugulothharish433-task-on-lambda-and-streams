package java8;

import java.util.Scanner;

public class Average {
	public static void main(String args[])
	{
		System.out.println("enter the lenght of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter numbers");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}


	float average=average(a);
	System.out.println("The average of all the numbers in the array is"  + average);
	sc.close();
	}


	private static float average(int[] a) {
		float sum=0f;
		for(int number:a)
			
		{
			sum=sum+number;
		}
		return sum/a.length;
	}
	}

