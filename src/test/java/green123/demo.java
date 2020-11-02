package green123;

public class demo {
	
	public static void main(String[]args)
	{
	double a=345.02;
	double g=a*100;
	int no=(int)g;
	int rev=0;
	while(no!=0)
	{
	int rem=no%10;  
	rev=rev*10+rem;
	no=no/10;

	}
	double h=rev;
	System.out.println(h/1000);
	}}

