import java.util.*;

class Q8
{
		public static void main( String args[] )
		
		{
				System.out.println("Enter Salary of an Employee : ");
				
				Scanner sc= new Scanner(System.in);
				
				double sal= sc.nextDouble( );
				
				double HRA , DA ;
				
				if(sal < 10000)
				{
						HRA = sal * 10/100 ;
						DA = sal * 90/100 ;
				}
				else
				{
						HRA = 2000;
						DA = sal*98/100 ;
				}
				
				Double GS =sal + DA + HRA ;
				System.out.println("Gross Salary of an Employee is :  "+GS);
		}		
				
}