import java.util.LinkedList;
import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        LinkedList<Person> people = new LinkedList<>();
        
        people.add(new Person("Jake Cuenca", "Talamban, Cebu", "09123456777", "jake.cuenca@gmail.com"));
        people.add(new Student("Kinshin Sorallo", "Lapu Lapu City", "09323524535", "kinshin@gmail.com", 2));
        people.add(new Student("Kirk Postrero", "Talisay City", "09986574922", "kinshin@gmail.com", 1));
        people.add(new Faculty("Elline Fabian", "San Fernando",  "094739574829", "doja.cat@gmail.com", "LB263", 25432.90 , "MWF 7:30am - 4:30pm", "SNLab Head", 561555550000L));
        people.add(new Faculty("John Rex Pana", "Basak, Mandaue",  "09769485732", "rex.saur@gmail.com", "LB263", 23765.80 , "TTH 7:30am - 4:30pm", "SNLab Assistant Head", 1062003600000L));
        people.add(new Staff("Jehu Lyndon Ruiz", "Consolacion", "09689375837", "taylor.swift@gmail.com", "CNLab", 13255.67, "Lab In-Charge"));
     
        do {
        	System.out.println();
        	System.out.printf("%50s", "WELCOME TO UNIVERSITY OF SAN CARLOS!\n\n");
        	System.out.println("Choose What Group To Display:");
        	System.out.println("[1] Person");
        	System.out.println("[2] Student");
        	System.out.println("[3] Employee");
        	System.out.println("[4] Faculty");
        	System.out.println("[5] Staff");
        	System.out.println("[0] Exit");
        	System.out.print("Choice: ");
		choice = input.nextInt();
       
        if (choice == 1) {
        	System.out.print("\nPERSONS:");
        	 for (int i = 0; i < people.size(); i++)  {
        		if(people.get(i) instanceof Person) {
        			System.out.println(people.get(i));
        		}
        	}
        }
        else if (choice == 2) {
        	
        	System.out.print("\nSTUDENTS:");
        	for (int i = 0; i < people.size(); i++) {
        		if(people.get(i) instanceof Student) {
        			System.out.println(people.get(i));
        		}
        	}
        }
        else if (choice == 3) {
        	System.out.print("\nEMPLOYEES:");
        	for (int i = 0; i < people.size(); i++) {
        		if(people.get(i) instanceof Employee) {
        			System.out.println(people.get(i));
        		}
        	}
        }
        else if (choice == 4) {
        	System.out.print("\nFACULTY:");
        	for (int i = 0; i < people.size(); i++) {
        		if(people.get(i) instanceof Faculty) {
        			System.out.println(people.get(i));
        		}
        	}
        }
        else if (choice == 5) {
        	System.out.print("\nSTAFF:");
        	for (int i = 0; i < people.size(); i++) {
        		if(people.get(i) instanceof Staff) {
        			System.out.println(people.get(i));
        			
        		}
        	}
        }
        }while(choice != 0 );
        input.close();
    }
}