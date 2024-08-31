package FutureIntern_JD_02;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FutureInter_taskJD_01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean repeat=true;
		
		while(repeat) {
			System.out.println("Enter the first number: ");
			double num1=getNumberInput(scanner);
			
			System.out.print("Enter the operator (+, -, *,/,^,%):");
			char operator=getOperatorInput(scanner);
			
			System.out.println("Enter the second number: ");
			double num2=getNumberInput(scanner);
			
			switch(operator) {
			case '+':
				System.out.println("Result: "+add(num1, num2)); 
				break;
				
			case '-':
				System.out.println("Result: "+subtract(num1,num2));
				break;
			case '*':
				System.out.println("Result: "+multiply(num1,num2));
				break;
			case '/':
				if(num2==0) {
					System.out.println("Error: Division by zero");
				}
				else {
					System.out.println("Result: "+divide(num1, num2));
				}
				break;
			case '^':
				System.out.println("Reslt: "+exponentiate(num1, num2));
				break;
			case '%':
				System.out.println("Result: "+ modulus(num1,num2));
				break;
			default:
				System.out.println("Error: Invalid operator");
			
			}
			
			System.out.print("Repeat calculation? (y/n): ");
			repeat = scanner.next().equalsIgnoreCase("y");
}
		scanner.close();
	}
	

	private static char getOperatorInput(Scanner scanner) {
		while(true) {
			String operator= scanner.next();
			if(operator.length()==1 && "+-*/^%".contains(operator)) {
				return operator.charAt(0);
			}
			else {
				System.out.println("Invalid operator. Please enter one of: +,-,*,/,^,%");
			}
		}
		
	}


	private static double getNumberInput(Scanner scanner) {
		while(true) {
			try {
				return scanner.nextDouble();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. please enter a number.");
				scanner.next();
			}
		}
	
	}
	private static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	private static double subtract(double num1, double num2) {
		return num1-num2;
	}
	private static double multiply(double num1, double num2) {
		return num1*num2;
	}
	private static double divide(double num1,double num2) {
		return num1/num2;
	}
	private static double exponentiate(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	private static double modulus(double num1, double num2) {
		return num1 % num2;
	}
}
