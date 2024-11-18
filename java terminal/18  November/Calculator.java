//Program to accept two integers as
input and find their sum
class Calculator 
{
	public static void findSum(int a,int b){
		int sum = a+b;
		System.out.println("Sum of "+a+" and "+b+" : "+sum);
	}
	public static void main(String[] args) 
	{
		int a,b;
		a = 100;
		b = 200;
		findSum(a,b);
	}
}
