package partice;

public class MaxandMinValue {
 public static void main(String[] args) {
	 int a[]={10,20,40,70};
	  int max=a[0];
	  for( int i=1;i<a.length;i++){
		  if(a[i]>max){
			  max=a[i];
		  }
		   
	  }
	   System.out.println(max);
	   
	   
	   int min=a[0];
		  for( int i=1;i<a.length;i++){
			  if(a[i]<min){
				  max=a[i];
			  }
			   
		  }
		   System.out.println(min);
}
}
