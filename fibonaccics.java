package second;

import java.util.Scanner;

public class fibonaccics {

	public static void main(String[] args) {
    //Fibo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 38
	int i,n1=0,n2=1,n3;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	}

}
