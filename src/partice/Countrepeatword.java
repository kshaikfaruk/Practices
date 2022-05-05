package partice;

public class Countrepeatword {
 public static void main(String[] args) {
	String s="hello are  welcome to hyderbad,hello are you are welcome".replace(",", " ");
	 String s1[]=s.split(" ");
	  int count=0;
	  for( int i=0;i<s1.length;i++){
		   count=1;
		    for( int j=i+1;j<s1.length;j++){
		    	  if(s1[i].equals(s1[j])){
		    		  count++;
		    		   s1[j]= "O";
		    		   
		    	  }
		    	  
		    }
		     if(count >1 && s1[i]!="O")
		    	 System.out.println(s1[i] + count);
		     
	  }
}
}
