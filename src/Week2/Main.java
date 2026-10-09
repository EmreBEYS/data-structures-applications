package Week2;

public class Main {

    public static void main(String[] args) {

        DiziIslemler di = null;
        System.out.println(di);

        DiziIslemler dizi = new DiziIslemler(5);

        dizi.yazdir();

        System.out.println("=================");

        dizi.ekle(12);

        System.out.println("=======Eklenmis Hali=====");
        dizi.yazdir();

        System.out.println("=======2.Ekleme Hali=====");

        dizi.ekle(23);
        dizi.yazdir();
        System.out.println("=======3.Ekleme Hali=====");
        dizi.ekle(40);
        dizi.ekle(20);
        dizi.ekle(10);
        dizi.yazdir();
        System.out.println("Silinen eleman:"+ dizi.silme());
        dizi.yazdir();
        System.out.println("=======Silme işleminden sonra veri eklenmiş Hali=====");
        dizi.ekle(32);
        dizi.yazdir();
        System.out.println("=======Dizi elaman ara=====");
        System.out.println("Dizide aranan elamanın indexi: "+dizi.ara(20));
        System.out.println("Dizide aranan elamanın indexi: "+dizi.ara(500));
    }
}