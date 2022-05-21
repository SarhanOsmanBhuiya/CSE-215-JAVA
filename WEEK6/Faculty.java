package WEEK6;


public class Faculty extends Employee{
	private String officehours;
	private String rank;
	
	public Faculty(String n,String a,String p,String e,String o, String sa, String d, String oh, String r){
	super(n,a,p,e,o,sa,d);
	this.officehours=oh;
	this.rank=r;
	}
	
	public void setofficehours(String oh){
		officehours=oh;
	}
	
	public String getofficehours(){
		return officehours;
	}
	
	public void setrank(String r){
		rank=r;
	}
	
	public String getrank(){
		return rank;
	}
	
	public String toString(){
		return ("OFFICE HOURS: "+getofficehours()+" RANK: "+getrank()+"");

	}
	}


