import java.util.Scanner;

public class IT24103969Lab4Q2{
	public static void main (String [] args)
	{
	Scanner input = new Scanner(System.in);

	//Taking in exam marks as the input
	System.out.print("Enter the exam marks (out of 100): ");
	double examMark = input.nextDouble();

	//Validating the exam mark input
	if (examMark<0 || examMark>100){
		System.out.print("Invalid input for exam marks. Terminating program");
	return;
	}else{
		//Taking in lab submission marks as the input
		System.out.print("Enter the lab submission marks (out of 100): ");
		double labMark = input.nextDouble();

		//Validating the lab mark input
		if (labMark<0 || labMark>100){
			System.out.print("Invalid input for lab marks. Terminating program");
		return;
		}else{

			//Taking in mark percentages as the input
			System.out.print("Please enter the percentage given for the exam: ");
			double examPercentage = input.nextDouble();

			System.out.print("Please enter the percentage given for the lab submission: ");
			double labPercentage = input.nextDouble();

			//Validating the percentage inputs
			if (examPercentage + labPercentage != 100){
				System.out.print("The percentage must add up to 100. Terminating program.");
			return;
			}else{
				//Calculating the final exam marks
				double finalMark = (examMark * examPercentage/100.0) + (labMark * labPercentage/100.0);
		
				//Displaying the results
				System.out.println();
				System.out.print("Final Exam Mark is: " + finalMark);
				}
			}
		}
	}

}