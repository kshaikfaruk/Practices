 package partice;

public class CheckequalsArray {

	public static void main(String[] args) {
 int a[]={1,2,3,4,5,7};
 int b[]={1,2,3,4,5,7};
   boolean flag=true;
   if(a.length==b.length){
	    for(int i=0;i<=a.length-1;i++){
	    	if(a[i]!=b[i]){
	    		flag=false;
	    	}
	    	
	    }
	     if(flag){
	    	 System.out.println(" array is equal");
	     }else{
	    	  System.out.println(" array is not equals");
	     }
   } else{
	   System.out.println(" array size is not same");
   }
	}

}
