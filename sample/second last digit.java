package secondlast;

public class Second_last {
public static int my_second(int n) {
int num;
if(n<0)
	n*=-1;
	if(n>=10)
	{
		num=(n%100)/10;
		return num;
	}
		else 
		
	return -1;
		
}
	public static void main(String[] args) {
		System.out.println(my_second(-973));

	}

}
