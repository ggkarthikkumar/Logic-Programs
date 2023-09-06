package second;
public class reverseString {

	public static void main(String[] args) {
	String s="Karthik";
	String s1="Kumar";
	String s2="Niranjan";
	System.out.println(s+" "+s1+" "+s2);
	for(int i=s.length()-1;i>=0;i--)
	{
	  System.out.print(s.charAt(i));
    } 
	System.out.print(" ");
	for(int i=s1.length()-1;i>=0;i--)
	{
	  System.out.print(s1.charAt(i));
    }
	System.out.print(" ");
	for(int i=s2.length()-1;i>=0;i--)
	{
	  System.out.print(s2.charAt(i));
    }
	}

}
