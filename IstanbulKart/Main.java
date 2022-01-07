package IstanbulKart;


import IstanbulKart.Kart.Ogrenci;
import IstanbulKart.Ulasim.Marmaray;
import IstanbulKart.Ulasim.Metro;
import IstanbulKart.Ulasim.Tren;

public class Main {

	public static void main(String[] args) {
		Metro metro = new Metro(); 
		Marmaray marmaray = new Marmaray(); 
				
		//BENİM YOLCULUK
		
		Tren benimYolculuk [] = {metro,marmaray}; 
		
		Ogrenci ahmet = new Ogrenci("2",0);
		
		ahmet.deposit(20);
		
		//evden cıkıs metro
		ahmet.travel(benimYolculuk[0], "Menderes");
		ahmet.iadeVeYolculuk(benimYolculuk[0],"Yenikapı");
		//Marmaraya geçiş
		ahmet.travel(benimYolculuk[1], "Yenikapı");
		ahmet.iadeVeYolculuk(benimYolculuk[1], "Üsküdar");
		
		
		//eve donus marmaray
		ahmet.travel(benimYolculuk[1], "Üsküdar");
		ahmet.iadeVeYolculuk(benimYolculuk[1], "Yenikapı");
		//metro
		ahmet.travel(benimYolculuk[0], "Yenikapı");
		ahmet.iadeVeYolculuk(benimYolculuk[0],"Menderes");
		
		


	}

}
