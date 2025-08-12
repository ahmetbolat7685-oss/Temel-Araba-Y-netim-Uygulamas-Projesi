import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Araba> arabalar = new ArrayList<>();// ArrayList oluşturdum

        arabalar.add(new Araba(1, "Toyota", "Corolla", 2020, 200000)); // add = eklemek anlamına gelir
        arabalar.add(new Araba(2, "Skoda", "Wolswogen", 2010, 300000));
        arabalar.add(new Araba(3, "Renault", "Clio", 2025, 205000));
        arabalar.add(new Araba(4, "Wolswogen", "Jetta", 2023, 24000));
        arabalar.add(new Araba(5, "Renault", "Toros", 2024, 396));
        // arabalar.add(new Araba(6, "Ford", "Foxus", 2021, 50000));// araba.add ile diziye nesne türeterek eklendi tekradan ArrayListe manuel olarak eklemeye gerek var mı

        while (true) {// while başlangıç parantezi > döngü başlandı

            System.out.println("====Araba Galerisi====");

            System.out.println("1. Tüm Arabaları Listele");
            System.out.println("2. Fiyata Göre Filtrele");
            System.out.println("2. Fiyata Göre Filtrele");
            System.out.println("2. Fiyata Göre Filtrele");
            System.out.println("2. Fiyata Göre Filtrele");
            System.out.println("3. Markaya Göre Ara");
            System.out.println("4. Yeni Araba Ekle");
            System.out.println("5. Fiyata Göre Filtreleme Ve Markaya Göre Arama Özellikleri Ekleme");
            System.out.println("6- Cıkış");

            System.out.print("Seçiminizi Giriniz:");
            int secim = scanner.nextInt();// secime sayı yazabilmek için
            scanner.nextLine();// Eneter boşluk hatası


            // Tüm Arabalar Listelendi
            if (secim == 1) {
                for (Araba c : arabalar) { // foreach döngüsü kullanıldı (araba classın içerisinde ki arabalar dizisinde dönüp diziye erişim sağladım ve c atandı)
                    c.yazdir(); // c üzerinden yazdir metodu çalıştırıldı
                }
            }// if bitiş

            // Fiyata GÖre Filitreleme
            else if (secim == 2) {// değilse eğer secim 2 eşitse

                System.out.print(" Fiyat Giriniz: "); // ekrana yazdır

                double fiyat = scanner.nextDouble();// fiyat girilor

                boolean bulundu = false; // boolean bulundu mu false

                for (Araba c : arabalar) {

                    if (c.fiyat <= fiyat) {// eğer dizide ki fiyat girilen fiyattan küçük yada eşitse
                        c.yazdir();//  metodu yazdır
                        bulundu = true;// fiyatlar uyumlu olduğu için bulundu true yapıyoruz

                    }
                }
                if (!bulundu) {// fiyatı eşit değilse ekrana uyarı verilecek
                    System.out.println("Bu Fiyata Uygun araç  bulunamadı");
                }
            } else if (secim == 3) {// Markaya Göre Ara


                System.out.print("Markaya Göre Ara:");
                String marka = scanner.nextLine();

                boolean bulundu = false;

                for (Araba d : arabalar) {// araba classın içinde arabalar dizisine döndük ve d değişkenine atadık
                    if (d.marka.equalsIgnoreCase(marka)) { // burada (d dizisinde ki marka ile girilen marka eşit mi diyede kontrol ediliyor)  equalsIgnoreCase :  İki Diziyi karşılaştırırken büyük küçük harf ayrımına takılmaz , ama equals kullanıldığında eşitlenen kelime bire bir aynı olmak zorunadadır
                        d.yazdir(); // d üzerinde yazdir metodum çalışıyor
                        bulundu = true;// marka
                    }
                }
                if (!bulundu) { // marka ismi yanlış girildiyse de bulundu eşit değildir
                    System.out.println("Lütfen  Aracın Marka Bilgisini Doğru Giriniz");
                }
            } else if (secim == 4)// YENİ ARABA EKLEME
            {
                System.out.println("Eklemek istediğiniz arabanın bilgilerini giriniz!!");

                System.out.print("İD giriniz:");
                int id = scanner.nextInt();

                scanner.nextLine();
                System.out.print("Markasını Giriniz:");
                String marka = scanner.nextLine();

                System.out.print("Modelini Giriniz:");
                String model = scanner.nextLine();

                System.out.print("Yılını Girini:");
                int yil = scanner.nextInt();

                System.out.print("Fiyatını Girini:");
                double fiyat = scanner.nextDouble();

                Araba araba2 = new Araba(id, marka, model, yil, fiyat); // <Araba constructerında tüm değişkenler nesne oluşturulan araba2 atanıyor>Constructerdan clasdan nesne türetirken sonuna süslü { } konmaz sadece ; konur

                // Nesne türetilirken hem classa erişilir hemde coonstructr çalışır

                arabalar.add(new Araba(id, marka, model, yil, fiyat)); // önceden oluşturduğum ArrayListe yeni bir araba nesnesi ekler
                System.out.println("ARABA BAŞARILI BİR ŞEKİLDE EKLENMİŞTİR");

            } else if (secim == 5) {

                System.out.println("Fiyata Göre Ve Markaya Göre Arama Özellikleri Ekle");

                System.out.print("Fiyatı Giriniz:");// fiyat bilgisini alıyoruz
                double girilenFiyat = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Marka Bilgisini Giriniz:"); // marka bilgisi
                String marka = scanner.nextLine();

                boolean sonuc = false; // markanın ve fiayatının boolena bulundu tipini önce false yapıyoruz

                for (Araba k : arabalar) { // foreach döngüsünde Araba classında arabalar dizisinde dönüp k değişkenine atıyor
                    if (k.fiyat <= girilenFiyat && k.marka.equalsIgnoreCase(marka)) { // k dizisinde ki fiyat girilen fiyattan küçük yada eşşitse  marka bilgisinin büyük küçük harf karşılaştırmadan bilgisini eşitle
                        k.yazdir();// yazdir metodunu kullan
                        sonuc = true;// fiyatlar ve marka uyumlu olduğu için sonuç true
                    }
                }
                if (!sonuc) { // eğer sonuc doğru değilse false sonuç eşit değildir
                    System.out.println("İstenilen Fiyata GÖre Araç Bulunamadı");
                }

            } else if (secim == 6) {
                System.out.println("Sistemden Çıkış Yapıldı");
            }
            break; //// break ile döngüyü kırdım ve ===Araba Galerisi== Başlığı Çalışmıyor Artık
        }
    }
}


