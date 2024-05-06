import java.util.Scanner;
public class pattern1{

public static void main(String []args){
Scanner s1= new Scanner(System.in);
System.out.println(" enter the number :  ");
int n = s1.nextInt();
//printPattern(n);
//printPattern1(n);
printPattern2(n);
}

/*
private static void printPattern(int n){
for(int i =1 ; i<=n ; i++){
for( int j =1 ; j<=n; j++){
System.out.print(n);
}
System.out.println();

}
}*/
//
/*
1234
1234
1234
1234



private static void printPattern1(int n){
for(int i =1 ; i<=n ; i++){
for( int j =1 ; j<=n; j++){
System.out.print(j);
}
System.out.println();

}
}
//
*/

private static void printPattern2(int n){
for(int i =1 ; i<=n ; i++){
for( int j =1 ; j<=n; j++){
System.out.print(i);
}
System.out.println();

}
}
//



}