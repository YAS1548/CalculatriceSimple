package Calculatrice;

import java.util.Scanner;

public class Calculatrice {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
            boolean continuer = true;
            System.out.println("Welcome to the Calculator!");
          
            while (continuer) {
                System.out.println("\nChoose the type of operation:");
                System.out.println("1. Unary operation");
                System.out.println("2. Binary operation");

                int OpChoice = getValidIntInput(scanner);

                if (OpChoice == 1) {
                    UnaryOp(scanner);
                } else if (OpChoice == 2) {
                    BinaryOp(scanner);
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
                System.out.println("\nDo you want to perform another calculation?");
                System.out.println("1: yes \n0: no");
                int userChoice = getValidIntInput(scanner);
                continuer = userChoice == 1;
            }
            System.out.println("Thank you for using the Calculator.");
        }
    }
	
	private static int getValidIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
    
    private static void BinaryOp(Scanner scanner) {
    	System.out.println("Choose a binary operation :");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int BinaryOpChoice = getValidIntInput(scanner);
		if(BinaryOpChoice>4) {
			System.out.println("Invalid choice!");
			}else {
		System.out.println("Enter the first number :");
		double val1 = getValidDoubleInput(scanner);
		System.out.println("Enter the second number :");
		double val2 = getValidDoubleInput(scanner);
		try {
		double res = 0;
		switch (BinaryOpChoice) {
		case 1:
			CalculMath add = new Addition(val1, val2);
			res = add.Calculer();
			break;
		case 2:
			CalculMath sub = new Soustraction(val1, val2);
			res = sub.Calculer();
			break;
		case 3:
			CalculMath mul = new Multiplication(val1, val2);
			res = mul.Calculer();
			break;
		case 4:
				CalculMath div = new Division(val1, val2);
				res = div.Calculer();
                           
			break;
		default:
			System.out.println("invalid choice !");
			return;
		}
		System.out.println(res);
		}
		catch (ArithmeticException e) {
			System.out.println("Error: "+ e.getMessage());
		}}
    }
    private static void UnaryOp(Scanner scanner) {
    	System.out.println("Choose an unary operation :");
		System.out.println("1. Cosinus");
		System.out.println("2. Sinus");
		System.out.println("3. Logarithm");
		System.out.println("4. Exponential");
		System.out.println("5. Square");
        
		int UnaryOpChoice = getValidIntInput(scanner);
		if(UnaryOpChoice>5) {
			System.out.println("Invalid choice!");
			}
		else{System.out.println("Enter number:");
		double val = getValidDoubleInput(scanner);
		try {
		double res = 0;
		switch (UnaryOpChoice) {
		case 1:
			CalculMath cos = new Cos(val);
			res = cos.Calculer();
			break;
		case 2:
			CalculMath sin = new Sin(val);
			res = sin.Calculer();
			break;
		case 3:
			 CalculMath log = new Log(val);
			res = log.Calculer();
         	break;
		case 4:
			CalculMath exp = new Exp(val);
			res = exp.Calculer();
			break;
		case 5:

			CalculMath sqrt = new Sqrt(val);
			res = sqrt.Calculer();
         
			break;
		default:
			System.out.println("Invalid choice!");
			return;
		}
		System.out.println(res);
		} catch (ArithmeticException e) {
    System.out.println("Error: "+ e.getMessage());
		}
    }
}}