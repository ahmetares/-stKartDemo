package IstanbulKart.Ulasim;

public class Metro extends Tren {
	
	
	public Metro() {
		duraklar();
	}
	
	@Override
	public void duraklar() {
		addDurak("Menderes");addDurak("Otogar"); addDurak("Kocatepe");addDurak("Sağmalcılar");
		addDurak("Topkapı");addDurak("Aksaray");addDurak("Yenikapı");
	}

}
