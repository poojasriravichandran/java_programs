import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int x=in.nextInt();
		int n=in.nextInt();
		
		double y,sum=0;
		for(int i=1;i<=n;i++)
		{
			y= Math.pow(x,i);
			sum+=(y/i);
		}
		System.out.println(sum);
	}
}
