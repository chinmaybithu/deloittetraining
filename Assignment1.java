import java.util.Scanner;

/*Mandated Programming Practices for the course: 
1.	It is important that code must use meaningful names, conventions, appropriate constructs and indentation.
2.	Every function must be preceded by short and meaningful comments explaining the purpose of the function.
3.	It is important and implicit that all the data entered for the program should be valid. 

1.	The temperatures of the cities across various countries are continuously 
monitored. A warning is displayed in cases where temperature goes beyond intolerable 
range.  The temperature will be entered either in the form of Celsius or Fahrenheit. 
The conversion formula is C=5(F-32)/19. If the temperature is beyond 60 degree 
Celsius or below -10 degree Celsius, warning has to be displayed. 
*/


//main function with instance variables
public class Assignment1 {
	
	static float temperature;
	String scale;
	float f;
	
	//constructor
	public Assignment1() {
		
	}
	
	
	//method to check the tolerable temperature range and print the corresponding temperature in celcius
	public static void Tolerance(float temperature)
	{
		if ((temperature > 60) || (temperature <-10))
		{
			System.out.println("Temperature is out of the tolerable range. Warning!!!");
			System.out.println("Temperature in Celcius: " + temperature);
		}
		
		else {
			System.out.println("Temperature is tolerable");
			System.out.println("Temperature in Celcius: " + temperature);
		}
	}
	
	
	
	//method to convert temperature in fahrenheit to celcius
	public static float toCelcius(float f)
	{
		float temperature = (f-32)* 5/9;
		return temperature;
		
	}

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the scale fahrenheit or celcius: F OR C? ");
		String scale = sc.nextLine();
		System.out.println("Enter the temperature: ");
		float temperature = sc.nextFloat();
		String ref = "F";
		
		if (ref.equals(scale))
		{
			temperature = toCelcius(temperature);
		}
		
		Tolerance(temperature);
		
		sc.close();

	}

}
