package partice;

public class MissingNumberInArray {
 public static void main(String[] args) {
	 int a[]={1,2,3,4,5,6,7,8,9,10,11,12,14};
	  int sum1=0;
	  for(int i=0;i<=a.length-1;i++){
		  sum1=sum1+a[i];
		  }
	   System.out.println(sum1);
 int sum2=0;
  for( int j=1;j<=14;j++){
	   sum2=sum2+j;
  }
   System.out.println(sum2);
    System.out.println(sum2-sum1);
}
  
 }
