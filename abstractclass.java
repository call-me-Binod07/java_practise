//abstract class -- abstract function --- constructor on abstract class

//abstrct class creating;
abstract class demo
{
int x,y;
demo(){
System.out.println("parent's constructor");
}
abstract void f1();//abstract function , so

void f2()
{
System.out.println("function of parent class ");
}


}

class demo1 extends demo
{
demo1()
{
System.out.println("constructor of child class");
}

void f1()
{
System.out.println("created this f1 to remove it becoming the abstract class ");// over riding;
}
void f3(){

System.out.println("base function");
}

}

class abstractclass
{
public static void main(String args [])
{
demo1 d1 = new demo1();
d1.x=5;
d1.y=4;
d1.f1();
d1.f2();
d1.f3();
}
}