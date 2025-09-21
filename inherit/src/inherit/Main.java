package inherit;

class animal{
	void sound() {
		System.out.println("animal make sound");
	}
}

 class dog extends animal{
	 void sound() {
		 System.out.println("bark");
	 }
 }



public class Main {
	public static void main(String[] args) {
		dog d =new dog();
		d.sound();
	}

}
