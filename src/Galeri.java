import java.util.ArrayList;
import java.util.Scanner;

public class Galeri {


    public static void main(String[] args) {


        ArrayList<Araba> mevcutArabalar = new ArrayList<>();

        mevcutArabalar.add(new Araba(1, "Toyota", "Corolla", 2020, 200000)); // add = eklemek anlamına gelir
        mevcutArabalar.add(new Araba(2, "Skoda", "Wolswogen", 2010, 300000));
        mevcutArabalar.add(new Araba(3, "Renault", "Clio", 2025, 205000));
        mevcutArabalar.add(new Araba(4, "Wolswogen", "Jetta", 2023, 24000));
        mevcutArabalar.add(new Araba(5, "Renault", "Toros", 2024, 396));


        ArrayList<String> satisKayitlari = new ArrayList<>();


       // Araba araba1 = new Araba(); // Araba Classı içerisinde Araba Constructerından nesne türettik get ve set ile değer okuduk ve atadık

        Galeri galeri1 = new Galeri();


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("===Galeri Yönetim Sistemi===");

            System.out.print("1- Arabaları Listele");
            System.out.println();
            System.out.print("2-Arabayı Satın Al");
            System.out.println();
            System.out.print("3-Satışları Görüntele");
            System.out.println();
            System.out.print("4-Çıkış");
            System.out.println();
            System.out.print("Seçiminizi Giriniz:");
            int secim = scanner.nextInt();

            if (secim == 1) {
                for (Araba m : mevcutArabalar) {
                    /*araba1.setId(1);
                    System.out.println("Araba ID:" + araba1.getId());

                    araba1.setMarka("Toyota");
                    System.out.println(araba1.getMarka());
                    araba1.setModel("Corolla");

                    araba1.setYil(2020);
                    System.out.println(araba1.getYil());
                    araba1.setFiyat(30000);
                    System.out.println(araba1.getFiyat());*/
                    m.yazdir();
                }
            }


        }

    }
}