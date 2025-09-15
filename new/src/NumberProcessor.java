
public class NumberProcessor {
	public void process(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The sum of the numbers is: " + sum);

        if (sum < 45) {
        	System.out.println("The sum of the numbers is: " + sum);
         
        } 
        else{
        	int result = sum - a - b - c;
            System.out.println("The sum is less than 45.the result is: " + result);
            
        }
    }
}
