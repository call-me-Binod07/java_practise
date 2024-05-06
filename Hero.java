class Hero
{
public static void main(String args[]){
One o1=new One();
o1.classicHero("ram");

}


}

class One{

String s1;
void classicHero(String s1)
{
this.s1=s1;
System.out.println("i am "+ this.s1);
}

}