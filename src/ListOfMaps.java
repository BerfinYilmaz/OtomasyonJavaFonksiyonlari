import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    //Öğrencilerin Adını, Soyadını, Dersini ve Notunu tutan bir harita oluşturmak istiyoruz.
    //Sonrasında öğrencilerden bir liste oluşturalım.
    //Öğrenci 1: İsim: John, Soyadı: Doe, ders Matematik, Notu 90
    //Öğrenci 2: İsim: Kate, Soyadı: Win, ders Fizik, Notu 100
    //Öğrenci 3: İsim: Juan, Soyadı: Jose, ders Spor, Notu 20

    public static void main(String[] args) {

        HashMap<String,String> ilkOgrenci = new HashMap<>();
        ilkOgrenci.put("Isim","John");
        ilkOgrenci.put("Soyisim","Doe");
        ilkOgrenci.put("Ders","Matematik");
        ilkOgrenci.put("Not","90");

        System.out.println(ilkOgrenci);

        HashMap<String,String> ikinciOgrenci = new HashMap<>();
        ikinciOgrenci.put("Isim","Kate");
        ikinciOgrenci.put("Soyisim","Win");
        ikinciOgrenci.put("Ders","Fizik");
        ikinciOgrenci.put("Not","100");

        System.out.println(ikinciOgrenci);

        HashMap<String,String> ucuncuOgrenci = new HashMap<>();
        ucuncuOgrenci.put("Isim","Juan");
        ucuncuOgrenci.put("Soyisim","Jose");
        ucuncuOgrenci.put("Ders","Spor");
        ucuncuOgrenci.put("Not","20");

        System.out.println(ucuncuOgrenci);

        ArrayList<HashMap<String,String>> ogrenciListesi = new ArrayList<>();
        ogrenciListesi.add(ilkOgrenci);
        ogrenciListesi.add(ikinciOgrenci);
        ogrenciListesi.add(ucuncuOgrenci);

        System.out.println("...........................");
        System.out.println(ogrenciListesi);
        ogrenciListesi.get(0);
        System.out.println(ogrenciListesi.get(0));

    }
}
