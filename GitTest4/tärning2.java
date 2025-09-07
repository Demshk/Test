import java.util.Random;
import java.util.Scanner;

public class tärning2 { 
    public static void main(String[] args) {

   Random rand = new Random();

   Scanner txt = new Scanner(System.in);

   int utfall;

   utfall = rand.nextInt(1, 7);

   System.out.println(utfall);
   
   int count = 0;

   while (count < 3){

       int gissning = txt.nextInt();
       
       if( gissning == utfall){
        System.out.println("Bra jobbat du gissade rätt ");
        break;
       } else {System.out.println("Gissa igen");}
       
      count++;
   }
   if(count == 3){

       System.out.println("Du har tyvärr inga fler försök");

   }

   
   


   }
    
}
