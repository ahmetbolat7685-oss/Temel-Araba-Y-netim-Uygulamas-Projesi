
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Galeri {
    public static void main(String[] args) throws Exception {
// İnteliji İdea da kodları CTRL + ALT+ L tuşuna bastığında kodlar otomatik olarak düzenlenecektir

       Document doc = Jsoup.connect("https://www.arabam.com/ikinci-el").get();;
        System.out.println(doc.head());


        ArrayList<Araba> mevcutArabalar = new ArrayList<>(); // Araba classında mevcutArabalar değişkeni tutan bir ArrayList dizisidir

        mevcutArabalar.add(new Araba(1, "Toyota", "Corolla", 2020, 20000)); // add = eklemek anlamına gelir
        mevcutArabalar.add(new Araba(2, "Skoda", "Wolswogen", 2010, 30000));
        mevcutArabalar.add(new Araba(3, "Renault", "Clio", 2025, 40000));
        mevcutArabalar.add(new Araba(4, "Wolswogen", "Jetta", 2023, 50000));
        mevcutArabalar.add(new Araba(5, "Renault", "Toros", 2024, 60000));

        ArrayList<String> satisKayitlari = new ArrayList<>(); // String tipinde tutan ve değerleri satisKayitlarına atanan bir String ArrayList dizisi

        Scanner scanner = new Scanner(System.in);
        while (true) { // sonsuz döngü başlatıldı

            boolean sonuc = false; // ilk önce sonuc başlatılmadığı false yapıyoruz

            System.out.println("===Galeri Yönetim Sistemi===");

            System.out.println("1-Tüm Arabaları Listele");


            System.out.println("2-Fiyata Göre Filtrele");

            System.out.println("3-Markaya Göre Ara");

            System.out.println("4-Yeni Bir Arabaya Ekleme");

            System.out.println("5-Fiyata Göre Filtreleme Ve Markaya Göre Arama");

            System.out.println("6-Arabayı Satın Al");

            System.out.println("7-Satışları GÖrüntüle");

            System.out.println("8-Çıkış");

            System.out.print("Seçiminizi Giriniz:");
            int secim = scanner.nextInt(); // seçimi giriyoruz

            scanner.nextLine();// Enter hatası

            if (secim == 1) { // Tüm Arabalar tekrardan bir dizi oluşturularak listelendi
                for (Araba m : mevcutArabalar) { //Araba classı içinde mevcutArabalar dizisinde dön ve m ata
                    m.yazdir(); // m ile de Araba sınıfında yazdir metodu çallışıyor ve id marka model yil fiyat bilgileri ekrana yazdırılıyor
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
            } else if (secim == 4) {

                System.out.println("Eklemek İstediğiniz Arabanın Bilgilerini Giriniz");

                System.out.print("İd giriniz:");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Marka Giriniz:");
                String marka = scanner.nextLine();

                System.out.print("Marka Giriniz:");
                String model = scanner.nextLine();

                System.out.print("Yıl giriniz:");
                int yil = scanner.nextInt();

                System.out.print("Fiyatı Giriniz:");
                double fiyat = scanner.nextDouble();

                Araba araba1 = new Araba(id, marka, model, yil, fiyat);

                System.out.println("Araba Başarılı Bİr Şekilde Eklenmiştir");
                System.out.println(id + " " + marka + " " + model + " " + yil + " " + fiyat);
            } else if (secim == 5) {

                System.out.print("Fiyat Giriniz:");
                double fiyat = scanner.nextDouble();

                scanner.nextLine();

                System.out.print("Marka Bilgisini Giriniz:");
                String marka = scanner.nextLine();

                for (Araba x : mevcutArabalar) {
                    if (x.fiyat <= fiyat && x.marka.equals(marka)) {
                        sonuc = true;
                        x.yazdir();
                    }
                }
                if (!sonuc) {
                    System.out.println("Lütfen Aracın Fiyatını ve Marka Bilgilerini Doğru Giriniz!!  ");
                }
            } else if (secim == 6)// Arabayı Satın Al
            {
                System.out.print("Satın almak istediğiniz araba ID:");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Müşteri Adı:");
                String musteriAdi = scanner.nextLine();

                System.out.print("Müşteri Soyadı:");
                String musteriSoyadi = scanner.nextLine();

                Musteri musteri = new Musteri(id, musteriAdi, musteriSoyadi); // müsteri sınıfından nesne türetildi getter setter kullanılmak için

                for (int i = 0; i < mevcutArabalar.size(); i++) {

                    Araba k = mevcutArabalar.get(i); // get(i) mevcutarablar dizisinde for döngüsü döner get(i) ile i. ci elemanını döndürür ve k ye atar
                    if (k.getId() == id) { // eğer getId ile == kullanıcının girdiği id eşitse

                        mevcutArabalar.remove(i); // remove(kaldır) demek mevcutarabalar dizisinde (i) indexsde ki diziyi kaldırdım

                        String kayit = musteri.getAd() + " " + musteri.getSoyad() + " " + k.marka + " " + k.model + " " + k.yil + "  " + k.fiyat + "TL";

                        satisKayitlari.add(kayit); // kayit değişkene atanan id marka model yil fiyat bilgileri satiskayitlari.addd ekleniyor ArrayListine yani

                        System.out.println("Satış Gerçekleşti!");

                        System.out.println(musteriAdi + " " + musteriSoyadi + " " + k.marka + " " + k.model + " " + k.yil + " " + k.fiyat);
                        sonuc = true;
                    }
                }
                if (!sonuc) {
                    System.out.println("Satış Gerçekleşmedi"); // MevcutArabalar listesindeki id ler birden fazla satışı yapılacağı zaman Satış Gerçekleşmeyecek sonuca eşit değil çnkü
                }

            } else if (secim == 7) { //  satiskayitlari string olduğu için string tipinde diziyi saklıyor
                System.out.println("----SATIŞLAR----");
                for (String s : satisKayitlari) {
                    System.out.println(s);
                }
            } else if (secim == 8) {
                System.out.println("Sistemden Çıkış Yapıldı");
                sonuc = false;
                break;
            }
        }// while bitiş
    }
}
