package classe;


public class fabricant implements EmailNotifier {
	instruction i;
	double somme=0;
	String commande;
	double quantiteEau;
	double quantiteLait;
	
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
	
	public void SetQuantiteEau(double eau) {
		this.quantiteEau=eau;
	}
	
	public double GetQauntiteEau() {
		return this.quantiteEau;
	}
	
	public void SetQuantiteLait(double lait) {
		this.quantiteLait=lait;
	}
	
	public double GetQauntiteLait() {
		return this.quantiteLait;
	}
	
	public void ManqueMonnaie(double montant) {
		double manquant=montant-this.GetSomme();
		this.SetCommande("M: il manque "+String.valueOf(manquant)+" euros");
		i.SetInstruction(this);
	}

	@Override
	public void notifyMissingDrink(String drink) {
		// TODO Auto-generated method stub		
	}

}
