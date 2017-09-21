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



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated m
		System.out.println("lo");

	}

}
