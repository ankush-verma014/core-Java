class  Smaller
{
	public static void comp1(int x,int y){
		if(x<y){
			System.out.println(x+" is smaller than "+y);
		}else if(y<x){
			System.out.println(y+" is smaller than "+x);
		}else{
		    System.out.println("Both are equal");
		}
	}
	public static void main(String[] args) 
	{
		comp1(2,4);
	}
}
