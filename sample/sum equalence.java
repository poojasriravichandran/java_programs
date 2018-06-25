import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int i,j,n,sum=6;
	    n=scan.nextInt();
	    int [] arr=new int[n];
	    for(i=0;i<n;i++) 
	    {
         arr[i]=scan.nextInt();
	}
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
		if(arr[i]+arr[j]==sum)
			System.out.println(arr[i]+","+arr[j]);
	}		
}
	}
}
