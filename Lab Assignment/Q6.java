import java.util.*;

class Q6
{
		public static void main(String args[])
		{
				System.out.println("Enter Temperature (F) to Convert : ");
				
				Scanner temp=new Scanner(System.in);
				
				Double f= temp.nextDouble();
				Double Celsius = 5* (f-32)/9 ;
				
				System.out.println("Temperature in Celsius : "+Celsius+"c");
			
		}
}