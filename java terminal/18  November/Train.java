class Train 
{
	String train;
	double departure;
	int timeTaken;
	static String startingPoint = "Secunderabad";
	public static void main(String[] args) 
	{
		Train t1 = new Train();
		Train t2 = new Train();
		Train t3 = new Train();
		
		t1.train = "VandeBharat Express ";
		t1.departure = 7;
		t1.timeTaken = 6;

		t2.train = "Shatabdi Express ";
		t2.departure = 7.25;
		t2.timeTaken = 8;

		t3.train = "Nagavalli Express ";
		t3.departure = 5.10;
		t3.timeTaken = 7;

		System.out.println(t1.train+" departs at "+t1.departure+" and takes "+t1.timeTaken+" hrs to reach destination" );
        System.out.println(t2.train+" departs at "+t2.departure+" and takes "+t2.timeTaken+" hrs to reach destination" );
		System.out.println(t3.train+" departs at "+t3.departure+" and takes "+t3.timeTaken+" hrs to reach destination" );
      

	}
}
