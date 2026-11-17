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
	public void provoquerDuel(Yakuza yaku) {
		int force = 2 * honneur;
		parler("Je t'ai trouvé vermine, tu vas payer pour ce que tu as fait");
		if (force >= yaku.getReputation()) {
			parler("Je t'ai eu malfrat !");
			argent += yaku.perdre();
			honneur++;
		}
		else {
			yaku.gagner(argent);
			parler("Tu as été plus fort aujourd'hui...");
			honneur--;
			argent=0;
		}
	}
}
