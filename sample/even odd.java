package evenodd;

public class even_odd {
public static boolean is_evenodd(int n)
{
   if((n%2)==0)
	   return true;
   else 
	   return false;
}
	public static void main(String[] args) {
		
        int n=0;
        if(is_evenodd(n)==true)
        	System.out.println("2");
        else
        	System.out.println("1");
	}

}
