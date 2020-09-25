import java.util.*;

public class AddressBook
{
	ArrayList<Contacts> arrList = new ArrayList<Contacts>();

	public void addToList(Contacts con)
	{
		arrList.add(con);
	}

	public void findName(String firstname, String lastname)
	{
		Iterator itr = arrList.iterator();
		int index = 0;
		while(itr.hasNext())
		{

			Contacts c = (Contacts) itr.next();
			if((c.getFirstName()).equals(firstname))
			{
				System.out.println("c.getFirstName() is: " + c.getFirstName() + " and your input firstname is: "+ firstname);
				System.out.println("Found it!");
				//return true;
			}
			else
			{
				System.out.println("Didn't find");
				//return false;
			}
			
			
			// for(int i = 0; i<2; i++){
			// 	System.out.println(arrList.get(i).getFirstName());
			// }

		}
	}
}
