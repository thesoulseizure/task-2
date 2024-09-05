package Task2;

import java.util.Scanner;

  //creating XYZ class
public class XYZ{
	
	
	// creating a method to find the product with highest price
	public static void highest(Product[] arr) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].price>max) {
				max=arr[i].price;
			}
		}
		System.out.println("highest price of the product among all is : " + max);
	}
	
	
	
	// creating a method to find the sub total in particular product
	public static void subresult( Product[] arr) {
		int subtotal = 0 ;
		for(int i=0; i<arr.length; i++) {
			subtotal = arr[i].price*arr[i].quantity;
			System.out.println("the sub-total is : " +subtotal);
		}
	}
	
	// creating a method to find highest sub category
	public static void sub( Product[] arr) {
		int subtotal = 0 ;
		int max=0;
		for(int i=0; i<arr.length; i++) {
			subtotal = arr[i].price*arr[i].quantity;
			if(subtotal>max) {
				max = subtotal;
			}
		}
		System.out.println("Highest sub-category : "+subtotal);
	}
	
	
	// creating a method to find the total amount spent
	public static void result(Product[] arr) {
		int total=0;
		for(int i=0; i<arr.length; i++) {
		  total = (arr[i].price * arr[i].quantity)+total;
		}
		System.out.println("total amount spent : "+total);
	}

	public static void main(String[] args) {
		
		// accepting five product information from user an storing in an array
		try (Scanner sc = new Scanner(System.in)) {
			Product arr[] = new Product[5];
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter the product details");
				 System.out.println("-----------------------------------------------");
				System.out.println("Enter the product id : ");
				int pid = sc.nextInt();
				System.out.println("Enter the product price : ");
				int price = sc.nextInt();
				System.out.println("Enter the product quantity : ");
				int quantity = sc.nextInt();
			    arr[i] = new Product(pid, price, quantity);
			    System.out.println("-----------------------------------------------");
			    System.out.println("the details of product is as follows : ");
			    arr[i].display();
			    System.out.println("-----------------------------------------------");
			}
			  System.out.println("-----------------------------------------------");
			    highest(arr);
			    System.out.println("-----------------------------------------------");
			    System.out.println("-----------------------------------------------");
			    sub(arr);
			    System.out.println("-----------------------------------------------");
			    System.out.println("-----------------------------------------------");
				subresult( arr);
				   System.out.println("-----------------------------------------------");
				    System.out.println("-----------------------------------------------");
			    System.out.println("Finding total amount spent ......");
			    result(arr);
		}
		System.out.println("-----------------------------------------------");
		    System.out.println("-----------------------------------------------");
	}

}
