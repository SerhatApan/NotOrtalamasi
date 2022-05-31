import java.util.Scanner;

public class notortalama {
    public static void main(String[] args) {
        // Değişkenler

        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfı

        Scanner inp = new Scanner(System.in);

        //kullanıcı değerleri

        System.out.println("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = inp.nextInt();
        //Ortalama

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;
        boolean sorgu= ortalama  >=60 || ortalama<60;
        String sonuc =sorgu ? "Sınıfı Gecti" :"Sınıfta Kaldi";

        System.out.println("Ortalamanız:" +ortalama);
        System.out.println("Sonucunuz:" +sonuc);

    }
}
