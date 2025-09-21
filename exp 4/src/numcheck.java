import java.util.Scanner;

public class numcheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("first num(a):");
	int a = sc.nextInt();
	System.out.println("second num(b):");
	int b = sc.nextInt();
	System.out.println("third num(c):");
	int c = sc.nextInt();
	
	System.out.println("enter true or false for abc:");
	boolean abc = sc.nextBoolean();
	
	
	boolean result;
	if(abc) {
		result=(c>b);
	}
	else {
		result =(b>a && c>b);
	}
	System.out.println("result:"+result);
	
	sc.close();
	
}
}
