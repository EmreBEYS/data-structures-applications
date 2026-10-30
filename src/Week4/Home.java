package Week4;

public class Home {
    String ad;
    String soyad;
    int daireNo;
    int blockNo;
    boolean dolumu; //Global bölge

    //Yapılandırıcı yazılması gerkiyor.
    Home(){ //Yerelde tanımlı yerel değişken
        this.dolumu=false;
    }

    void sakinekle(String ad,String soyad,int daireNo,int blockNo){
        this.ad=ad;
        this.soyad=soyad;
        this.daireNo=daireNo;
        this.blockNo=blockNo;
        dolumu=true;
    }
    void sakinsil(int  daireNo,int blockNo){
        //Sakin arama yap sonra sil
        this.ad=null;
        this.soyad=null;
        dolumu=false;
    }
    void daireozelikleriyazdir(){
        System.out.println(" adı: "+ad+" "+" soyadi: "+soyad +" "+"Daireno: "+daireNo +" "+"Block No: "+blockNo);
    }

}
