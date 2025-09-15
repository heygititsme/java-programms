import java.util.Scanner;

public class sumandsub {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number:");
	int num1 = sc.nextInt();
	System.out.print("enter the second number: ");
    int num2 = sc.nextInt();

    System.out.print("enter the third number: ");
    int num3 = sc.nextInt();
    
    int sum = num1 + num2 + num3;
   

    if(sum<45) {
    	System.out.println("the sum of the numbers is: " + sum);

    }
    else {
    	int result=num1-num2-num3;
    	System.out.println(result);
    }
	
}
}
