package testing;

public class RegistrationPage {
	
	static int number1,number2, number3; 
	
	static public int addition(int num1, int num2) 
	{
		number1=num1;
		number2=num2;	
		number3=number1+number2;  
		return number3;
	}
	

	public static void main(String[] args) {
		
		int firstInput=addition(10000,15);
		System.out.println("the additio of first two numbers:"+firstInput);
		
		int secondInput=addition(30,40);
		System.out.println("the additio of second inout:"+secondInput);
				
	}
}
