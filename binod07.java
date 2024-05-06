class mahesh
{
int x;
int y;

void fun1(){
System.out.println("fun 1 of mahesh");
}

void fun2(){
System.out.println("fun 2 of mahesh");
}

}

class binod07
{
static void fun1(){
System.out.println("fun 1 of binod");
}


public static void main(String[] args){
System.out.println("------------");
fun1();
System.out.println("------------");
mahesh m1 = new mahesh();
System.out.println(m1.y);
m1.fun1();
m1.fun2();
System.out.println("------------");




}

}