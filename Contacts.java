class Contacts{
	
	public String fname;
	public String lname;
	public String address;
	public String city;
	public String state;
	public long zip;
	public long  pnumber;
	public String email;

	//ArrayList<Contacts> arrList = new ArrayList<Contacts>();

	//default constructor
	public Contacts(){

	}

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


	public String getFirstName(){
		return fname;
	}
	public String getLastName(){
		return lname;
	}
	public String getAddress(){
		return address;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;	
	}
	public long getZip(){
		return zip;
	}
	public long getPhoneNumber(){
		return pnumber;
	}
	public String getEmail(){
		return email;
	}
///////////////////////////////////////////
	public void setFirstName(){
		this.fname = fname;
	}
	public void setLastName(){
		this.lname = lname;
	}
	public void setAddress(){
		this.address = address;
	}
	public void setCity(){
		this.city = city;
	}
	public void setState(){
		this.state = state;	
	}
	public void setZip(){
		this.zip = zip;
	}
	public void setPhoneNumber(){
		this.pnumber = pnumber;
	}
	public void setEmail(){
		this.email = email;
	}

}