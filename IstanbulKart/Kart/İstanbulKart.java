package IstanbulKart.Kart;

import java.util.ArrayList;

import IstanbulKart.Ulasim.Marmaray;
import IstanbulKart.Ulasim.Tren;



public abstract class İstanbulKart {
	private String id;
	private double bakiye;
	ArrayList<String> gecmis = new ArrayList<>(); //(travel de kullandık)

	
	
	public İstanbulKart(String id, double bakiye) {
		this.id = id;
		this.bakiye = bakiye;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getBakiye() {
		return bakiye;
	}


	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public ArrayList<String> getGecmis() {
		return gecmis;
	}

    public void setGecmis(ArrayList<String> gecmis) {
		this.gecmis = gecmis;
	}
    
    
    
	public abstract void travel(Tren type,String durak);  //ogrenci icin farklı, normal ıcın farklı tarıfe



	
	public void deposit(int amount) {
		setBakiye(getBakiye()+amount);
		System.out.println("Bakiye yüklediniz. Eski Bakiye: " + (getBakiye()-amount) + " Yeni Bakiye: " + getBakiye());
	}
	
	
	public void iadeVeYolculuk(Tren tren,String inilenDurak) {
		if(getGecmis().size()==1) {  //guvenlık icin
		
		gecmis.add(inilenDurak);	
		
		String inis = getGecmis().get(1); 
		
		String binis = getGecmis().get(0); 
		
		if(tren instanceof Marmaray) {  //iade normal metroda yok
		
		int value = (tren.getDurak().indexOf(inis)+1) - (tren.getDurak().indexOf(binis)+1);
		//binilen ve inilen durak arasındaki fark
		
		
		if(value==1 || value==-1) {
			setBakiye(getBakiye()+3);
			System.out.println("İade aldınız. Eski Bakiye : " + (getBakiye()-3) + " Yeni Bakiye : " + getBakiye());
		}
		if(value==2 || value==-2) {
			setBakiye(getBakiye()+2.5);
			System.out.println("İade aldınız. Eski Bakiye : " + (getBakiye()-2.5) + " Yeni Bakiye : " + getBakiye());
		}
		if(value==3 || value==-3) {
			setBakiye(getBakiye()+2);
			System.out.println("İade aldınız. Eski Bakiye : " + (getBakiye()-2) + " Yeni Bakiye : " + getBakiye());
		}
		if(value>3 || value<-3) {
			setBakiye(getBakiye()+1.25);
			System.out.println("İade aldınız. Eski Bakiye : " + (getBakiye()-1.25) + " Yeni Bakiye : " + getBakiye());
		}
		}
	
		
		System.out.println("Yolculugun: ");
		
		tren.yolculuk(tren, binis, inis);
		
		System.out.println("***"); 
		
		getGecmis().clear();   //tekrar iade alınmasını engellemek için iadeden sonra gecmisi 0 la 
		
		}
	}
	
	
	
	
	

	
	
	
}

