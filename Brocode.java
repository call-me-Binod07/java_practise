//Brocode.java
//constructor

class Brocode{

public static void main(String args[]){
Babes b1 = new Babes();
System.out.println("......................................");
System.out.println("......................................");
b1.calcValues(7,7);
System.out.println("......................................");
System.out.println("......................................");

}

}


class Babes extends Brocode{

int a ; int b;
void calcValues(int a , int b){
this.a=a;
this.b=b;

System.out.println("bro bro , the result is :"+ this.a + " and " +this.b);

}

}

