/*
  Q1. Write a Java program to display all the Buzz Numbers between two integers
p and q (where p < q). A Buzz Number is a number that either:
   - Ends with 7 (last digit is 7), or
   - Is divisible by 7.
Requirements:
Create a user-defined method named isBuzzNumber(int num) to check if
a number is a Buzz Number.
The method should return true if the number is a Buzz Number, otherwise
return false.
Create another method named displayBuzzNumbers(int p, int q) to iterate
through the range [p, q] and display all the Buzz Numbers.
In the main() method:
Store value for input for p and q.
Call the method displayBuzzNumbers(p, q) to display the results.
Example Input and Output:
Input:
int p = 10
int q = 30

Output:
The Buzz Numbers between 10 and 30 are:
14, 17, 21, 27
*/

class BuzzNumber 
	{
   
       public static boolean isBuzzNumber(int num) 
		{
            return (num % 7 == 0) || (num % 10 == 7);
        }

        public static void displayBuzzNumbers(int p, int q) 
			{
               System.out.println("The Buzz Numbers between " + p + " and " + q + " are:");
               for (int i = p; i <= q; i++) 
				   {
                     if (isBuzzNumber(i)) 
						 {
                            System.out.print(i + " ");
                         }
                   }
                        System.out.println();
            }

        public static void main(String[] args) 
		 {
       
            int p = 10;
            int q = 30;

             displayBuzzNumbers(p, q);
         }
    }
