import java.util.Scanner;

public class SumAndSubtract extends NumberProcessor {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("first num:");
		int num1= sc.nextInt();
		System.out.println("second num:");
		int num2= sc.nextInt();
		System.out.println("third num:");
		int num3=sc.nextInt();
        SumAndSubtract res = new SumAndSubtract();

        res.process(num1, num2, num3);
    }

}
