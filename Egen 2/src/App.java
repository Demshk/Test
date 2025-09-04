public class App {
   public App() {
   }

   public static void main(String[] var0) {
      double var1 = 9.0;
      double[] var3 = new double[]{10.8, 10.6, 10.5, 10.3, 10.1, 10.0, 9.8, 9.7, 9.6, var1};
      int var4 = 0;

      for(int var5 = 0; var5 < var3.length; ++var5) {
         if (var3[var5] < var1) {
            ++var4;
         }

         {System.out.println("Din plats är " + var4);
         System.out.println("du var snabbare än " + (var3.length - var4));}
      }

   }
}