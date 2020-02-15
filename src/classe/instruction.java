package classe;

import org.mockito.Mockito.*;

public class instruction {
	public void Instruction(String commande) {
		String[] parts = commande.trim().split(":");
		String boisson = parts[0];
		String nbSucre = parts[1];
		
		if (boisson == "C") {
			this.Cafe();
		}
		else if (boisson == "T") {
			this.The();
		}
		else if (boisson == "H") {
			this.Chocolat();
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
