
package week6;

public class BagliListe {

	Eleman bas;
	// Eleman son;

	BagliListe() {
		bas = null;
		// son = null;
	}

	// Hazır eleman nesnesini başa ekle
	void basaEkle(Eleman yeni) {
		if (yeni == null) return;

		if (bas == null) {
			yeni.ileri = null;
			bas = yeni;
			System.out.println("bu ilk eleman");
			return;
		}

		yeni.ileri = bas;
		bas = yeni;
	}

	// Verilen bilgilerle yeni eleman oluştur ve başa ekle
	void basaEkle(String isim, String soyisim, int telNo) {

		Eleman yeni = new Eleman(isim, soyisim, telNo);
		basaEkle(yeni);
	}

	// Listeyi yazdır
	void yazdir() {
		Eleman gezici = bas;

		if (bas == null) {
			System.out.println("Liste boş!");
			return;
		}

		while (gezici != null) {
			System.out.println(
					"İsim : " + gezici.isim +
							" Soy İsim : " + gezici.soyisim +
							" Tel No : " + gezici.telNo
			);

			gezici = gezici.ileri;
		}
	}

	// Hazır elemanı sona ekle
	void sonaEkle(Eleman yeni) {
		if (yeni == null) return;

		Eleman gezici = bas;

		if (bas == null) {
			yeni.ileri = null;
			bas = yeni;
			return;
		}

		while (gezici.ileri != null) {
			gezici = gezici.ileri;
		}

		System.out.println("son eleman : " + gezici.isim);

		yeni.ileri = null;
		gezici.ileri = yeni;
	}

	// ÖDEV 1: Bilgilerle sona eleman ekle
	void sonaEkle(String isim, String soyisim, int telNo) {

		Eleman yeni = new Eleman(isim, soyisim, telNo);
		sonaEkle(yeni);
	}

	// ÖDEV 2: Aranan elemanın arkasına ekle
	void arayaEkle(Eleman aranan, Eleman yeni) {

		if (aranan == null || yeni == null) {
			System.out.println("Geçersiz eleman!");
			return;
		}

		Eleman gezici = bas;

		while (gezici != null) {

			if (gezici == aranan) {
				yeni.ileri = gezici.ileri;
				gezici.ileri = yeni;
				return;
			}

			gezici = gezici.ileri;
		}

		System.out.println("Aranan eleman bulunamadı!");
	}

	// ÖDEV 3: Verilen sıradaki elemanın arkasına ekle
	// Sıra numarası 1'den başlar
	void arayaEkle(int siraNo, Eleman yeni) {

		if (siraNo < 1 || yeni == null) {
			System.out.println("Geçersiz sıra numarası veya eleman!");
			return;
		}

		Eleman gezici = bas;
		int sayac = 1;

		while (gezici != null) {

			if (sayac == siraNo) {
				yeni.ileri = gezici.ileri;
				gezici.ileri = yeni;
				return;
			}

			gezici = gezici.ileri;
			sayac++;
		}

		System.out.println("Belirtilen sıra bulunamadı!");
	}

	// Baştan eleman sil
	void bastanSil() {

		if (bas == null) {
			System.out.println(
					"Liste boş olduğu için silme yapılamaz!"
			);
			return;
		}

		bas = bas.ileri;
	}

	// Sondan eleman sil
	void sondansil() {

		Eleman gezici = bas;
		Eleman sonOnceki = null;

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

		// Son elemanı bul
		while (gezici.ileri != null) {
			sonOnceki = gezici;
			gezici = gezici.ileri;
		}

		// Sondan bir önceki elemanın bağlantısını kopar
		sonOnceki.ileri = null;
	}

	// ÖDEV 4: Sıra numarasına göre eleman sil
	// Sıra numarası 1'den başlar
	void aradanSil(int siraNo) {

		if (bas == null) {
			System.out.println("Liste boş!");
			return;
		}

		if (siraNo < 1) {
			System.out.println("Geçersiz sıra numarası!");
			return;
		}

		if (siraNo == 1) {
			bastanSil();
			return;
		}

		Eleman gezici = bas;
		int sayac = 1;

		while (gezici != null && sayac < siraNo - 1) {
			gezici = gezici.ileri;
			sayac++;
		}

		if (gezici == null || gezici.ileri == null) {
			System.out.println("Silinecek eleman bulunamadı!");
			return;
		}

		gezici.ileri = gezici.ileri.ileri;
	}

	// ÖDEV 5: İsme göre ilk eşleşen elemanı sil
	void aradanSil(String isim) {

		if (bas == null) {
			System.out.println("Liste boş!");
			return;
		}

		// İlk eleman aranıyorsa
		if (bas.isim.equals(isim)) {
			bastanSil();
			return;
		}

		Eleman gezici = bas;

		while (gezici.ileri != null) {

			if (gezici.ileri.isim.equals(isim)) {
				gezici.ileri = gezici.ileri.ileri;
				return;
			}

			gezici = gezici.ileri;
		}

		System.out.println("Aranan " + isim + " bulunamadı!");
	}

	// İlk eşleşen elemanı ara
	Eleman arama(String isim) {

		Eleman gezici = bas;

		while (gezici != null) {

			if (gezici.isim.equals(isim)) {
				return gezici;
			}

			gezici = gezici.ileri;
		}

		System.out.println("Aranan " + isim + " bulunamadı!");
		return null;
	}

	// ÖDEV 6: İsim ve soyisim ile ara
	Eleman arama(String isim, String soyisim) {

		Eleman gezici = bas;

		while (gezici != null) {

			if (gezici.isim.equals(isim) &&
					gezici.soyisim.equals(soyisim)) {
				return gezici;
			}

			gezici = gezici.ileri;
		}

		System.out.println("Aranan kişi bulunamadı!");
		return null;
	}

	// Aynı isimdeki bütün elemanları ara
	// Eski ikinci arama(String isim) metodu
	// Derleme hatası olmaması için isim değiştirildi
	Eleman[] tumunuAra(String isim) {

		Eleman gezici = bas;
		int sayac = 0;

		// Önce eşleşen eleman sayısını bul
		while (gezici != null) {

			if (gezici.isim.equals(isim)) {
				sayac++;
			}

			gezici = gezici.ileri;
		}

		// Tam gereken büyüklükte dizi oluştur
		Eleman[] dizi = new Eleman[sayac];

		gezici = bas;
		int diziIndex = 0;

		while (gezici != null) {

			if (gezici.isim.equals(isim)) {
				dizi[diziIndex++] = gezici;
			}

			gezici = gezici.ileri;
		}

		return dizi;
	}
	 // void Eleman[ ] sorgulama(){ ODEV}

	//oluştururaln bağlı listenin kopyalanması



}
