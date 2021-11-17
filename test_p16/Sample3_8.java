package test_p16;

public class Sample3_8 
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		int number = car1.getNum();
		System.out.println("¨®¸¹¬O"+number);
	}
}

class Car
{
	int num = 1234;
	int getNum()
	{
		return num;
	}
}