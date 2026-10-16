package Week2;

public class DiziIslemler {

    int dizi[];
    int isaretci;

    public DiziIslemler(int n) {
        dizi = new int[n];
        isaretci = n - 1;
    }

    public void ekle(int yeniEleman) {

        if (isaretci < 0) {
            System.out.println("Dizi dolu!");
            return;
        }

        dizi[isaretci] = yeniEleman;
        isaretci--;
    }

    void yazdir() {

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i + ". eleman: " + dizi[i]);
        }
    }

    int silme() {
        if (isaretci == dizi.length - 1) {
            //Eğer dizi boşsa silme yapmadan çıksın.
            return -1;
        }
        //Bir sayi silindi.
        isaretci++;
        return dizi[isaretci];
    }
   int ara(int arananDeger){
        for (int i=isaretci+1;i<dizi.length;i++){
            if(dizi[i]==arananDeger){
                return i;
            }
        }
        //Aranan eleman bulunamadı.
       System.out.println("Aranan eleman bulunamadı.");
        return -1;
   }
}