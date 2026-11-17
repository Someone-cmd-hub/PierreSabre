package Personnages;

public class Humain {
	//attribut
			private String nom;
			private String boisson;
			private int argent;
			
	//constructor	
			public Humain(String nom, String boisson, int argent) {
				this.nom = nom;
				this.boisson = boisson;
				this.argent = argent;
	}
			
	//getter
			public String getNom() {
				return nom;
			}

			public int getArgent() {
				return argent;
			}
			
			
			
	//methods
			private void parler(String texte) {
				System.out.println( "(" + nom + ") - " + texte);
			}
			public void acheter(String bien,int prix) {
				if (prix>argent) {
					parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offir un "
							+ bien + " à "+ prix+ " sous.");
				}
				else {
					parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " +
						bien + " à " + prix + " sous.");
					perdreArgent(prix);
				}
			}
			public void direBonjour() {
				parler("Bonjour, je m'appelle " + nom + " et j'aime boire du "+ boisson +".");
			}
			public void boire() {
				parler("Mmmmm, un bon verre de " + boisson + " ! GLOUPS !");
			}
			private void gagnerArgent(int gain) {
				argent += gain;
			}
			private void perdreArgent(int perte) {
				argent -= perte;
			}
			
}
