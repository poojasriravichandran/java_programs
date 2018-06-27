package greatest;

public class check_greatest {
public static int my_great(int a,int b) {
	if(a>b)
		return a;
	else 
		return b;
}
	public static void main(String[] args) {
		
			System.out.println(my_great(3,59));
			System.out.println(my_great(100,20));
	}

}
