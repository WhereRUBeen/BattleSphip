/**
 * 
 */
package modele;

/**
 * @author Been WhereU
 *
 */
public class Bateau {
	
	private String nom;
	private int taille;
	private int nFoisToucher;
	private int tabBateau[];
	private int tabtTestToucher[];
	private int x,y;

	public Bateau(String name,int grandeur) {
		this.nom = name;
		
	}
	
	
	
	/*** @return the nom*/
	public String getNom() {
		return nom;
	}



	/** * @return the taille */
	public int getTaille() {
		return taille;
	}
	
	public int testLocalisation(int localisation){
		/*
		 * Test si la position correspond au bateau et si il a deja ete touche au meme endroit
		 * si OUI, retourne True
		 * sinon retourne False
		 */
		for(int a=0; a < taille; a++){
			if (localisation == tabBateau[a]){
				for(int z = 0; z < taille; z++){
					if (localisation == tabtTestToucher[a]){ 
						a--;
						return 0;
					}
				}
				tabtTestToucher[a] = localisation;
				a++;
				return 2;
			}
		}
		return 1;
		
}

}
