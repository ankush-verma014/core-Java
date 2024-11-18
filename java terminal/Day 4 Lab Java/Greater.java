class Greater 
{
	public static void comp(int a,int b){
	 if(a>b){
		System.out.println( a+ " is greater than "+ b);
	 }else if (b>a){
	    System.out.println(b+ " is greater than "+ a);
	 }else{
	    System.out.println("Both are equal");
	 }
	}

	public static void main(String[] args) 
	{
		comp(4,2);
	}
}
