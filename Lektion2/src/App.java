public class App {
    public static void main(String[] args) {
        int år = 2024;
    if ((år % 400 == 0) || (år % 4 == 0 && år % 100 != 0)) {
    System.out.println("Det är ett skottår");
} else {
    System.out.println("Det är inte ett skottår");
}
    }
}
