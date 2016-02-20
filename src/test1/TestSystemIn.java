package test1;

import java.io.IOException;
import java.util.Scanner;

public class TestSystemIn {
	public static void main(String [] args) throws IOException{ 
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ;
	  String a=br.readLine();*/
//		System.out.println("Please enter a char:");
//		char a=(char) System.in.read();
//	    System.out.println(a);
	    System.out.println("Please enter a string:");
	    Scanner b=new Scanner(System.in);
	    String c=b.nextLine();
	    System.out.println(c);
	}
}
