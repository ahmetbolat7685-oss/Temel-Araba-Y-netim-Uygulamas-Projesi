import java.util.ArrayList;
import java.util.Scanner;

public class Galeri {
    public static void main(String[] args) {

        Uygulama uygulama1 = new Uygulama();// Uygulama classında main kaldırıldı Galeri classı içerisinde nesne türetildi uygulama sınıfında ki kodları çalıştrırabilmek için çaliştir geriye değer döndürmeyen bir methot yazıldı ve calistir ile ekrana yazdırılıyor
        uygulama1.Calistir();

        ArrayList<Araba> mevcutArabalar = new ArrayList<>();

        mevcutArabalar.add(new Araba(1, "Toyota", "Corolla", 2020, 2000)); // add = eklemek anlamına gelir
        mevcutArabalar.add(new Araba(2, "Skoda", "Wolswogen", 2010, 3000));
        mevcutArabalar.add(new Araba(3, "Renault", "Clio", 2025, 2050));
        mevcutArabalar.add(new Araba(4, "Wolswogen", "Jetta", 2023, 2400));
        mevcutArabalar.add(new Araba(5, "Renault", "Toros", 2024, 3906));

        ArrayList<String> satisKayitlari = new ArrayList<>();

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
                String musteriAdi = scanner.nextLine();

                System.out.print("Müşteri Soyadı:");
                String musteriSoyadi = scanner.nextLine();

                boolean sonuc = false;

                for (int i = 0; i < mevcutArabalar.size(); i++) {

                    Araba k = mevcutArabalar.get(i); // get(i) mevcutarablar dizisinde for döngüsü döner get(i) ile i. ci elemanını döndürür ve k ye atar
                    if (k.getId() == id) { // eğer getId ile == kullanıcının girdiği id eşitse

                        mevcutArabalar.remove(i); // remove(kaldır) demek mevcutarabalar dizisinde (i) indexsde ki diziyi kaldırdım

                        String kayit = "İD:" + k.id + " " + "Marka" + k.marka + " " + "Model:" + k.model + " " + "Yil:" + k.yil + "  " + " Fiyat:" + k.fiyat;

                        satisKayitlari.add(kayit); // kayit değişkene atanan id marka model yil fiyat bilgileri satiskayitlari.addd ekleniyor ArrayListine yani

                        System.out.println("Satış Gerçekleşti!");
                        //k.yazdir();
                        System.out.println(musteriAdi + " " + musteriSoyadi + " " + k.marka + " " + k.model + " " + k.yil + " " + k.fiyat);
                        sonuc = true;
                    }
                }
                if (!sonuc) {
                    System.out.println("Satış Gerçekleşmedi");
                }
            } else if (secim == 3) {

                System.out.println(satisKayitlari);
            }
            break;
        }// while bitiş

    }
}
