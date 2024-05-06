//ScannerClass.java

//util ko Scanner package install garna na birsis;
import java.util.Scanner;


class ScannerClass{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);


// System.in lekhna nna birsis .....for input from keyboard;

System.out.println(" Enter your name ?😉 ");
String name = sc.nextLine();
System.out.println(" Enter your age ?😉 ");
int age = sc.nextInt();
System.out.println(" Enter your address?😉 ");
 sc.nextLine();
String address = sc.nextLine();

System.out.println(" ------------------------------------ ");

System.out.println(" Hello, "+name+" . your age is recorded as "+age+" and address is recorded as "+address+". thank you.");

System.out.println(" ------------------------------------ ");

}
}

