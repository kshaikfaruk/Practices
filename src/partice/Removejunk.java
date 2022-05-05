package partice;

public class Removejunk {
 public static void main(String[] args) {
	String s="$$&&&&&%&&%$R%% selenium java";
	 String s1= "white   space   words";
	 s=s.replaceAll("[^a-zA-Z0-9]", "");
	  System.out.println(s);
	   s1=s1.replaceAll("\\s", "");
	   System.out.println(s1);
	 
	  // int count=s1.length();
	    
//	   int totalcount=s1.replace("e", "").length();
//	    int occur=count-totalcount;
//	     System.out.println(occur);
}
}
