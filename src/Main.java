import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Araba> arabalar = new ArrayList<>();// ArrayList oluşturdum

        arabalar.add(new Araba(1, "Toyota", "Corolla", 2020, 200000));
        arabalar.add(new Araba(2, "Skoda", "Wolswogen", 2010, 300000));
        arabalar.add(new Araba(3, "Renault", "Clio", 2025, 205000));
        arabalar.add(new Araba(4, "Wolswogen", "Jetta", 2023, 24000));
        arabalar.add(new Araba(5, "Renault", "Toros", 2024, 396000));

        while (true) {// while başlangıç parantezi

            System.out.println("====Araba Galerisi====");

            System.out.println("1. Tüm Arabaları Listele");
            System.out.println("2. Fiyata Göre Filtrele");
            System.out.println("3. Markaya Göre Ara");
            System.out.println("4. Yeni Araba Ekle");
            System.out.println("5. Çıkış");

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
            else if (secim == 2) {// değilse eğer secim eşitse

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
                if (!bulundu){ // marka ismi yanlış girildiyse de bulundu eşit değildir
                    System.out.println("Aracın Marka Bilgisini Doğru Giriniz");
                }

                else  if(secim==4)
                {

                }








            }// while bitiş parantezi
        }

    }
}// class bitiş