package green123;

public class demo12 {
	public static void main(String[]args)
	{
	String a1="Today is my interview and my interview today went well";
	String ch[]=a1.split(" ");
	for(int i=0;i<=ch.length-1;i++)
	{
	if(ch[i]!=null)
	{
	for(int j=i+1;j<=ch.length-1;j++)
	{
	if(ch[i].equals (ch[j]))
	{
	ch[j]= null;
	}}}
	System.out.println(ch[i]);
	}
	}}


