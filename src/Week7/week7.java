package Week7;

import Week2.DiziIslemler;

public class week7 {
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

    }
}
