class Java41 
{
	String name ;
	int age;
	static String batch = "JAVA 41";

	
	public static void main(String[] args) 
	{
		Java41 Ekant = new Java41();
		Java41 Ankush = new Java41();
		Ekant.name = "EKANT";
		Ankush.name = "ANKUSH";
		Ekant.age = 21;
		Ankush.age = 20;
		System.out.println(Ekant.name+" is in the batch "+batch+ " and his age is "+Ekant.age);
		System.out.println(Ankush.name+" is in the batch "+batch+ " and his age is "+Ankush.age);



	}
}
