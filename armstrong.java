package second;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,s,r,n1;
	System.out.print("Enter a number : ");
	n=sc.nextInt();
	s=0;n1=n;
    while(n>0)
    {
    	r=n%10;
    	s=s+r*r*r;
    	n=n/10;
    }
    if(n1==s)
    {
    	System.out.println(n1+" is a armstrong number");
    }
    else
    {
    	System.out.println(n1+" is not a armstrong number");
    }
	}

}
