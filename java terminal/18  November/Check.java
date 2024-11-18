/*WAP for the following requirement: 
  1.Create a class
  2.Create a static method
  3.Create a LV in static method
  4.Assign value to LV
  5.Check whether the number is even or odd
  6.Call the static from the main method.
*/
class  Check
{
	public static void demo(int x){
		if(x%2==0){
			System.out.println("Even "+x);
		}else{
			System.out.println("Odd "+x);
		}
	}
	public static void main(String[] args) 
	{
		demo(34);
	}
}
