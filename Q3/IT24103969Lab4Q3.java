import java.util.Scanner;

public class IT24103969Lab4Q3{
	public static void main (String [] args)
	{
	Scanner input = new Scanner(System.in);    
	System.out.print("Enter a number: ");	//Taking a user input for a number
	double number = input.nextDouble();
	
	//Using ternery operator to display whether the number is positive, negative or zero
	String numberDisplay = (number>0) ? "The number is: Positive" : (number<0) ? "The number is: Negative" : "The number is Zero";
	
	//Displaying the outcome
	System.out.print(numberDisplay);
	}
}