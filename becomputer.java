class idiot{

void idiot(){
System.out.println("i am an idiot !");
}

static void idiot1(){

System.out.println("i am  idiot 1 ");
}

}

class becomputer{
static void idiot1(){

System.out.println("i am  idiot 2 ");
}



public static void main(String [] args)
{
System.out.println("==============");
System.out.println("from be computer ");
System.out.println("==============");
idiot1();
System.out.println("==============");
idiot.idiot1();
System.out.println("==============");
idiot id = new idiot();
id.idiot();
System.out.println("==============");

}
}