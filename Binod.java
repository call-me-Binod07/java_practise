

/*
-take ip from use
-if inp == 2 ; skip
if no of count is more than 5 break;
and ..
-*/

import java.util.*;
public class Binod{
    
    public static void main(String[] args){
        
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
       int value= sc.nextInt();
       int flag=0;
       while(value !=0){
           value=value/2;
           
           flag++;
           
           if(value%2==0){
               continue;
           }
           if(flag>5){
               break;
           }
           System.out.println(value);
       }
        
        
        
    }
}
