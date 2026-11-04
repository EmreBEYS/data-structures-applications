package week6;

public class recBagliListe {
    Eleman bas;
    recBagliListe(){
        bas=null;
    }
   void recBagliListeGezinme(){
        if(bas==null)
            return;
        //En az bir elaman varsa
       bas.recGezinme();
    }

    void recSonaEkle(Eleman yeni){
        if(bas==null) {
            bas = yeni;
            return;
        }
        //En az bir elaman varsa recursive olarak ekle.
        bas.recEkleme(yeni);
    }
    void recSondanSil() {
        // Liste boşsa
        if (bas == null) {
            System.out.println("Liste boş!");
            return;
        }

        // Listede tek eleman varsa
        if (bas.ileri == null) {
            bas = null;
            return;
        }

        // Birden fazla eleman varsa
        bas.recSondanSil();
    }

}
