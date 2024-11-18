class swap{
public static void main(String[]args){
 int a = 3;
 int b = 4;
System.out.println("The actual value of a is "+a+" and b is "+b);
   a = a+b;
   b = a-b;
   a =  a-b;
  System.out.println("The swapped value of a is "+a+" and b is "+b);
    }
 }