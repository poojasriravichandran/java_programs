package odd;

public class Odd {

	public static boolean is_evenodd(int n)
	{
	   if((n%2)==0)
		   return false;
	   else 
		   return true;
	}
		public static void main(String[] args) {
			
	        int n=33;
	        if(is_evenodd(n)==true)
	        	System.out.println("2");
	        else
	        	System.out.println("1");
	}

}
