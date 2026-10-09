package Week3;

public class dynamicdizi {
    int dizi[];//Global değişken dışarda tanımla counsterda tanımla.
    //yapılandırıcıların içinde değer ataması yapılır.
    dynamicdizi(){
        dizi=null;
    }
    void ekle(int yeniElaman){
        //Diziye daha önce hiç birşey kaydedilmemişse
        if(dizi==null){
            dizi=new int[1];
            dizi[0]=yeniElaman;
        }
    }
}
