import java.util.Scanner;

/*Exercise Objective(s): Overloading

Exercise: Create a class called Calculator which has 4 different methods add, diff, mul and div that accept two numbers as 
parameters. Overload the methods such that the parameters can be of the following pattern. 
a)	Both are of int data type. 
b)	Both are of double data type. 
c)	First parameter is of int data type and second parameter is of double data type. 
d)	First parameter is of double data type and second parameter is of int data type


     Create an object to access these methods and invoke these methods with different 
     type of numbers and display the result in the corresponding methods. */


//class with all the overloading methods
public class Calculator_Assignment2 {

	public void add (int num1, int num2) {
		System.out.println(" Addition with pattern a: " + (num1 + num2));
	}
	public void add (double num1, double num2) {
		System.out.println(" Addition with pattern b: " + (num1 + num2) + "\n");
	}
	public void add (int num1, double num2) {
		System.out.println(" Addition with pattern c: " + (num1 + num2));
	}
	public void add (double num1, int num2) {
		System.out.println(" Addition with pattern d: " + (num1 + num2));
	}
	
	
	
	
	
	public void diff (int num1, int num2) {
		System.out.println(" Difference with pattern a: " + (num1 - num2));
	}
	public void diff (double num1, double num2) {
		System.out.println(" Difference with pattern b: " + (num1 - num2) + "\n");
	}
	public void diff (int num1, double num2) {
		System.out.println(" Difference with pattern c: " + (num1 - num2));
	}
	public void diff (double num1, int num2) {
		System.out.println(" Difference with pattern d: " + (num1 - num2));
	}
	
	
	
	
	public void mul (int num1, int num2) {
		System.out.println(" Multiplication with pattern a: " + (num1 * num2));
	}
	public void mul (double num1, double num2) {
		System.out.println(" Multiplication with pattern b: " + (num1 * num2) + "\n");
	}
	public void mul (int num1, double num2) {
		System.out.println(" Multiplication with pattern c: " + (num1 * num2));
	}
	public void mul (double num1, int num2) {
		System.out.println(" Multiplication with pattern d: " + (num1 * num2));
	}
	
	
	
	public void div (int num1, int num2) {
		System.out.println(" Division with pattern a: " + (num1 / num2));
	}
	public void div (double num1, double num2) {
		System.out.println(" Division with pattern b: " + (num1 / num2) + "\n");
	}
	public void div (int num1, double num2) {
		System.out.println(" Division with pattern c: " + (num1 / num2));
	}
	public void div (double num1, int num2) {
		System.out.println(" Division with pattern d: " + (num1 / num2));
	}
	

	
	//main calling respective functions by creating an object
	public static void main(String[] args) {

		Calculator_Assignment2 c = new Calculator_Assignment2();
		
		c.add(2, 12);
		c.add(153, 175.5326);
		c.add(124.9272, 2378);
		c.add(123.23, 2312.12312);
		c.diff(123, 12);
		c.diff(1456, 123.5345);
		c.diff(1973.34, 123);
		c.diff(12312.123, 12334.12123);
		c.mul(12, 123);
		c.mul(123, 123.234);
		c.mul(234234.123, 12334);
		c.mul(123.2345, 987.456);
		c.div(43, 27);
		c.div(123, 12.123);
		c.div(1231.231, 123);
		c.div(546.234, 98.12);

	}

}
