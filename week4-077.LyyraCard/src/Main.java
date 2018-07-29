
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        
        Scanner reader = new Scanner(System.in);
        
        LyyraCard Pekka = new LyyraCard(20.0);
        LyyraCard Brian = new LyyraCard(30.0);
        
        Pekka.payGourmet();
        Brian.payEconomical();
        
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);
        
        Pekka.loadMoney(20.0);
        Brian.payGourmet();
        
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);
        
        Pekka.payEconomical();
        Pekka.payEconomical();
        Brian.loadMoney(50.0);
        
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);
    }
}
