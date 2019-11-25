
package Sumofnumbers;

import java.util.Scanner;

public class Largestno 
{
	public static void main(String[]args) 
	{
		int n,max;

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("enter the limit :");
		
		n = sc.nextInt();
		
		int a[] = new int[n];
				
	    System.out.println("enter the numbers :");

				
		
		for(int i=0; i<n ;i++)
		{
			 a[i]  = sc.nextInt();
		}
		max = a[0] ;
	    
		for(int i=0;i<n;i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		 

			System.out.println("largest is :" +max);
	}


		
		

}
