import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * author @26218
 */

public class Menghitungkata {

    public static void main(String[] args) 
     {
         Scanner s = new Scanner(System.in);
 
        System.out.print("\nMasukan kata : ");
        String kata = s.nextLine();
        kata = kata.toLowerCase();
        int jumlahKata = 0;
        int i = 0;
        while (i < kata.length()) {
            
            while (i < kata.length() && kata.charAt(i) == ' ') i++; 
 
            if (i < kata.length() && kata.charAt(i) != ' ') {
                jumlahKata++;
                while (i < kata.length() && kata.charAt(i) != ' ') i++;
            }
        }
 
        System.out.println("\nJumlah Kata : " + jumlahKata + " buah");
    }
}
