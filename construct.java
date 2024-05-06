// constructor (dfault amd parameterized)


class demo {

int x,y;
demo(){

System.out.println("default constructor is created !");
}

demo(int p , int q )
{
x=p;
y=q;

}

void display()
{
System.out.println("the values are "+ x +" and "+ y );
}

}

class construct
{
public static void main(String [] args)
{
demo d1=new demo();
demo d2=new demo(03,07);
d2.display();

}

}
