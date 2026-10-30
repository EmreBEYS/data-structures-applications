package Week4;

public class MainClass {
    public static void  main(String[] args){
        Home [] d=new Home[10]; //Belekte dizi için yer ayarlanmış oldu.Bunuda compile tamda yapılır
        //Dizi nesneler
        for(int i=0; i<d.length;i++){ //Dizideki tüm sınıfıları yapınladırdık.
            d[i]=new Home();
        }
        d[0].sakinekle("Emre","Kul",1,1);
        d[1].sakinekle("Ahmet","Kaya",2,1);

        for(int i=0; i<d.length;i++){ //Dizideki tüm sınıfıları yapınladırdık.
            d[i].daireozelikleriyazdir(); //öDEV BLOK SINIFI OLUŞTURURLUO  her sitenin hangi bloğunda kaç kişi var ilgli sistem.
            //tÜRETME İLİŞKİSİ
        }

    }
}
