public class Contacts
{
	
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public long zip;
	public long phoneNumber;
	public String email;

	public Contacts()
	{

	}

	public Contacts(String firstName, String lastName, String address, String city, String state, long zip, long phoneNumber, String email)
	{
		this.firstName = firstName;
		this.lastName= lastName;
		this.address= address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName()
	{
        return firstName;
	}

	public String getLastName()
	{
        return lastName;
	}

	public String getAddress()
	{
        return address;
	}

	public String getCity()
	{
        return city;
	}

	public String getState()
	{
        return state;
	}
    public long getZip()
	{
        return zip;
	}
	public long getPhoneNumber()
	{
        return phoneNumber;
	}
	public String getEmail()
	{
        return email;
	}


	public void setFirstName()
	{
        this.firstName = firstName;
	}

	public void setLastName()
	{
        this.lastName=lastName;
	}

	public void setAddress()
	{
        this.address=address;
	}

	public void setCity()
	{
        this.city=city;
	}

	public void setState()
	{
        this.state=state;
	}
    public void setZip()
	{
        this.zip=zip;
	}
	public void setPhoneNumber()
	{
        this.phoneNumber=phoneNumber;
	}
	public void setEmail()
	{
        this.email=email;
	}
}