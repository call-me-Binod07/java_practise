///*method/function  --- variable : camel case
//constraints -- all caps
//class and interface -- first lettr caps */


//package coding.java_programming.practise_code;


class Rectangle
{

public static void main(String args[]){

System.out.println("---------");
areaRectangle(3,4);
System.out.println("---------");
periRectangle(3,4);

}
static double l,b;


static void areaRectangle(double a,double c){
l=a;
b=c;
double area=l*b;
System.out.println("the area is : "+area);

}

static void periRectangle(double a,double c){
l=a;
b=c;
double peri=2*(l+b);
System.out.println("the peimeter is : "+peri);
}


}