package week6;

public class mainweek7 {

    public static void main(String[] args){
        recBagliListe rb1 = new recBagliListe();

        Eleman e1 = new Eleman("Ahmet", "Kader", 12345);
        Eleman e2 = new Eleman("Mehmet", "Yol", 988766);
        Eleman e3 = new Eleman("Veysel", "Kaldı", 98321);

        rb1.recSonaEkle(e1);
        rb1.recSonaEkle(e2);
        rb1.recSonaEkle(e3);

        System.out.println("İlk liste:");
        rb1.recBagliListeGezinme();

        rb1.recSondanSil();

        System.out.println("Sondan silme sonrası:");
        rb1.recBagliListeGezinme();

    }
}
