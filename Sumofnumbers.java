
package Sumofnumbers;

public class Sumofnumbers
{
	public static void main(String[]args)
	{
		int[] array = {10,20,40,10,20};
		int sum = 0;
		
		for (int num : array)
		{
			sum = sum+num;
		}
		System.out.println("sum :" +sum);

	}
}