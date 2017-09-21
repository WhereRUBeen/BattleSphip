/**
 * 
 */
package modele;

/**
 * @author Been WhereU
 *
 */
public class Gameur {
	
	private String Nom;
	private int Score;
	
	
	
	public Gameur(String name){
		this.Nom = name;
		this.Score = 0;
	}
	

	
	public String getNom() {
		return Nom;
	}



	//Ajout de points au score
	public void ajouterPoint(int sc){
		this.Score += sc;
	}
	
	//Retire des points au score
	public void retirerPoint(int sc){
		this.Score -= sc;
	}
	

	public int getScore() {
		return Score;
	}


}
