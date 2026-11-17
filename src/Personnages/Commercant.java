package Personnages;

public class Commercant extends Humain {

	
	//constructor
		public Commercant(String nom, String boisson, int argent) {
		super(nom, "thé", argent);
		}

//solution choisie : passer argent en protected 
		
	//method
	private void sePlaindre() {
		parler("J'ai tout perdu. Le monde est vraiment trop injuste.");
	}
	private void remercier(String texte) {
		parler(texte + "Je vous remerice beaucoup beaucoup maître ronin, je vous remercie acec déférence.");
	}
	public int seFaireExtorquer() {
		int temp = argent;
		argent = 0;
		sePlaindre();
		return temp;
	}
	public void recevoir(int argentDonné) {
		argent+=argentDonné;
		remercier(argentDonné + " sous ?!");
	}
}
