class Zoo 
{
	static String typeName = "Herbivores";
	public static void main(String[] args) 
	{
		Zoo z1 = new Zoo();
		String typeName = "local Herbivores";
		System.out.println("In this i am accessing static variable "+z1.typeName);
		System.out.println("In this i am accessing local variable "+typeName);
	}
}
