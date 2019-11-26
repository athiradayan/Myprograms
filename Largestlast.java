
package hello;
import java.util.Scanner;


public class Largestlast
{
	  public static void main(String args[]) 
	  {
		  Scanner inp=new Scanner(System.in);
		  int[] numbers =new int[10];
		  int largest,i,location=0,temp;
		  for(i=0;i<10;i++)
		  	{
			  System.out.println("Enter " +i+ "number");
			  numbers[i]=inp.nextInt();
		    }
		  	largest=numbers[0];
		  	for(i=1;i<10;i++) {
			  if(numbers[i]>largest)
				  largest=numbers[i];
			      location=i;
			      temp=numbers[location];
				  numbers[location]=numbers[9];
				  numbers[9]=temp;
		  }
		 
		  System.out.println("result=");
		  for(i=0;i<10;i++) {
			  System.out.println(""+numbers[i]);
		  }
	  }
	}



