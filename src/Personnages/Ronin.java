package Personnages;

public class Ronin extends Humain{
	
	//attribut
	private int honneur=1;

	//constructor
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	//methods
	public void donner(Commercant beneficiaire) {
		if (argent>0) {
			float argentDonné= (float) (0.1 * argent);
			parler(beneficiaire.getNom() + " prends ces " + argentDonné + " sous.");
			beneficiaire.recevoir((int)(argentDonné));
			argent-=argentDonné;
			honneur++;
		}
	}
}
