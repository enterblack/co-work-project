package exerJava;

class Person
{
	private int perID;
	private int miID;
	
	
	public Person(int pID, int mID)
	{
		perID = pID;
		miID = mID;
	}
	
	public Person(int pID)
	{
		perID = pID;
		miID = 0;
	}
	
	public void showInfo()
	{
		System.out.println("민번 : "+perID);
		if(miID != 0)
		{
			System.out.println("군번 :" + miID + '\n');
		}
		else
		{
			System.out.println("군과 관계 없음 \n");
		}
	}
	
	
}


public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person man = new Person(950123,880102);
		Person woman = new Person(941125);
		
		man.showInfo();
		woman.showInfo();
	
	}

}
