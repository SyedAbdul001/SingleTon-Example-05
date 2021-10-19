package com.tahauddin.syed;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		
		/**
		 * this will load the static fields and while loading the static feilds
		 * object will be created even when we don't ask for it.
		 * hence we are going for static inner class.
		 */
	//	Class.forName("com.tahauddin.syed.Employee");
		
		
		Employee employee1 = Employee.getInstance();
		Employee employee2 = Employee.getInstance();
		Employee employee3 = Employee.getInstance();
		Employee employee4 = Employee.getInstance();

		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employee4.hashCode());

	}

}
