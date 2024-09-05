package Task2;


// Question 1.1 

// creating a class person with attributes
public class Person {
	String name;
	int age=18;
	
	
	
	
	// a method to display name & age
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	 public static void main(String[] args) {
		 
		 // creating an object of person class
		 Person me = new Person();
		 me.name = "Tony";
		 me.age = 20;	
		 me.display();
	 }
}
