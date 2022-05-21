package WEEK6;

public class Main {

public static void main(String[] args) {
		
		
		
		Person person = new Person("Tanvir", "Dhaka","01834815201", "tanvir1132690@gmail.com");

	    Student student = new Student("Himu", "Khulna", "01926190808", "himu.ahmed.nsu.edu", Student.status);

		Employee employee = new Employee("Sadman", "Khilgaon", "01521332025","sadman.jaman@gmail.com", 100, 100000);

		Faculty faculty = new Faculty("SnM", "Mirpur", "01834516291","snm.bbr@gmail.com", 500, 350000, "9am to 5pm", "Professor");

		Staff stuff = new Staff("Soumik", "Bashundhora", "01712177675","soumik@gmail.com", 112, 55000, "Executive Assistant");

			
			
			
			System.out.println(person.toString());
			
			System.out.println(student.toString());
			
			System.out.println(employee.toString());
			
			System.out.println(faculty.toString());
			
			System.out.println(stuff.toString());
		
		
		
	}


}
