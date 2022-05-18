package partice;

import java.util.Arrays;

public class Removeduplicate {
	
	 public static  void remove(String s){
		 char c[]=s.toCharArray();
		  int index=0;
		  for( int i=0;i<c.length;i++){
			  int j;
			   for( j=0;j<i;j++){
				   if(c[i]==c[j]){
					   break;
				   }
			   }
			   
			   if(i==j){
				   c[index++]=c[i];
			   }
		  }
		   System.out.println(String.valueOf(Arrays.copyOf(c, index)));
		  
		  
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove(" hello how aree you");
	}

}
