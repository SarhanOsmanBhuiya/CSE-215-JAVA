package WEEK6;

public class Staff extends Employee{
	private String title;
	
	public Staff(String n,String a,String p,String e,String o, String sa, String d, String oh, String r, String t){
		super(n,a,p,e,o,sa,d);
		this.title=t;
		}
	public void settitle(String t){
		title=t;
	}
	
	public String gettitle(){
		return title;
	}
	
	public String toString(){
		return ("TITLE: "+gettitle()+"");

	}
}
