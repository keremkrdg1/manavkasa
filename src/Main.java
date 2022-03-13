import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner giris = new Scanner(System.in);

     double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        System.out.print("Armut Kaç Kilo? : ");
        double armutkg = giris.nextInt();
        System.out.print("Elma Kaç Kilo? : ");
        double elmakg = giris.nextInt();
        System.out.print("Domates Kaç Kilo? : ");
        double domateskg = giris.nextInt();
        System.out.print("Muz Kaç Kilo? : ");
        double muzkg = giris.nextInt();
        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicankg = giris.nextInt();

        double armuttop = armut * armutkg;
        double elmatop = elma * elmakg;
        double domatestop = domates * domateskg;
        double muztop = muz * muzkg;
        double patlicantop = patlican * patlicankg;

        double tutar = armuttop + elmatop + domatestop + muztop + patlicantop ;
        System.out.println("Toplam Tutar : " + tutar);

        }
}