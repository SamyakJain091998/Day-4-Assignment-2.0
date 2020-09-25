import java.util.*;

public class Contacts{
	
	private static String fname;
	private static String lname;
	private static String address;
	private static String city;
	private static String state;
	private static long zip;
	private static long  pnumber;
	private static String email;

	//ArrayList<Contacts> arrList = new ArrayList<Contacts>();

	public Contacts(String fname, String lname, String address, String city, String state, long zip, long pnumber, String email){
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.pnumber = pnumber;
		this.email = email;
	}
}