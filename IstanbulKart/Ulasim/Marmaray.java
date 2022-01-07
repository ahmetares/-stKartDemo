package IstanbulKart.Ulasim;


public class Marmaray extends Tren {
	
	public Marmaray() {
		duraklar();
	}
	
	@Override
	public void duraklar() {

		addDurak("Yenikapı");addDurak("Sirkeci");addDurak("Üsküdar");addDurak("AyrılıkÇeşmesi");
		addDurak("FenerYolu");addDurak("Suadiye");addDurak("Göztepe");addDurak("Küçükyalı");

	}

}
