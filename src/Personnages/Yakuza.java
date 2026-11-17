package Personnages;

public class Yakuza extends Humain {
	
	
	//attribut 
		private String clan;
		private int reputation=4;
		
	//constructor
	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	//getters
	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}


	//methods
	public void trouverVictime() {
		parler("Tiens tiens tiens, ne serait pas un commercant qui traine par la ?");
		
		
	}
	public void extorquer(Commercant victime) {
		trouverVictime();
		parler(victime.getNom() + " si tu tiens à la vie, donne ton fric");
		reputation++;
		int argentVole=victime.seFaireExtorquer();
		argent += argentVole;
		parler("J'ai piqué " + argentVole + " sous de " + victime.getNom() + " ce qui me fait "
				+ argent + " sous dans la poche. Ehehehe");
	}
	public int perdre() {
		reputation--;
		int argentPerdu=argent;
		argent=0;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous. J'ai déshonoré le clan " + clan);;
		return argentPerdu;
	}
	public int gagner(int gain) {
		reputation++;
		argent+=gain;
		parler("J'ai gagné grosse merde, merci pour les " + gain + " sous");
		return reputation;
	}
}
