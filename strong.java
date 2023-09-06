package second;

import java.util.Scanner;

public class strong {

	public static void main(String[] args) {
	int n,n1,s,r;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a numer : ");
    n=sc.nextInt();
    s=0;
    n1=n;
    while(n>0)
    {
    	r=n%10;
    	int fact=1;
    	for(int i=1;i<=r;i++) {
    		fact=fact*i;
    	}
    	s=s+fact;
    	n=n/10;
    }
    if(s==n1)
    {
    	System.out.println(n1+" is a storng number.");
    }
    else
    {
    	System.out.println(n1+" is not a storng number.");
    }
	}

}
