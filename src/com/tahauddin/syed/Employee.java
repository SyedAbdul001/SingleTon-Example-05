package com.tahauddin.syed;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class Employee {
	
//	private static volatile Employee instance = new Employee();

	private Employee() {
		System.out.println("Object Created..");
	}
	
	public static Employee getInstance() {
		return InnerEmployee.instance;
	}
	
//	public static Employee getInstance1() {
//		return instance;
//	}
	/**
	 * 
	 * @author Syed Tahauddin
	 * this is static inner class and this will work in multi threading as well.
	 * instead of having double null check we can go for eager instantiazation
	 * with static inner class. 
	 * volatile keyword works as do everything or else nothing.
	 * object creation in one step as object creation and object initialization
	 * and object reference assignment in one step.
	 */
	private static class InnerEmployee{
		private static volatile Employee instance = new Employee();
	}

}
