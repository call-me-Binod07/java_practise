/*method/function  --- variable : camel case
constraints -- all caps
class and interface -- first lettr caps */


package coding.java_programming.practise_code;


class Rectangle
{

public staic void main(){

System.out.println("---------");
areaRectangle(3,4);
System.out.println("---------");
periRectangle(3,4);

}
double l,b;


void areaRectangle(a,c){
l=a;
b=c;
double area=l*b;
System.out.println("the area is : "+area);

}

void periRectangle(l,b){
this.l=l;
this.b=b;
double peri=2*(l+b);
System.out.println("the peimeter is : "+peri);
}


}