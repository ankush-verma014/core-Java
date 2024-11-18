class Sample 
{
	static int x = 10;
	double y;
	public static void display(){
	int x = 100;
	System.out.println("The value of x is "+x);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		int x = 200;
		System.out.println("Value of x in main:"+x);
		System.out.println("Value of SV x: "+Sample.x);
		Sample s1 = new Sample();
		System.out.println("Value of IV y: "+s1.y);
		System.out.println("Main ends ");
	}
}
