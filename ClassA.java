import java.util.Scanner;
class ClassA
{
 private int num1;
 private int num2;
 public ClassA()
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the first number:");
 num1 = sc.nextInt();
 System.out.println("Enter the second number:");
 num2 = sc.nextInt(); 
}
 public int getNum1()
 {
  return num1;
 }
 public int getNum2()
 {
  return num2;
 }
}
class ClassB
{
 private int num1;
 private int num2;
 public ClassB(int num1,int num2)
 {
  this.num1 = num1%100;
  this.num2 = num2%100;
 }
 public int getNum1()
 {
 return num1;
}
 public int getNum2()
{
 return num2;
}
}
class ClassC
{
 public static void main(String[] args)
{
 ClassA a = new ClassA();
 ClassB b = new ClassB(a.getNum1(),a.getNum2());
 System.out.println("Result:"+(b.getNum1()*b.getNum2()));
}
}