class class1
{
static void fun1()
{
System.out.println("class1's fun1 ");
}
}

class class2
{
static void fun1()
{
System.out.println("class2's fun1 ");
}

public static void main(String [] args){
System.out.println("----------------------------------------");

System.out.println("main file");
System.out.println("----------------------------------------");
fun1();
System.out.println("----------------------------------------");
class1.fun1();



}
}