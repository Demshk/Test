public class App {
    public static void main(String[] args){
       int snabbare = 0;
       double minTid = 9.5;
       double[] Rekord = {10.8, 10.6, 10.5, 10.3, 10.1, 10.0, 9.8, 9.7, 9.6, minTid};
       for(int i = 0; i < Rekord.length; i++)
       if(minTid < Rekord[i]){
        snabbare++;
        
       }
       System.out.println("Du sprang snabbare än " + snabbare + " personer på listan");
    
 
    }
}