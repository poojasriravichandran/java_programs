package sumof_factorial;

import java.util.Scanner;

public class Sumof_factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in .nextInt(),i,j;
		int sum=0,var=1;
		for(i=1;i<=n;i++)
		{var=1;
			for(j=1;j<=i;j++)
			{
				var=var*j;
			}
			sum+=var;
			
		}
		System.out.println(sum);

	}

}
