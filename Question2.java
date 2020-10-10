
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Employee Bean Class
class Employee{
	 String name;
	int id;
	int age;
	int phoneNo;
	public Employee(String name, int id, int age, int phoneNo) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	
	 void empDetails() {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Age:"+age);
		System.out.println("Phone No:"+phoneNo);
    }

}

public class Q2 {
	public static void main(String[] args) {
		Vector<Employee> myVector= new Vector<Employee>();
		//Adding values
		myVector.add(new Employee("Sameer Ahmad", 180210501, 21, 831808));
		myVector.add(new Employee("Ahmad Sameer", 180225501, 21, 831808));
		myVector.add(new Employee("Shubh", 180210501, 21, 831808));
		myVector.add(new Employee("Mayank Srivastava", 180210501, 21, 831808));

		Enumeration en=myVector.elements();
		Iterator<Employee> iterator=myVector.iterator();

		
		System.out.println("Printing Details Using Enumeration");
		while(en.hasMoreElements()) {
			Employee obj=(Employee) en.nextElement();
			obj.empDetails();
		}


		
		System.out.println("\n Printing Details Using Iteration");
		while(iterator.hasNext()) {
		Employee obj=(Employee) iterator.next();
		obj.empDetails();
		}
	}
}
