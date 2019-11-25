package Sumofnumbers;

public class Largestno 
{
	public static void main(String[]args) 
	{
		
		int [] array = {50,20,60,30,10};
		int i;
		int max = array[0];  // Initialize the maximum number
				
		for(i=1;i<5;i++)
		{
			if (array[i] > max)
				max = array[i];
		}
			System.out.println("largest is :" +max);
		}
		

}
