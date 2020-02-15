package classe;

import classe.instruction;
public class fabricant {
	instruction i;
	double somme=0;
	String commande;
	
	public fabricant() {}
	
	public void SetSomme(double somme) {
		this.somme=somme;
	}
	
	public double GetSomme() {
		return this.somme;
	}
	
	public void SetCommande(String commande) {
		this.commande=commande;
	}
	
	public String GetCommande() {
		return this.commande;
	}
	
	public void ManqueMonnaie(double montant) {
		double manquant=montant-this.GetSomme();
		this.SetCommande("M: il manque "+String.valueOf(manquant)+" euros");
		i.SetInstruction(this);
	}

}
