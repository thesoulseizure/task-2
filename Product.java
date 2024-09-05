package Task2;

// Question 1.2

// creating product class with attributes
public class Product {
	 int pid;
	 int price;
     int quantity;
     
    
	
	//creating parameterized constructor 
	public Product(int pid, int price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
//creating a method to display product details
	public void display() {
		System.out.println("the pid is : " +pid+ "  price : "+price+ "  quantity : "+quantity);
		System.out.println();
		
	}

}
