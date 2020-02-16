package classe;

import org.mockito.Mockito.*;

public class instruction implements BeverageQuantityChecker{
	
	int nbCafe=0;
	int nbThe=0;
	int nbChocolat=0;
	int nbJusOrange=0;
	public instruction() {}
	fabricant f;
	
	public void SetInstruction(fabricant f) {
		String commande= f.GetCommande();
		double montant = f.GetSomme();
		boolean chaud =false;
		String[] parts = commande.trim().split(":");
		String boisson = parts[0];
		String nbSucre = parts[1];
		
		if (boisson.contains("C") == true) {
			if (isEmpty("C")==false) {
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
		}
		else if (boisson.contains("T") == true) {
			if (isEmpty("T")==false) {
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
		}
		else if (boisson.contains("H") == true) {
			if (isEmpty("H")==false) {
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
		this.nbCafe=this.nbCafe+1;
	}
	
	public void The(boolean chaud) {
		if (chaud == true) {
			//code pour faire un thé très chaud
		}
		else {
			//code pour faire un thé
		}
		this.nbThe=this.nbThe+1;
	}
	
	public void Chocolat(boolean chaud) {
		//code pour faire un chocolat 
		if (chaud == true) {
			this.Chocolat(false);
		}
		this.nbChocolat=this.nbChocolat+1;
	}
	
	public void JusOrange() {
		//code pour faire un jus d'orange
		this.nbJusOrange=this.nbJusOrange+1;
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
	
	public double Rapport() {
		double ChiffreAffaire=(this.nbCafe*0.6)+(this.nbThe*0.4)+(this.nbChocolat*0.5)+(this.nbJusOrange*0.6);
		System.out.println("nombre de café vendu: "+String.valueOf(nbCafe)+"\n");
		System.out.println("nombre de thé vendu: "+String.valueOf(nbThe)+"\n");
		System.out.println("nombre de chocolat vendu: "+String.valueOf(nbChocolat)+"\n");
		System.out.println("nombre de jus d'orange vendu: "+String.valueOf(nbJusOrange)+"\n");
		System.out.println("Chiffre d'affaire total: "+String.valueOf(ChiffreAffaire));
		return ChiffreAffaire;
	}

	@Override
	public boolean isEmpty(String drink) {
		if (f.GetQauntiteEau()== 0 || f.GetQauntiteLait()==0) {
			f.notifyMissingDrink(drink);
			f.SetCommande("M : Cette boisson est en pénurie");
			this.SetInstruction(f);
			return true;
		}
		else {
			return false;
		}
	}
}
