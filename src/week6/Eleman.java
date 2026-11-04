package week6;

public class Eleman {
	
	String isim;
	String soyisim;
	int telNo;
	//kendinden sonraki Eleman nesnesine bağlaancak referans
	Eleman ileri;
	
	//overload işlemi
	Eleman(String isim, String soyisim, int telNo){
		this.isim=isim;
		this.soyisim=soyisim;
		this.telNo=telNo;
		
		ileri=null;
		
		
	}

	Eleman(){
		isim=null;
		soyisim=null;
		telNo=0;
		
		ileri=null;
		//System.out.println("parametresiz yapılandırıcı");
		
	}
	void recGezinme(){
		System.out.println(isim +" "+ soyisim +"  " + telNo);
		//Eğer kendinden sonra gelen elman yoksa gezinmeyi bitir.
		if(ileri==null)
			return;
		ileri.recGezinme();
		//Dönüşler başlar
	}
	//Sona ekleme
	void recEkleme(Eleman yeni){
		//Her elaman nesnesi kendi arkasındaki yeir kontrol eder boşa ekleer boş değilse devreder
		//Kendisinden sonraki boş
		if(ileri==null){
			//Kendini yeni elamanla bağla
			ileri=yeni;
			return;
		}
		//Kendisinden sonraki doluysa
		ileri.recEkleme(yeni);
	}

	void recSondanSil() {
		// Bir sonraki eleman son eleman ise
		if (ileri.ileri == null) {
			ileri = null;
			return;
		}

		// Son elemana henüz ulaşılmadıysa
		ileri.recSondanSil();
	}
}
