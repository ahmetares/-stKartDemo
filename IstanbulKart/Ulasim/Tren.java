package IstanbulKart.Ulasim;

import java.util.ArrayList;

public abstract class Tren {
	
	private ArrayList<String> durak = new ArrayList<>();
	
	
	public Tren() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<String> getDurak() {
		return durak;
	}
	
	public void setDurak(ArrayList<String> durak) {
		this.durak = durak;
	}
	
	public void addDurak(String newDurak) {
		durak.add(newDurak);
	}
	
	public abstract void duraklar();
	
	public void yolculuk(Tren tren,String binis,String inis) {
		if(durak.indexOf(binis)<durak.indexOf(inis)) {
		for (int i = durak.indexOf(binis); i <= durak.indexOf(inis); i++) {
			System.out.print(durak.get(i)+"  ");
		}
		}
		else {
			for (int i = durak.indexOf(binis); i >= durak.indexOf(inis); i--) {
				System.out.print(durak.get(i)+"  ");
			}
		}
		
		System.out.println();
		
	}
	

}
