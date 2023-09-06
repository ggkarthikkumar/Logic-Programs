package second;
import java.util.*;
public class adam {

	public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     System.out.println("Enter the number");
     int n=in.nextInt();
     int m =n*n;int s = 0;
     while(m>0) {
    	int r =m%10;
    	   s=(s*10)+r;
    	 m =m/10;
     }
      int t = (int) Math.sqrt(s);
      int f=0;
      while(t>0) {
    	  int  r =(t%10);
    	   f = (f*10)+r;
    	      t=t/10;
      }
      if(n==f) {
    	  System.out.println(n +" Adam number");
      }
      else 
    	  System.out.println(n+" Not a adam number");
	}

}
