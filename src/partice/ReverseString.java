package partice;

public class ReverseString {
 public static void main(String[] args) {
	 String s="hello welcome to team";
	 String s1[]=s.split(" ");
	  String rev="";
	//  char c=' ';
	   for( String word:s1){
		    String reverseword="";
	   
	   for(int i=word.length()-1;i>=0;i--){
		//   c=s.charAt(i);
		 //   rev=rev+c;
		   reverseword=reverseword+word.charAt(i);
	   }
	   
	  
	   rev=rev+reverseword+" ";

	   }
		  System.out.println(rev);
 }
}

