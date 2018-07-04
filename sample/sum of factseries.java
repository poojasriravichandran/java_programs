package sumof_factseries;

import java.util.Scanner;

public class Sumof_factseries {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x= in .nextInt();
		int n = in .nextInt();
		int i,j;
		
		int var;
		double y,sum=0;
		for(i=1;i<=n;i++)
		{var=1;
			for(j=1;j<=i;j++)
			{
				var=var*j;
			}
			y=Math.pow(x,i);
			sum=sum+(y/var);
		}
		System.out.println(sum);
	}

}
