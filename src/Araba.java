public class Araba { // araba adlı sınıf oluşturuldu

    // Değişkenler tanımlandı

    int id;
    String marka;
    String model;
    int yil;
    double fiyat;

    public Araba(int id, String marka, String model, int yil, double fiyat) {

        this.id = id; // değişkenden gelen id consructerdan gelen parametreye atıyoruz
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

    }

    public int getId(){ //
        return  id;
    }



    public void yazdir() {  // değişkenleri ekrana yazdırdık ve yazdir metodu ile de istediğimiz yerde yazdırabiliriz

        System.out.println("[İd:]" + id + " " + "Marka:" + marka + " " + "Model:" + model + " " + "YİL:" + yil + " " + "Fiyat:" +
                fiyat); // geriye değer döndürmeyen bir methot tanımlayarak değişkenlerimi yazdırdım
    }



}
