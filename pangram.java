package pangram;

public class is_pangram {
public static boolean my_pangram(String str) {
	boolean[] mark=new boolean[26];
	int index=0,i;
	for(i=0;i<str.length();i++) {
		if ('A' <= str.charAt(i) && 
                str.charAt(i) <= 'Z')
                     
            index = str.charAt(i) - 'A';
		 else if('a' <= str.charAt(i) && 
                 str.charAt(i) <= 'z')
                      
         index = str.charAt(i) - 'a';
		 mark[index] = true;
	}
	for ( i = 0; i <= 25; i++)
        if (mark[i] == false)
            return (false);
	 return (true);
}
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
        if(my_pangram(str)==true)
        	System.out.println(str+" "+"is a pangram");
        else
        	System.out.println(str+" "+"not a pangram");
	}

}
