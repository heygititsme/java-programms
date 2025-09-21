
public class person {
 private String name;
 private int age;
 
 public void setName(String name) {
	 this.name = name;
 }
 public void setAge(int age) {
	 this.age = age;
 }
 public String getName() {
	 return name;
 }
 public int getAge() {
	 return age;
 }
 



	public static void main(String[] args) {
		person p = new person();
		p.setName("ayush");
		p.setAge(21);
		
		System.out.println("name:"+p.getName());
		System.out.println("age:"+p.getAge());
			
}
}
