public class App {
    public static void main(String[] args) {
        Boolean ID = true;
        int age = 18;
        String Day = ("sunday");
        Boolean isFull = false;

       
    
        if (age >= 18 && ID == true && isFull == false && (Day.equals ("saturday") || Day.equals("sunday") || (age >= 21 && (!Day.equals("saturday") && !Day.equals("sunday"))))) {
            System.out.println("Welcome");}

        else if (age >= 21 && ID == true && isFull == false && (!Day.equals("saturday") || Day.equals("sunday"))){
                System.out.println("Welcome");
            }
         else{
            System.out.println("Sorry we cant let you in");
        }


    }
}
