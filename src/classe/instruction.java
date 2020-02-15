package classe;

import org.mockito.Mockito.*;

public class instruction {
	
	public instruction() {}
	
	public void SetInstruction(fabricant f) {
		String commande= f.GetCommande();
		double montant = f.GetSomme();
		boolean chaud =false;
		String[] parts = commande.trim().split(":");
		String boisson = parts[0];
		String nbSucre = parts[1];
		
		if (boisson.contains("C") == true) {
			if(montant >= 0.6) {
				if (boisson.contains("h")) {
					chaud =true;
				}
				this.Cafe(chaud);
			}
			else {
				f.ManqueMonnaie(0.6);
			}
		}
		else if (boisson.contains("T") == true) {
			if(montant >= 0.4) {
				if (boisson.contains("h")) {
					chaud =true;
				}
				this.The(chaud);
			}
			else {
				f.ManqueMonnaie(0.4);
			}
		}
		else if (boisson.contains("H") == true) {
			if(montant >= 0.5) {
				if (boisson.contains("h")) {
					chaud =true;
				}
				this.Chocolat(chaud);
			}
			else {
				f.ManqueMonnaie(0.5);
			}
		}
		else if (boisson == "M"){
			this.Message(nbSucre);
		}
		else if (boisson == "O") {
			if(montant >= 0.6) {
				this.JusOrange();
			}
			else {
				f.ManqueMonnaie(0.6);
			}
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
	
	public void Cafe(boolean chaud) {
		if (chaud == true) {
			//code pour faire un café très chaud
		}
		else {
			//code pour faire un café
		}
	}
	
	public void The(boolean chaud) {
		if (chaud == true) {
			//code pour faire un thé très chaud
		}
		else {
			//code pour faire un thé
		}
	}
	
	public void Chocolat(boolean chaud) {
		//code pour faire un chocolat 
		if (chaud == true) {
			this.Chocolat(false);
		}
	}
	
	public void JusOrange() {
		//code pour faire un jus d'orange
	}
	
	public void Message(String message) {
		//affiche le message
		System.out.println(message);
	}
	
	public void AddSucre(int nb) {
		//ajoute du sucre
	}
	
	public void AddBaton() {
		//ajoute la touillette
	}
}
