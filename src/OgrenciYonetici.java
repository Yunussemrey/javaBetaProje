public class OgrenciYonetici {
    Ogrenci ogrenci = new Ogrenci("Yunus Emre","Akgül",23,true,true,"Giresun");
    Ogrenci ogrenci2 = new Ogrenci("csdcdscsc","scsac",22,true,true,"fdvfdvfd");
    public void ogrenciYazdir() {
        System.out.println("Öğrenci adı: "+ogrenci.getAd());
        System.out.println("Öğrenci soyadı: "+ogrenci.getSoyad());
    }
    public void ogrenciEkle() {

        System.out.println("öğrenci 2 eklendi: "+ogrenci2.getAd());
    }
}
