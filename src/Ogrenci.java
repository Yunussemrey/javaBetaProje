public class Ogrenci {
    private String ad;
   private String soyad;
   private int yas;
   private boolean uniOkuduMu;
    private String memleket;
    private boolean javaBiliyorMu;

    // Constructor --> sınıfların yapıcı bloğu ( Sınıfların içindeki tanımlanan değişkenleri yine bu sınıfın tanımlandığı
    // yerde değer atanır.
    public Ogrenci(String ad,String soyad,int yas,boolean uniOkuduMu,boolean javaBiliyorMu,String memleket) {
        this.soyad = soyad;
        this.ad = ad;
        this.uniOkuduMu = uniOkuduMu;
        this.yas = yas;
        this.javaBiliyorMu = javaBiliyorMu;
        this.memleket = memleket;
    }

    // getter ve setter ..
    //getter  --> private türündeki değişkeni farklı sınıfta ekrana yazdırmaya yarar
    // setter --> private türündeki değişkeni farklı sınıfta değer vermeye yarar


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isUniOkuduMu() {
        return uniOkuduMu;
    }

    public void setUniOkuduMu(boolean uniOkuduMu) {
        this.uniOkuduMu = uniOkuduMu;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }

    public boolean isJavaBiliyorMu() {
        return javaBiliyorMu;
    }

    public void setJavaBiliyorMu(boolean javaBiliyorMu) {
        this.javaBiliyorMu = javaBiliyorMu;
    }
}
