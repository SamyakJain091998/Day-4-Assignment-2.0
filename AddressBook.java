import java.util.*;
public class AddressBook
{
	ArrayList<Contacts> arrList = new ArrayList<Contacts>();
	public AddressBook()
	{
       
	}

	public void addcont(Contacts cont)
	{
		arrList.add(cont);
	}

	public void editContacts(String firstName, String lastName, String address, String city, String state, long zip, long phoneNumber, String email)
    {
      	Iterator itr = arrList.iterator();
  		  int index=0;
        while (itr.hasNext()) {
        
      	Contacts c = (Contacts) itr.next();
   
      	
         if(firstName.equals(c.getFirstName()) && lastName.equals(c.getLastName()))
         {
         	arrList.remove(index);
         	
         	break;
         }
         index++;
         
      }
      Contacts newC = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
      arrList.add(newC);

    }

    public void viewList(){
      Iterator itr = arrList.iterator();
      System.out.println("List is-> ");
      while(itr.hasNext()){
        Contacts cview = (Contacts) itr.next();
        System.out.println("[Name: " + cview.getFirstName() + " " + cview.getLastName() + " ]");
      }
    }

    public void deleteContacts(String firstName,String lastName)
    {
        	Iterator itr = arrList.iterator();
    		  int index=0;
          while (itr.hasNext()) {
          
        	Contacts c = (Contacts) itr.next();
   
      	
         if(firstName.equals(c.getFirstName()) && lastName.equals(c.getLastName()))
         {
         	arrList.remove(index);
         	break;
         }
         index++;
         
      }

    }

	
}