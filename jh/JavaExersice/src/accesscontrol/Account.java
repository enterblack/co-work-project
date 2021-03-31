package accesscontrol;

public class Account {
//	private int regNumber;
	private String name;
	private int balance;
//	다른 class에서 호출하는것을 실습하기 위해서 코딩
	public String getName() {return name;}
	public void setName(String name) {this.name =name;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
	
}
