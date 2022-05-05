package partice;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]={1,2,3,4,60};
  int search_element=60;
   boolean flag= false;
  for( int i=0;i<a.length;i++){
	   if(a[i]==search_element){
		   System.out.println(a[i] +" is found");
		   flag=true;
		    break;
	   }
	   
  }
   if(flag==false){
	   System.out.println(" no element founds");
   }
	}

}
