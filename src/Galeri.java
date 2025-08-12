import java.util.ArrayList;
import java.util.Scanner;

public class Galeri {


    public static void main(String[] args) {

        //Araba araba1 = new Araba();

        ArrayList<Araba> mevcutArabalar = new ArrayList<>();

        mevcutArabalar.add(new Araba(1, "Toyota", "Corolla", 2020, 200000)); // add = eklemek anlamına gelir
        mevcutArabalar.add(new Araba(2, "Skoda", "Wolswogen", 2010, 300000));
        mevcutArabalar.add(new Araba(3, "Renault", "Clio", 2025, 205000));
        mevcutArabalar.add(new Araba(4, "Wolswogen", "Jetta", 2023, 24000));
        mevcutArabalar.add(new Araba(5, "Renault", "Toros", 2024, 396));


        ArrayList<String> satisKayitlari = new ArrayList<>();



        // Araba araba1 = new Araba(); // Araba Classı içerisinde Araba Constructerından nesne türettik get ve set ile değer okuduk ve atadık

        // Galeri galeri1 = new Galeri();


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

            if (secim == 1) { // Tüm Arabalar tekrardan bir dizi oluşturularak listelendi
                for (Araba m : mevcutArabalar) {
                    m.yazdir();
                }
            } else if (secim == 2) {

                System.out.print("Satın almak istediğiniz araba ID:");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Müşteri Adı:");
                String müsteriAdi = scanner.nextLine();

                System.out.print("Müşteri Soyadı:");
                String müsteriSoyadi = scanner.nextLine();


                boolean sonuc = false;

                for (Araba k: mevcutArabalar){
                    if (k.getId() == id){ // getId gelen id kullanıcın girdiği İd eşitse
                        k.yazdir();
                        sonuc = true;

                        System.out.println("---Satış Gerçekleşti---");

                    }
                    else if (!sonuc){
                        System.out.println("Satış gerçekleşmedi");
                        break;
                    }


                }


            }
        }
    }
}
