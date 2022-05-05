package partice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writedata {

	public static void main(String[] args) throws IOException {
		  FileWriter fis= new FileWriter("D:\\seleniumintroductionworkspace\\Practices\\info1.txt");
		   BufferedWriter bf= new BufferedWriter(fis);
		     bf.write("hello");
		      bf.close();
		  
	}
}
