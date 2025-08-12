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
    public Araba(){ // nesne oluşturmadan önce nesneye değer atamıyorsam boi bir constructer tanımlamam gerekiyor

    }
        public int getId () {
            return id;
        }
        public void setId (int id) {

            this.id = id;
        }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public String getModel(String model){
        return model;
    }

    public  void setModel(String marka){
        this.model = model;

    }
    public int getYil() {
        return yil;
    }

    public void setYil(int yil){
        this.yil = yil;
    }

    public double getFiyat(){
        return  fiyat;

    }

    public void setFiyat(double fiyat){
        this.fiyat = fiyat;
    }


    public void yazdir() {  // değişkenleri ekrana yazdırdık ve yazdir metodu ile de istediğimiz yerde yazdırabiliriz

        System.out.println("İd:" + id + " " + "Marka:" + marka + " " + "Model:" + model + " " + "YİL:" + yil + " " + "Fiyat:" +
                fiyat); // geriye değer döndürmeyen bir methot tanımlayarak değişkenlerimi yazdırdım
    }



}
