package WEEK6;


public class Employee extends Person {
	private String office;
	private String salary;
	private String date;
	
	public Employee(String n,String a,String p,String e,String o, String sa, String d){
		super(n,a,p,e);
		this.office=o;
		this.salary=sa;
		this.date=d;
	}
	
	public void setoffice(String o){
		office=o;
	}
	
	public String getoffice(){
		return office;
	}
	
	
	public void setsalary(String sa){
		salary=sa;
	}
	
	public String getsalary(){
		return salary;
	}
	
	
	public void setdate(String d){
		date=d;
	}
	
	public String getdate(){
		return date;
	}
	
	public String toString(){
		return ("OFFICE: "+getoffice()+" SALARY: "+getsalary()+" DATE HIRED: "+getdate()+"");
		}
}
