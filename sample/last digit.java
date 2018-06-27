package digit;

public class Last_digit {
public static int my_last(int n)
{
int val;
val=n%10;
if(val<0)
	val*=-1;
return val;
}
	public static void main(String[] args) {
		System.out.println(my_last(89));

	}

}
