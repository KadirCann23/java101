import java.util.Scanner;

public class XXXX  {
    public static void main (String[] args) {

        double tutar, kdvorani = 0.18, kdvlitutar, kdvsiztutar, kdvmiktari;
        Scanner inp = new Scanner(System.in);

        System.out.println("ÜCRET TUTARINI GİRİNİZ");
        tutar = inp.nextDouble();
        kdvlitutar = tutar * kdvorani + tutar;

        kdvsiztutar = tutar;

        kdvmiktari =kdvlitutar - kdvsiztutar;


        String kdvoran = "%18";

        System.out.println("kdvsiz tutar:" + kdvsiztutar);
        System.out.println("kdv oranı: " + kdvoran);
        System.out.println("kdvli tutar:" + kdvlitutar);
        System.out.println("kdv miktarı:" + kdvmiktari);

        }


        }






