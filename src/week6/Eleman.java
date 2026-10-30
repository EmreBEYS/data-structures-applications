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
}
