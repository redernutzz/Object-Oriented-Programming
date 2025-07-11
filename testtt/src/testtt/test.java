
package testtt;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	  public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    Scanner sc = new Scanner(System.in);
	    String userInput1, userInput2, userInput3;
	    userInput1 = sc.nextLine();
	    userInput2 = sc.nextLine();
	    userInput3 = sc.nextLine();
	    
	    cars.add(userInput1 );
	    cars.add(userInput2);
	    cars.add(userInput3 );
	    
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars.get(i));
	    }
	  }
	}