import java.util.Scanner;

public class calculator {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("first numer:");
	double num1= sc.nextDouble();
	
	System.out.println("second num:");
	double num2 = sc.nextDouble();
	
	double sum= num1+num2;
	double subtract= num1-num2;
	double multiply= num1*num2;
	double quotient= 0;
	double reminder =0;
	if(num2 != 0) {
		quotient =num1/num2;
		reminder = num1% num2;
	}
	else {
		System.out.println("division by zero not allowed");
	}
	
	System.out.println("sum:"+sum);
	System.out.println("subtract:"+subtract);
	System.out.println("multiply:"+multiply);
	System.out.println("quotient:"+quotient);
	System.out.println("reminder:"+reminder);
	
}
}
