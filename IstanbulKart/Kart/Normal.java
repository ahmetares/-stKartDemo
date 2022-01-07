package IstanbulKart.Kart;

import IstanbulKart.Ulasim.Marmaray;
import IstanbulKart.Ulasim.Metro;
import IstanbulKart.Ulasim.Tren;

public class Normal extends İstanbulKart {
	final double MARMARAY_UCRET = 8.25;
	final double NORMAL_UCRET = 5.15;


	public Normal(String id, double bakiye) {
		super(id, bakiye);
		// TODO Auto-generated constructor stub
	}

	
	public void travel(Tren type,String durak) {
		if(type instanceof Metro && type.getDurak().contains(durak)) { 
			setBakiye(getBakiye()-NORMAL_UCRET);
		}
		if(type instanceof Marmaray && type.getDurak().contains(durak)) {
			setBakiye(getBakiye()-MARMARAY_UCRET);
			
		}
		getGecmis().add(durak);
		System.out.println(message(type));
	}
	
	
	public String message(Tren type) {
		String message= "Ödenen ücret: " ;
		if(type instanceof Metro)
			message+=NORMAL_UCRET;
		else if(type instanceof Marmaray)
			message+=MARMARAY_UCRET;
		
		message+=" Kalan Bakiye " + getBakiye();
		return message;
			
	}

}
