import Personnages.Commercant;
import Personnages.Humain;
import Personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof= new Humain("Prof","Kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson",12);
		prof.boire();
		prof.acheter("un jeu",2);
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco","DNF",1);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yakuLeNoir = new Yakuza("Yaku le Noir","Cidre",30,"warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
	}
}
