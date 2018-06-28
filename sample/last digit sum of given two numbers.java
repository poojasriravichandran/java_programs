package sumlast;

public class Sum_last {
public static int my_sum(int input1,int input2) {
	int sum;
	if(input1<0)
	   input1*=-1;
	else if(input2<0)
		input2*=-1;
	sum=(input1%10)+(input2%10);
	return sum;
}
	public static void main(String[] args) {
		System.out.println(my_sum(-237,254));

	}

}
