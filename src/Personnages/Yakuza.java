package Personnages;

public class Yakuza extends Humain {
	
	
	//attribut 
		private String clan;
		private int reputation=0;
		
	//constructor
	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	//methods
	public void trouverVictime() {
		parler("Tiens tiens tiens, ne serait pas un commercant qui traine par la ?");
		
		
	}
	public void extorquer(Commercant victime) {
		trouverVictime();
		parler(victime.getNom() + " si tu tiens à la vie, donne ton fric");
		reputation++;
		int argentVolé=victime.seFaireExtorquer();
		argent += argentVolé;
		parler("J'ai piqué " + argentVolé + " sous de " + victime.getNom() + " ce qui me fait "
				+ argent + " sous dans la poche. Ehehehe");
	}
}
