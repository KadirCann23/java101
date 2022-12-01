import java.util.Scanner;

public class yeni {
        public static void main(String[] args) {


                int mat, fizik, kimya, turkce, tarih, muzik;
                Scanner inp = new Scanner(System.in);

                System.out.print("Matematik Notunuz : ");
                // KULLANICIDAN VERİ GİRİLECEK PARAMETRESİ :)))
                mat = inp.nextInt();

                System.out.println("Fizik Notunuz : ");
                fizik = inp.nextInt();

                System.out.println("Kimya Notunuz : ");
                kimya = inp.nextInt();

                System.out.println("Türkçe Notunuz : ");
                turkce = inp.nextInt();

                System.out.println("Tarih Notunuz : ");
                tarih = inp.nextInt();

                System.out.println("Müzik Notunuz : ");
                muzik = inp.nextInt();

                int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

               double sonuc1 = toplam / 6;

               boolean kosul1 = sonuc1 >= 60;

               String str = kosul1 ? " GEÇTİ" : " KALDI";

               System.out.println("ORTALAMANIZ : " + sonuc1 +"\n"+ str );


        }
    }
