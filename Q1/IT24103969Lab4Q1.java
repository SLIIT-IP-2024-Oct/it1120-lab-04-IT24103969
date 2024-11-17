import java.util.Scanner;

public class IT24103969Lab4Q2{
	public static void main (String [] args)
	{
	Scanner input = new Scanner(System.in);

	//Taking an user input for a number
	System.out.print("Enter a number: ");
	double number = input.nextDouble();
	
	//Determining and displaying whether the number is negative, positive or zero
	if (number>0){
		System.out.print("The number is: Positive");
	}else if (number<0){
		System.out.print("The number is: Negative");
	}else{
		System.out.print("The number is Zero");
		}
	}
}