// write a program to implement a constructor overloading
class Col
{
 Col()
 {
   System.out.println("Default Constructor");
 }
 Col(int a)
 {
  System.out.println("value of a is "+a);
 }
public static void main(String []args)
{
  Col obj = new Col();
  Col obj1 = new Col(10);
}
}
output: Default Constructor
        value of a is 10
        
