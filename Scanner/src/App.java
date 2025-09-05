import java.util.Random;
import java.util.Scanner; 

public class App {
    public static void main(String[] args) {

        Random randome = new Random();

        int computerDie = randome.nextInt(1,7); //gennererar tal 1-6

        App scanner = new App(System.in);
        
        int attempts = 0;

        
        while(true){
            
            int humanGuess = scanner.nextInt();

            if (computerDie == humanGuess) {
                System.out.println("You win");
                break;
        }
        attempts++;
        if(attempts >= 3) {
            System.out.println("you lose!");
            break;
        }
        }

        
    }
}
