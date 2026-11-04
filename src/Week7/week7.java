package Week7;


public class week7 {

    static void recDiziElemanEkle(){}//Ödev
    static int recDiziArama(int dizi[],int aranan,int i){
        if(i==dizi.length)
            return -1;
        if(dizi[i]==aranan)
            return i;
        i++;
         return recDiziArama(dizi, aranan,i);
    }

    static void recDiziGezinme(int dizi[],int i){
        //Recursive fonksiyonun dönüş(bitiş şartı)
        if(i==dizi.length)
            return;
        //Dizinin elamanlarını ekrana yazdır
        System.out.println(i+". dizinin elamanı "+ dizi[i]);
        i++;
        recDiziGezinme(dizi,i);
    }

    public static void main(String[] args){
        int d[]={1,2,3,4,5,6,8,9};
        recDiziGezinme(d,0);
       System.out.println ("Aranan elamanın indexi :"+recDiziArama(d,5,0));
        System.out.println ("Aranan elamanın indexi :"+recDiziArama(d,98,0));

    }
}
