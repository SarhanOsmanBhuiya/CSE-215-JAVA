package WEEK6;


public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	public Person(String n,String a,String p,String e){
		name=n;
		address=a;
		phoneNumber=p;
		emailAddress=e;
	}
	
	public void setname(String n){
		name=n;
	}
	
	public String getname(){
		return name;
	}
	
	
	public void setaddress(String n){
		address=n;
	}
	
	public String getaddress(){
		return address;
	}
	
	
	public void setphoneNumber(String n){
		phoneNumber=n;
	}
	
	public String getphoneNumber(){
		return phoneNumber;
	}
	
	
	public void setemailAddress(String n){
		emailAddress=n;
	}
	
	public String getemailAddress(){
		return emailAddress;
	}
	
	public String toString(){
	return ("NAME: "+getname()+" ADDRESS: "+getaddress()+" PHONENUMBER: "+getphoneNumber()+" EMAIL ADDRESS: "+getemailAddress()+"");
	}
	}
