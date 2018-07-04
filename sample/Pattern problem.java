package pattern;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int row = in .nextInt(),i,j;
		int val;
		for(i=1;i<=row;i++)
		{
			val=i;
			for(j=1;j<=row;j++)
			{
				
				System.out.print(val);
				val++;
				if(val>row)
					val=1;
				
			}
			System.out.println("\n");
		}
	}

}
