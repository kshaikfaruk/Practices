package partice;

public class reverseNumber {
 public static void main(String[] args) {
int n=12345;
 int reverse=0;
 
 while(n!=0){
	 int reminder=n%10;
	 reverse=reverse*10+reminder;
	 n=n/10;
	 
 }
 System.out.println(reverse);
}
}
