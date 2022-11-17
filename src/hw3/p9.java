package hw3;

public class p9 
{
	public static void maim(String[] args) 
	{
		Car car1;
		car1=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
	}
}

class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("car1車號是"+num);
		System.out.println("car1汽油量是"+gas);
	}
}