package partice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
 public static void main(String[] args) throws IOException {
	  FileReader fis= new FileReader("D:\\seleniumintroductionworkspace\\Practices\\info.txt");
	   BufferedReader bf= new BufferedReader(fis);
	     String str;
	      while((str=bf.readLine())!=null){
	    	   System.out.println(str);
	      }
	      bf.close();
	  
}
}
