package Week2;

public class DiziIslemler {
    int dizi[];
    int isaretci;


    public DiziIslemler(int n){
        //nesne yapılandırıcıları sınıf özeliklerinin il değerleri attar ve ilk başta sınıf ile ilgili yapılması gerekn herşeyi yapıldığı yerdir.
        dizi=new int[n];
        isaretci=n;
    }

    public void ekle(int yeniElaman){
        dizi[isaretci]=yeniElaman;
        isaretci--;
        if(isaretci== -1){
            System.out.println("Dizi dolu");
            isaretci = 0;
        }
    }

    void yazdir(){ //Metod gövdesi metodun ne olduğu ve metodun ismi ve parametresi olur
        for(int i=0;i<=dizi.length;i++){
            System.out.println(i+". elaman: " + dizi[i]);
        }
    }
    void silme(){}
}
