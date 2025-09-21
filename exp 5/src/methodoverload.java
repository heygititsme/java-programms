
public class methodoverload {
public int add(int a,int b) {
	return a+b;
}
 public int add(int a, int b, int c) {
	 return a+b+c;
 }
 public double add(double a, double b) {
	 return a+b;
	 
 }
 public double add(int a , double b) {
	 return a+b;
	 
 }
 public static void main(String[] args) {
	methodoverload demo = new methodoverload();
	
	System.out.println("add(int, int):"+ demo.add(10, 20));
	System.out.println("add(int , int , int):"+ demo.add(10, 20, 30));
System.out.println("add(double,double):"+demo.add(5.5, 4.5));
System.out.println("add(int , double):"+demo.add(10, 10.5));
 }
}
