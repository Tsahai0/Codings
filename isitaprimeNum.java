/**
Name:Tsahai Corbie
 
*/

import java.util.Scanner;

public class isitaprimeNum{
   
   public static void main(String[] args) {
   
      System.out.println("enter a number");//ask the user for number
      Scanner kb= new Scanner(System.in);
      int num= kb.nextInt();//takes the user's user input
      
      boolean prime= true;
      
      for(int i=2; i<num;i++){
      
         if(num%i==0){
         //the code checks if  number is divisible by more than just 1
         prime=false;
        
         }
      }
       if(prime== true)
       System.out.print("it is a prime number");
       
       else 
       System.out.print("it is not a prime number");
    }

}