

class account {
private int id;
private int num;
private String name;

private long balance;

public account (int id, int num , String name, long balance) {
	this.id = id;
	this.num = num;
	this.name = name;
	this.balance= balance;
}
public void setid(int id) {
	this.id=id;
	
}
public int getid() {
	return id;
}
public void setnum(int num) {
	this.num= num;
}
public int getnum() {
	return num;
}
public void setname(String name) {
	this.name= name;
}
public String getname() {
	return name;
}
public void setbalance(long balance) {
	this.balance= balance;
}
public long getbalance() {
	return balance;
}
}
public class Main{
	public static void main(String[] args) {
		account ac1= new account(1,10,"user1",1000);
		account ac2 = new account(2, 100, "user2", 100000);
		account ac3= new account(3,1000,"user3", 1000000000000l);
		account[] ac= {ac1,ac2,ac3};
		account maxac=ac[0];
		for(int i=1; i<ac.length; i++) {
			if(ac[i].getbalance()>maxac.getbalance()) {
				maxac=ac[i];
			}
		}
		
		System.out.println(maxac.getname());
	}
	
	
}

