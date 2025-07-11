import java.util.Scanner;
import java.util.LinkedList;

public class PhoneBook {

	public static void change (LinkedList<String> firstName, LinkedList<String> middleName,LinkedList<String> lastName, LinkedList<String> contactNumber) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease select which contact you want to change/edit");
		display(firstName, middleName, lastName, contactNumber);
		System.out.print("Enter Here: ");
		int userChange = input.nextInt();
		userChange--;
		String name1,name2, name3, number;
		
		System.out.print("\nEnter New First Name: ");
		name1 = input.next();
		firstName.set(userChange, name1);
		
		System.out.print("Enter New Middle Name: ");
		name2 = input.next();
		middleName.set(userChange, name2);
		
		System.out.print("Enter New Last Name: ");
		name3 = input.next();
		lastName.set(userChange, name3);
		
		System.out.print("Enter New Phone Number: ");
		number = input.next();
		contactNumber.set(userChange, number);
		
	
		System.out.println("\nSuccesfully Changed!\n");
		display(firstName, middleName, lastName, contactNumber);
	}
	
	public static void delete (LinkedList<String> firstName, LinkedList<String> middleName,LinkedList<String> lastName, LinkedList<String> contactNumber) {
		display(firstName, middleName, lastName, contactNumber);
		int userDelete;
		System.out.println("\nPlease choose which contact you want to delete");
		System.out.print("Enter Here: ");
		Scanner deleteInput = new Scanner (System.in);
		userDelete = deleteInput.nextInt();
		userDelete--;
		
		firstName.remove(userDelete);
		lastName.remove(userDelete);
		contactNumber.remove(userDelete);
		System.out.println("\nSuccessfully Deleted!");
		display(firstName, middleName, lastName, contactNumber);
		
	}
	
	public static void browse (LinkedList<String> firstName, LinkedList<String> middleName,LinkedList<String> lastName, LinkedList<String> contactNumber) {
		Scanner input = new Scanner(System.in);
		String name, midName, famName, num;
		
		System.out.println("\nPlease input the following details and we will see if there is a match");
		System.out.println("Take note it is case sensitive 'A' != 'a' ");
		
		System.out.print("\nEnter First Name:");
		name =input.next();
		
		System.out.print("Enter Middle Name:");
		midName =input.next();
		
		System.out.print("Enter Last Name: ");
		famName = input.next();
		
		System.out.print("Enter Phone Number: ");
		num = input.next();
		
		int index = 1;
		for (int i = 0; i < firstName.size(); i++) {
			if (name.equals( firstName.get(i)) && midName.equals( middleName.get(i))&& famName.equals(lastName.get(i)) && num.equals(contactNumber.get(i))) {
				System.out.println("\nCONTACT FOUND!");
				System.out.println("Contact No. [" + index + "]");
				System.out.println("Name: " + firstName.get(i) + " " + middleName.get(i) + " " + lastName.get(i));
	            System.out.println("Number: " + contactNumber.get(i)); 
	            System.out.print("\n");	       
	            i = firstName.size();
	            return;
			}
			index++;
		}
		System.out.println("\nCONTACT NOT FOUND!");
	}
	
	public static void display (LinkedList<String> firstName, LinkedList<String> middleName,LinkedList<String> lastName, LinkedList<String> contactNumber) {
		System.out.println("\nPhonebook :\n");
		int index = 1;
        for (int i = 0; i < firstName.size(); i++) {
            System.out.println("Contact No. [" + index + "]");
            System.out.println("Name: " + firstName.get(i) + " " + middleName.get(i) + " " + lastName.get(i));
            System.out.println("Number: " + contactNumber.get(i)); 
            index++;
            System.out.print("\n");
        }
	}
	
	public static void addContact (LinkedList<String> firstName, LinkedList<String> middleName,LinkedList<String> lastName, LinkedList<String> contactNumber) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter First Name: ");
		firstName.add(input.next());
		
		System.out.print("Enter Middle Name: ");
		middleName.add(input.next());
		
		System.out.print("Enter Last Name: ");
		lastName.add(input.next());
		
		System.out.print("Enter Phone Number: ");
		contactNumber.add(input.next());
		
	
		System.out.println("\nContact Registered!!\n");
		
	}

	public static char menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("[A]DD");
		System.out.println("[B]ROWSE");
		System.out.println("[C]HANGE/EDIT");
		System.out.println("[D]ELETE");
		System.out.println("[E]XIT");
		System.out.print("Choice? ");
		char userChoice = input.next().charAt(0);
		
		return userChoice;
	}

	public static void  main (String[] args) {
		LinkedList<String> firstName = new LinkedList<String>();
		LinkedList<String> lastName = new LinkedList<String>();
		LinkedList<String> middleName = new LinkedList<String>();
		LinkedList<String> contactNumber = new LinkedList<String>();
		
		char userChoice;
		
		do {
			userChoice  = menu();
		
			if (userChoice == 'A'|| userChoice == 'a') {
				addContact(firstName, middleName, lastName, contactNumber);	
			}
			else if (userChoice == 'B'||userChoice == 'b') {
				if (firstName.size() == 0) {
					System.out.println("\nPhonebook is empty. Please add a contact first.\n");
					continue;
				}
				browse(firstName, middleName, lastName, contactNumber);
			}
			else if (userChoice == 'C' || userChoice == 'c' ) {
				if (firstName.size() == 0) {
					System.out.println("\nPhonebook is empty. Please add a contact first.\n");
					continue;
				}
				change(firstName, middleName, lastName, contactNumber);
			}
			else if (userChoice == 'D' || userChoice == 'd' ) {
				if (firstName.size() == 0) {
					System.out.println("\nPhonebook is empty. Please add a contact first.\n");
					continue;
				}
				delete(firstName, middleName, lastName, contactNumber);
			}
		}while(userChoice != 'E' && userChoice != 'e');
		
	}
}