package shakir4;

import java.util.Scanner;

public class kuiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double feet,inches;
		System.out.println("Input the inches: ");
		inches = input.nextDouble();
		System.out.println("Input the feet: ");
		feet = input.nextDouble();
		input.close();
		
		// calculate for male n female
		System.out.println("female weight is : " +(40+(5*feet)) + "kg ");
		System.out.println("male weight is : " +(50+(5*feet)) + "kg ");
		input.close();
		
		

	}

}
