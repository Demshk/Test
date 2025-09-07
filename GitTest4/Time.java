import java.time.LocalTime;
import java.util.Scanner;

public class Time { public static void main(String[] args) {

    LocalTime Tid = LocalTime.of(18, 30); 

    
    Scanner timMin = new Scanner(System.in);
    
    System.out.println("Timmar");
    int timmar = timMin.nextInt();
    System.out.println("Minuter");
    int minuter = timMin.nextInt();
    
    LocalTime future = Tid.plusHours(timmar).plusMinutes(minuter);

    
    System.out.println("Klockan är nu " + Tid + " Och om " + timmar + " timmar och" + minuter + " minuter kommer klockan att vara" + future);
} 
    
}
