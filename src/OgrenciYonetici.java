public class OgrenciYonetici {
    Ogrenci ogrenci = new Ogrenci("Yunus Emre","Akgül",23,true,true,"Giresun");
    Ogrenci ogrenci2 = new Ogrenci("csdcdscsc","scsac",22,true,true,"fdvfdvfd");
    Ogrenci ogrenci3 = new Ogrenci("Kaan","sasd",25,true,true,"İstanbul");
    public void ogrenciYazdir() {
        System.out.println("Öğrenci adı: "+ogrenci.getAd());
        System.out.println("Öğrenci soyadı: "+ogrenci.getSoyad());
        System.out.println("yeni öğrenci "+ ogrenci3.getAd());
    }
    public void ogrenciEkle() {

        System.out.println("öğrenci 2 eklendi: "+ogrenci2.getAd());
    }
}
