package WEEK6;


public class Student extends Person {
	public String status;

	public Student(String n,String a,String p,String e,String s){
		super(n,a,p,e);
		this.status=s;
	}

public void setstatus(String s){
	status=s;
}

public String getstatus(){
	return status;
}

public String toString(){
	return ("STATUS: "+getstatus()+"");

}
}