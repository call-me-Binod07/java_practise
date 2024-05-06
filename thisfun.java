// this keyword


class  hello
{

private int x;
private int y;

void f1(int x , int y)
{
this.x=x;

this.y=y;
}

void f2()
{
System.out.println(x +" and "+ y);

}


}

class thisfun
{
public static void main(String [] args)
{
//non-static so instances 
//therefore we have to make object ;

hello h1=new hello();
h1.f1(03,07);
h1.f2();

}
}