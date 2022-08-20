package codingtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;


public class Test  {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		String course1 = "Java";
		String course2 = "HTML";
		while (true) {
			System.out.println("**************************************************************************");
			System.out.println("Enter 1 for register..\n");
			System.out.println("enter 2 for login...\n");
			System.out.println("Enter 3 for exit");
			System.out.println("**************************************************************************");
			System.out.println("Make your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
			
				int mobno;
				String username;
				String pass;
				String email;
				
				ArrayList<RegistrationPage> regarry = new ArrayList<RegistrationPage>();
				System.out.println("enter User name: ");
				username = sc.next();
				System.out.println("enter password name: ");
				pass = sc.next();
				System.out.println("enter e-Mail id name: ");
				email = sc.next();
				System.out.println("enter Mobile number : ");
				mobno = sc.nextInt();
				
				
				RegistrationPage r1 = new RegistrationPage();
			
				r1.setName(username);
				r1.setPass(pass);
				r1.setEmail(email);
				System.out.println("**************************************************************");
				System.out.println("Registration done. ");
				System.out.println(" User Name: " + r1.getUsername());
				System.out.println("Email id : " + r1.getEmail());
				System.out.println("Mobile Number : " + r1.getMobno());

				System.out.println("******************************************************************");
				break;
			}
			// TODO Auto-generated method stub

			// Login page
			case 2: {
				HashMap<String, String> logarr = new HashMap<String, String>();
				logarr.put("Priti123", "p123");
				logarr.put("Khaire123", "k123");
				logarr.put("rakesh789", "r789");
				logarr.put("sharma456", "s456");
				System.out.println(logarr);

				try {
					Scanner scanner = new Scanner(System.in);
					System.out.print(" Enter user name => ");
					String userName = scanner.nextLine();

					System.out.print(" Enter password => ");
					String password = scanner.nextLine();

					if (logarr.containsKey(userName)) {
						if (logarr.get(userName).equals(password)) {
							System.out.println(" User successfully logged-in.. ");
						} else {
							System.out.println(" In valid userName of password ");
						}
					}
				} finally {

				}
			}
				break;

			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
