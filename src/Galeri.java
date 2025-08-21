import java.util.ArrayList;
import java.util.Scanner;

public class Galeri {
    public static void main(String[] args) {

        // Uygulama uygulama1 = new Uygulama();// Uygulama classında main kaldırıldı Galeri classı içerisinde nesne türetildi uygulama sınıfında ki kodları çalıştrırabilmek için çaliştir geriye değer döndürmeyen bir methot yazıldı ve calistir ile ekrana yazdırılıyor
        //Uygulama.Calistir(uygulama1);

        ArrayList<Araba> mevcutArabalar = new ArrayList<>();

        mevcutArabalar.add(new Araba(1, "Toyota", "Corolla", 2020, 2000)); // add = eklemek anlamına gelir
        mevcutArabalar.add(new Araba(2, "Skoda", "Wolswogen", 2010, 3000));
        mevcutArabalar.add(new Araba(3, "Renault", "Clio", 2025, 2050));
        mevcutArabalar.add(new Araba(4, "Wolswogen", "Jetta", 2023, 2400));
        mevcutArabalar.add(new Araba(5, "Renault", "Toros", 2024, 3906));

        ArrayList<String> satisKayitlari = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {

            boolean sonuc = false;

            System.out.println("===Galeri Yönetim Sistemi===");

            System.out.println("1- Arabaları Listele");

            System.out.println("2-Fiyata Göre Filtrele");

            System.out.println("3-Markaya Göre Ara");

            System.out.println("4-Yeni Bir Araba Ekleme");


            System.out.println("6-Arabayı Satın Al");

            System.out.println("7-Satışları GÖrüntüle");

            System.out.println("8-Çıkış");

            System.out.print("Seçiminizi Giriniz:");
            int secim = scanner.nextInt();

            scanner.nextLine();
            if (secim == 1) { // Tüm Arabalar tekrardan bir dizi oluşturularak listelendi
                for (Araba m : mevcutArabalar) {
                    m.yazdir();
                }
            } else if (secim == 2) { // Fiyata göre Arabalar Filtrelendi

                System.out.print("Fiyat Giriniz:");
                double fiyat = scanner.nextDouble();

                for (Araba h : mevcutArabalar) {
                    if (h.fiyat <= fiyat) {
                        sonuc = true;
                        h.yazdir();
                    }
                }
                if (!sonuc) {
                    System.out.println("Bu Fiyata Uygun Araç Bulunamadı");
                }

            } else if (secim == 3) {// Markaya Göre Aranıyor

                System.out.print("Markaya Göre Ara:");
                String marka = scanner.nextLine();

                for (Araba d : mevcutArabalar) {// araba classın içinde arabalar dizisine döndük ve d değişkenine atadık
                    if (d.marka.equalsIgnoreCase(marka)) { // burada (d dizisinde ki marka ile girilen marka eşit mi diyede kontrol ediliyor)  equalsIgnoreCase :  İki Diziyi karşılaştırırken büyük küçük harf ayrımına takılmaz , ama equals kullanıldığında eşitlenen kelime bire bir aynı olmak zorunadadır
                        d.yazdir(); // d üzerinde yazdir metodum çalışıyor
                        sonuc = true;// marka
                    }
                }
                if (!sonuc) { // marka ismi yanlış girildiyse de bulundu eşit değildir
                    System.out.println("Lütfen  Aracın Marka Bilgisini Doğru Giriniz");
                }
            } else if (secim == 4)// Arabayı Satın Al
            {
                System.out.print("Satın almak istediğiniz araba ID:");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Müşteri Adı:");
                String musteriAdi = scanner.nextLine();

                System.out.print("Müşteri Soyadı:");
                String musteriSoyadi = scanner.nextLine();


                for (int i = 0; i < mevcutArabalar.size(); i++) {

                    Araba k = mevcutArabalar.get(i); // get(i) mevcutarablar dizisinde for döngüsü döner get(i) ile i. ci elemanını döndürür ve k ye atar
                    if (k.getId() == id) { // eğer getId ile == kullanıcının girdiği id eşitse

                        mevcutArabalar.remove(i); // remove(kaldır) demek mevcutarabalar dizisinde (i) indexsde ki diziyi kaldırdım

                        String kayit = "İD:" + k.id + " " + "Marka" + k.marka + " " + "Model:" + k.model + " " + "Yil:" + k.yil + "  " + " Fiyat:" + k.fiyat;

                        satisKayitlari.add(kayit); // kayit değişkene atanan id marka model yil fiyat bilgileri satiskayitlari.addd ekleniyor ArrayListine yani

                        System.out.println("Satış Gerçekleşti!");
                        System.out.println(musteriAdi + " " + musteriSoyadi + " " + k.marka + " " + k.model + " " + k.yil + " " + k.fiyat);
                        sonuc = true;
                    }
                }
                if (!sonuc) {
                    System.out.println("Satış Gerçekleşmedi"); // MevcutArabalar listesindeki id ler birden fazla satışı yapılacağı zaman Satış Gerçekleşmeyecek sonuca eşit değil çnkü

                }
            } else if (secim == 5) { //  satiskayitlari string olduğu için string tipinde diziyi saklıyor
                for (String s : satisKayitlari) {
                    System.out.println(s);
                }

            } else if (secim == 6) {
                System.out.println("Sistem Çıkış Yapıldı");
                sonuc = false;
                break;
            }

        }// while bitiş

    }

}
