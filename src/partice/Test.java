package partice;

public class Test {
 public static void main(String[] args) {
	 String s=" india is great india is which is larget country";
	  s=s.toLowerCase();
//	  int count=0;
//	  for(int i=0;i<s.length()-1;i++){
//		   if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
//			    count++;
//		   }
	  int count=0;
	  String s1[]=s.split(" ");
	  for( int i=0;i<s1.length;i++){
		   for( int j=i+1;j<=s1.length-1;j++){
			     if(s1[i].equals(s1[j])){
			    	  count++;
			    	   s1[j]="o";
			     }
		    if(count>1&& s1[i]!="o"){
		    	 System.out.println(s1[i]);
		    }
			  
		 
		 
		   }
	  }
 }
}
	  
	  


