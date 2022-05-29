package PatikaOdevler;
import java.util.Scanner;
public class PatikaTekSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int sayi, toplam = 0;

        do {
            System.out.print("Sayı giriniz : ");
            sayi = inp.nextInt();
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 == 0);
        System.out.print("Sayıların toplamı : " + toplam );
    }
}
