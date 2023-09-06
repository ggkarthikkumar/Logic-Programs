package second;

import java.util.Scanner;

public class polindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,s,r,n1;
	System.out.print("Enter a number : ");
	n=sc.nextInt();
	s=0;n1=n;
    while(n>0)
    {
    	r=n%10;
    	s=s*10+r;
    	n=n/10;
    }
    if(n1==s)
    {
    	System.out.println(n1+" is a polindrome");
    }
    else
    {
    	System.out.println(n1+" is not a polindrome");
    }
	}

}
