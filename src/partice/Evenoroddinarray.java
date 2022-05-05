package partice;

public class Evenoroddinarray {
 public static void main(String[] args) {
	 int value[]={10,2,3,5,40};
	  for(int i=0;i<value.length;i++){
	//for(int value:a){
		   if(value[i]%2==0){
			    System.out.println( value[i]+" is even ");
		   }else{
			   System.out.println( value[i]+" is odd");
		   }
	  }
}
}
