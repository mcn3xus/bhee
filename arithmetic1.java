import java.util.Scanner;
	public class arithmetic1
	{
		public static void main (String [] args)
		{
			Scanner purse = new Scanner(System.in);
			int num1, num2, sum, product, difference;
			
			double division;
			
			System.out.println("Welcome, please input your first number: ");
				num1 = purse.nextInt();
			
			System.out.print("your first number is: ");
			System.out.println(num1);
			
			System.out.println("please input your second number: ");
				num2 = purse.nextInt();
			System.out.print("your second number is: ");
			System.out.println(num2);
			
			sum = num1 + num2;
			System.out.print("the sum of your two numbers is: ");
			System.out.println(sum);
			
			product = num1 * num2;
			System.out.print("the product of the two numbers is: ");
			System.out.println(product);
			
			difference = num1 - num2;
			System.out.print("the difference of the two numbers is: ");
			System.out.println(difference);
			
			division = num1/num2;
			System.out.print("the result for division is: ");
			System.out.println(division);
			
			System.out.println("thank you");
		}
	}