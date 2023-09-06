package second;

import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n=sc.nextInt();
	int sum=0;
    for(int i=1;i<n;i++)
    {
    	if(n%i==0)
    	{
    		sum=sum+i;
        	System.out.println(i);
    	}
    }
    if(sum==n)
	{
		System.out.println(sum+" is a perfect number");
	}
    else
    {
		System.out.println(sum+" is not a perfect number");

    }
	}
	
}
