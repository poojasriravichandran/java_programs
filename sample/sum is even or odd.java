package sum_select;

public class Sum_select {
public static boolean sum_evenodd(int n,int i) {
	int sum=0;
	sum=n+i;
	if(sum%2==0)
		return true;
	else 
		return false;
}
	public static void main(String[] args) {
		int a=2,b=3;
		if(sum_evenodd(a,b)==true)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
