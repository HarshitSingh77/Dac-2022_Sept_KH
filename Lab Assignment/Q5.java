import java.util.*;

class Q5
{
		public static void main(String args[])
		{
				System.out.println("Enter Number of Days : ");
				
				Scanner sc=new Scanner(System.in);
				
				int Days= sc.nextInt();
				int Years= (Days/365);
				int Months= (Days % 365) /30 ;
				int days= (Days%365) % 30 ;
				
				System.out.println("Number of Years : "+Years) ;
				System.out.println("Number of Months : "+Months);
				System.out.println("Number of Days "+days);
		}
}