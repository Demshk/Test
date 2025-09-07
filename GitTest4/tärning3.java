import java.util.Random;
import java.util.Scanner;

public class tärning3{

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

Random rand = new Random();


int randTal;
randTal = rand.nextInt(1, 7);

System.out.println(randTal);


int count = 0;

while(count < 3){
    
    int input = scan.nextInt();
    
    if( input == randTal){
        System.out.println("Du gissade rätt");
        break;
    }else{
        System.out.println("Fel");
    }
    count++;
   
}
if(count == 3){
    System.out.println("Du har inga fler gissningar");
}
    
    
}



}



