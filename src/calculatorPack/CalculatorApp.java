package calculatorPack;

import java.util.Scanner;

public class CalculatorApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		boolean continueCal = true;
		
		while(continueCal) {
			
			System.out.println("Please enter first Number");
			double firstNumber = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter the Opertor (+,-,*,/)");
			String userinput = sc.nextLine();
		
			
			System.out.println("Please enter second Number");
			double secondNumber = Double.parseDouble(sc.nextLine());
			
			double result = 0;
			
			switch (userinput) {
			case "+":
				result = cal.add(firstNumber, secondNumber);
				break;
				
			case "-":
				result = cal.sub(firstNumber, secondNumber);
				break;
				
			case "*":
				result = cal.mul(firstNumber, secondNumber);
				break;
				
			case "/":
				result = cal.div(firstNumber, secondNumber);
				break;

			default:
				System.out.println("Invalid operator, Please try again");
				break;
			}
			
			
			System.out.println("The final result is"+ result);
			
			System.out.println("Do you want to continue again? (Yes/No)");
			String userChoice = sc.nextLine();
			
			if(userChoice.equalsIgnoreCase("No")) {
				continueCal = false;
			}
		}
		
		
		
		
		
		
		
	}

}
