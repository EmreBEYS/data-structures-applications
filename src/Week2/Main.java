package Week2;

public class Main {
    public static void main(String [] args){
        DiziIslemler di = null;
        System.out.println(di);

        DiziIslemler dizi=new DiziIslemler(5);
        dizi.yazdir();

        System.out.println("=================");
        dizi.ekle(12);

        System.out.println("=======Eklenmis Hali=====");
        dizi.yazdir();

        System.out.println("=======2.Ekleme Hali=====");
        dizi.ekle(23);
        dizi.yazdir();

    }
}
