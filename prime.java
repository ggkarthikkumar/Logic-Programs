package second;

import java.util.Scanner;

public class prime 
    {
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     int c=0;
     System.out.print("Enter a number : ");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
      if(n%i==0)
      {
    	  c++;
      }
     }
     if(c<=2)
     {
      System.out.println(n+" is  a prime number");	 
     }
     else
     {
      System.out.println(n+" is not a prime number");	 
     }
	}
}
