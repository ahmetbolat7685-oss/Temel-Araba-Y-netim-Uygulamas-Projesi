public class Müsteri {

    int id;
    String ad;
    String soyad;

    public Müsteri(int id, String ad, String soyad) {

        this.id = id;
        this.ad = ad;
        this.soyad = soyad;

    }


   public int getId() {
        return id;
   }

   public void yazdira(){
       System.out.println("İd"+id+"Ad"+ad+"Soyad"+soyad);
   }

}
