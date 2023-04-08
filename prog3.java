import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int i, num, temp = 0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any numb to Check for Prime: ");
		num=s1.nextInt();
		for (i = 2; i <= num / 2; i++)
		{
		if (num % i == 0)
		{
		temp++;
		break;
		}
		}

		if (temp == 0 && num != 1)
		{
		System.out.println("The given number is prime");
		}
		else
		{
		System.out.println("The given number is not a prime");
		}
		}
		}
---------------------------------------------------------------------------------------		
		import java.util.Scanner;
		class Main {
		public static void main(String[] args) {
		char operator;
		Double num1, num2, res;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);
		do {
		if(operator=='E')
		{
		break;
		}
		System.out.println("Enter first number");
		num1 = input.nextDouble();
		System.out.println("Enter second number");
		num2 = input.nextDouble();
		switch (operator) {

		case '+':
		res = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + res);
		break;
		case '-':
		res = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + res);
		break;
		case '*':
		res = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + res);
		break;

		case '/':
		res = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + res);
		break;
		default:
		System.out.println("Invalid operator!");
		break;
		}
		System.out.println("Choose an operator: +, -, *, or /");
		operator= input.next().charAt(0);
		} while(operator!='E');
		input.close();
		}
}
