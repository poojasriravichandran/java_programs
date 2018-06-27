package positive;

public class positive_negative {
public static int my_opp(int n) {
	if(n>0)
		return 1;
	else if(n<0)
		return 2;
	else 
		return 0;
	
}
	public static void main(String[] args) {
		int n=7;
		if(my_opp(n)==1)
			System.out.println("positive");
		else if(my_opp(n)==2)
			System.out.println("negative");
		else
			System.out.println("zero");

	}

}
