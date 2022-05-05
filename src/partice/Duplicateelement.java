package partice;

import java.util.HashSet;

public class Duplicateelement {
 public static void main(String[] args) {
	 int a[]={10,20,20,30,40,50};
	  for( int i=0;i<=a.length;i++){
		  for(int j=i+1;j<=a.length-1;j++){
			   if(a[i]==a[j]){
				    System.out.println(a[i]+" is duplicate element");
			   }
		  }
	  }
//	  HashSet<Integer> i= new HashSet<Integer>();
//	  for(int j=0;j<a.length;j++){
//		    if(i.add(a[j])==false){
//		    	 System.out.println(" duplicate element found "+a[j]);
//		    }
//	  }
}
}
