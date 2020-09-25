import java.util.*;
public class AddressBookMain
{
	public static void main(String args[])
	{
	   String name;
	   
	   Scanner sc = new Scanner(System.in);
	   ///////////////////////////
	   System.out.println("Please enter following details:");
		
	    System.out.print("Enter first name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter last name: ");
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
		//////////////////////////////////////////////////////
	   Contacts c = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
	   
	   AddressBook ab = new AddressBook();
	   ab.addcont(c);
	   System.out.println("Details added Succesfully");
	   System.out.println();

	   System.out.println("Enter again");


	   	System.out.print("Enter first name: ");
		String firstName1 = sc.nextLine();

		System.out.print("Enter last name: ");
		String lastName1 = sc.nextLine();

		System.out.print("Enter your address: ");
		String address1 = sc.nextLine();

		System.out.print("Enter the city: ");
		String city1 = sc.nextLine();

		System.out.print("Enter the state: ");
		String state1 = sc.nextLine();

		System.out.print("Enter zip: ");
		long zip1 = sc.nextLong();

		System.out.print("Enter phone number: ");
		long phoneNumber1 = sc.nextLong();
		
		sc.nextLine();

		System.out.print("Enter the email-id: ");
		String emailId1 = sc.nextLine();

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

		Contacts c1 = new Contacts(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, emailId1);

	   	ab.addcont(c);
	   	System.out.println("Details added Succesfully");
	   	System.out.println();

	   	while(true)
	   	{
	   		System.out.println("Do you want to add details of more people ? Press Y for yes or N for no. *CASE INSENSITIVE*");
	   		char ch = sc.next().charAt(0);
	   		if(ch == 'N' || ch == 'n'){
	   			try
				{
				    Thread.sleep(2000);
				}
				catch(InterruptedException ex)
				{
				    Thread.currentThread().interrupt();
				}
				break;
	   		}else if(ch == 'Y' || ch == 'y'){
	   			System.out.println("Enter the below details: ");
	   			sc.nextLine();
	   			System.out.println("Enter first name: ");
				firstName1 = sc.nextLine();
				System.out.println("Enter last name: ");
				lastName1 = sc.nextLine();

				System.out.println("Enter your address: ");
				 address1 = sc.nextLine();

				System.out.println("Enter the city: ");
				 city1 = sc.nextLine();

				System.out.println("Enter the state: ");
				 state1 = sc.nextLine();

				System.out.println("Enter zip: ");
				 zip1 = sc.nextLong();

				System.out.println("Enter phone number: ");
				 phoneNumber1 = sc.nextLong();
				
				sc.nextLine();

				System.out.println("Enter the email-id: ");
				 emailId1 = sc.nextLine();

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

				 c1 = new Contacts(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, emailId1);

			   	ab.addcont(c1);
			   	System.out.println("Details added Succesfully");
			   	System.out.println();
	   		}else{
	   			System.out.println("Please enter a valid input.");
	   			continue;
	   		}
	   	}
	   	sc.nextLine();
	   	System.out.println("Enter the Name of the person to edit details");
	   	name = sc.nextLine();
       	String[] str = name.split(" ");
	   	System.out.println("Enter the following details: ");
	   	firstName1 = str[0];
	   	lastName1 = str[1];
	   	System.out.print("Enter new address: ");
		address1 = sc.nextLine();
		System.out.print("Enter new city: ");
		city1 = sc.nextLine();
		System.out.print("Enter new state: ");
		state1 = sc.nextLine();

		System.out.print("Enter new zip: ");
		zip1 = sc.nextLong();

		System.out.print("Enter new phone number: ");
		phoneNumber1 = sc.nextLong();
		
		sc.nextLine();

		System.out.print("Enter new email-id: ");
		emailId1 = sc.nextLine();

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

       ab.editContacts(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, emailId1);

       System.out.println("Details Edited Succesfully");
       ab.viewList();

       System.out.println("Enter the name of the person to delete his details");
	   name=sc.nextLine();
	   String[] str1 = name.split(" ");
	   firstName1 = str1[0];
	   lastName1 = str1[1];
	   ab.deleteContacts(firstName1,lastName1);
	   System.out.println("Details deleted Succesfully! Thank you."); 
	   ab.viewList();
	   
	}
}