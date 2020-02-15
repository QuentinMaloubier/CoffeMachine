package classe;

import org.mockito.Mockito.*;

public class instruction {
	
	public instruction() {}
	
	public void SetInstruction(fabricant f) {
		String commande= f.GetCommande();
		double montant = f.GetSomme();
		String[] parts = commande.trim().split(":");
		String boisson = parts[0];
		String nbSucre = parts[1];
		
		if (boisson == "C") {
			if(montant >= 0.6) {
				this.Cafe();
			}
			else {
				f.ManqueMonnaie(0.6);
			}
		}
		else if (boisson == "T") {
			if(montant >= 0.4) {
				this.The();
			}
			else {
				f.ManqueMonnaie(0.4);
			}
		}
		else if (boisson == "H") {
			if(montant >= 0.5) {
				this.Chocolat();
			}
			else {
				f.ManqueMonnaie(0.5);
			}
		}
		else if (boisson == "M"){
			this.Message(nbSucre);
		}
		
		if (nbSucre == "1") {
			this.AddSucre(1);
			this.AddBaton();
		}
		else if (nbSucre == "2") {
			this.AddSucre(2);
			this.AddBaton();
		}
	}
	
	public void Cafe() {
		//code pour faire un café
	}
	
	public void The() {
		//code pour faire un thé
	}
	
	public void Chocolat() {
		//code pour faire un chocolat
	}
	
	public void Message(String message) {
		//affiche le message
	}
	
	public void AddSucre(int nb) {
		//ajoute du sucre
	}
	
	public void AddBaton() {
		//ajoute la touillette
	}
}
