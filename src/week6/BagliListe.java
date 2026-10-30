package week6;

public class BagliListe {
	
	Eleman bas;
	//Eleman son;
	
	BagliListe(){
		bas=null;
		//son=null;
	}
	//hazır eleman nesnesi veririm bunu ekle
	void basaEkle(Eleman yeni) {
		//ilk eleman ekleme
		if(bas==null) {
			bas=yeni;
			System.out.println("bu ilk eleman");
			return;
		}
		//yeni eleman ilk eleman değilse
		yeni.ileri=bas;
		bas=yeni;
	}
	
	// sana elemanını özelliklerini veririm bunu yeni bir eleman olarak oluştur ve bunu ekle
	void basaEkle(String isim, String soyisim, int telNo) {
		
		Eleman yeni=new Eleman(isim, soyisim, telNo);
		
		if(bas==null) {
			bas=yeni;
			System.out.println("bu ilk eleman");
			return;
		}
		
		//yeni eleman ilk eleman değilse
		yeni.ileri=bas;
		bas=yeni;
		
	}
	//<>
	void yazdir() {
		Eleman gezici=bas;
		
		while(gezici!=null) {
			System.out.println("İsim : " +gezici.isim +" Soy İsim : " +gezici.soyisim +" Tel No : " +gezici.telNo);
			
			gezici = gezici.ileri;
			
		}
	}
	
	void sonaEkle(Eleman yeni) {
		Eleman gezici=bas;
		Eleman son=bas;
			
		//ilk eleman ekleme
		if(bas==null) {
			bas=yeni;
			return;
		}
		// yeni ilk eleman değilse
		while(gezici!=null) {
			//System.out.println("İsim : " +gezici.isim +" Soy İsim : " +gezici.soyisim +" Tel No : " +gezici.telNo);
			
			son=gezici;
			gezici = gezici.ileri;
			
		}
		System.out.println("son eleman : " +son.isim);
		//yeni eleman sona eklenmiş olacak
		son.ileri=yeni;
	}
	
	void sonaEkle(String isim, String soyisim, int telNo) {
		// siz ödev
	}
	//listede olan aranan Elemanın arkasına yeni elemanı eklyecek 
	void arayaEkle(Eleman aranan, Eleman yeni) {
		//siz ödev
	}
	//verilen sıranodaki elamanın ilerisine yeni elemanı ekleyecek
	void arayaEkle(int sıraNo, Eleman yeni) {
		//siz ödev
	}
	void bastanSil() {
		
		if(bas==null) {
			System.out.println("liste boş olduğu için silme yapılamaz ! ");
			return;
		}
		//listede en az bir eleman vardır.
		
		bas=bas.ileri;
	}

	void sondansil(){
		Eleman gezici=bas;
		Eleman sonOnceki=bas;

		//Hiç elaman yoksa
		if(bas==null) {
			return;
		}
		// Eğer elaman varsa bir son elaman var ve onu ara
		while(gezici.ileri!=null) {
			sonOnceki=gezici;
			gezici = gezici.ileri;

		}
		// System.out.println("Sondan bir önceki eleman: "+sonOnceki.isim);
		sonOnceki.ileri=null; //Son elmanı silmek için önceki elamanın ilersini null yapıp refarasnsız bırakılmıştır.
	}
	void aradanSil(){
		//Ödev
		/*  Sıra numarasına göre silme
			Belirli bir özelikten sonrasında silme.
		 */
	}
	Eleman arama(String isim){
		Eleman gezici=bas;
		//Hiç elaman yoksa çıktısın diye knulmuştur
		if(bas==null){
			return null;
		}
		while(gezici!=null) {
			if(gezici.isim==isim){
				return gezici;
			}
			gezici = gezici.ileri;

		}
		//Aranan değer bulunamadığı için null döndürür.
		System.out.println("Aranan "+isim+ " bulunamadı");
		return null;
	}
}
