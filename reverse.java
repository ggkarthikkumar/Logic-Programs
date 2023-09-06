package second;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
	int r,n,s;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	n=sc.nextInt();
	s=0;
    while(n>0)
    {
    	r=n%10;
    	s=s*10+r;
    	n=n/10;
    }
    	System.out.println("Reverse : "+s);
	}
}
