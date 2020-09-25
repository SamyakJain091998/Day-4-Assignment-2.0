import java.util.*;
import java.util.concurrent.TimeUnit;

public class AddressBookMain{
	public static void main(String[] args){
		//System.out.println("Welcome to Address Book Program.");
		Scanner sc = new Scanner(System.in);
		AddressBook adb = new AddressBook();
		while(true)
		{
				System.out.println("Choose an option:\n1. Add new information\n2. Edit existing information\n3. Exit");
				int option = sc.nextInt();
				// AddressBook adb = new AddressBook();

				if(option == 1)
				{				
								System.out.println("Please enter following details:");
								
								System.out.print("Enter first name: ");
								String firstName = sc.nextLine();
								
								sc.nextLine();

								System.out.print("enter last name: ");
								String lastName = sc.nextLine();
						
								System.out.print("Enter your address: ");
								String address = sc.nextLine();
						
								System.out.print("Enter the city: ");
								String city = sc.nextLine();
						
								System.out.print("Enter the state: ");
								String state = sc.nextLine();
						
								System.out.print("Enter zip: ");
								long zip = sc.nextLong();
						
								System.out.print("Enter phone number: ");
								long phoneNumber = sc.nextLong();
								
								sc.nextLine();
						
								System.out.print("Enter the email-id: ");
								String emailId = sc.nextLine();
						
								System.out.println("Thank yor for entering the details!");
								//TimeUnit.SECONDS.sleep(2);
								try
									{
									    Thread.sleep(2000);
									}
								catch(InterruptedException ex)
									{
									    Thread.currentThread().interrupt();
									}
							
								Contacts c = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
								// AddressBook adb = new AddressBook();
								adb.addToList(c);
								System.out.println("Details have been added successfully!");

				}
				else if(option == 2)
				{
					System.out.println("Please enter following details:");
								
					System.out.print("Enter the first name: ");
					String firstName = sc.nextLine();
					
					sc.nextLine();

					System.out.print("Enter the last name: ");
					String lastName = sc.nextLine();

					System.out.println("Details sent. Please wait while we check..");
					try
						{
						    Thread.sleep(2000);
						}
					catch(InterruptedException ex)
						{
						    Thread.currentThread().interrupt();
						}
					adb.findName(firstName, lastName);
				}
				else if(option == 3){
					System.out.println("Thank you! You may exit now.");
					System.exit(0);
				}else{
					System.out.println("Please enter a valid option.");
					continue;
				}
		}
	}
}