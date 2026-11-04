package week6;

public class AnaSinif {

	public static void main(String[] args) {


		Eleman e1=new Eleman("Ahmet", "Kader", 12345);
		Eleman e2=new Eleman("Mehmet", "Yol", 988766);
		Eleman e3=new Eleman("Veysel", "Kaldı", 98321);
		Eleman e4=new Eleman("Emre", "Kaldı", 983215);
		Eleman e5=new Eleman("Hatice", "Kaldı", 983231);

		BagliListe bl=new BagliListe();
		
		bl.basaEkle(e1);
		bl.basaEkle(e2);
		bl.basaEkle("Hatice", "Kaya", 34567);
		
		
		bl.sonaEkle(e3);
		bl.yazdir();

		/*
		System.out.println("*******************");
		bl.bastanSil();
		bl.yazdir();
		System.out.println("*******************");
		bl.bastanSil();
		bl.yazdir();

		System.out.println("*******************");
		bl.sondansil();
		bl.yazdir();
		*/

		System.out.println(bl.arama("Hatice").isim);
		System.out.println(bl.arama("Emre"));

		// Aynı isimdeki tüm elemanları ara
		Eleman[] sonuclar = bl.tumunuAra("Hatice");
		System.out.println("\nHatice isimli kişi sayısı: " + sonuclar.length);


	}

}
