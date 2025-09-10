

public class Uygulama {

    String ilanBaslik;
    String marka;
    String seri;
    String model;
    int yil;
    double kilometre;
    String vitesTipi;
    String yakitTipi;


    public Uygulama(String ilanBaslik, String marka, String seri, String model, int yil, double kilometre, String vitesTipi, String yakitTipi) {

      /*  this.ilanBaslik = ilanBaslik;
        this.marka = marka;
        this.seri = seri;
        this.model = model;
        this.yil = yil;
        this.kilometre = kilometre;
        this.vitesTipi = vitesTipi;
        this.yakitTipi = yakitTipi;
*/
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }

    public double getKilometre() {
        return kilometre;
    }

    public void setKilometre(double kilometre) {
        this.kilometre = kilometre;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getIlanBaslik() {
        return ilanBaslik;
    }

    public void setIlanBaslik(String ilanBaslik) {
        this.ilanBaslik = ilanBaslik;
    }

    public void cikti() {

        System.out.println("İlan Başlığı"+ilanBaslik

        );

    }

}