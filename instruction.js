class Machine {
	var somme;
	var commande;
	constructor(somme,commande){
		this.somme= somme;
		this.commande = commande;
	}
	
	function SetSomme(somme){
		this.somme= somme;
	}
	function GetSomme () {
		return this.somme;
	}
	
	function SetCommande(commande){
		this.commande= commande;
	}
	function GetCommande () {
		return this.commande;
	}
	
	function instruction(commande){
		var res = commande.split(":");
		var boisson = res[0];
		var nbSucre = res[1];
		var chaud =false;
		var monnaie = this.GetSomme();

		if (boisson == "C") {
			if(montant >= 0.6) {
				if (boisson.includes("h")) {
					chaud =true;
				}
				this.Cafe(chaud);
			}
			else {
				this.ManqueMonnaie(0.6);
			}
		}
		else if (boisson == "T") {
			if(montant >= 0.4) {
				if (boisson.includes("h")) {
					chaud =true;
				}
				this.The(chaud);
			}
			else {
				this.ManqueMonnaie(0.4);
			}
		}
		else if (boisson == "H") {
			if(montant >= 0.5) {
				if (boisson.includes("h")) {
					chaud =true;
				}
				this.Cafe(chaud);
			}
			else {
				this.ManqueMonnaie(0.5);
			}
		}
		else if (boisson == "O") {
			if(montant >= 0.6) {
				this.JusOrange();
			}
			else {
				this.ManqueMonnaie(0.6);
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

	function Cafe(chaud) {
		if (chaud == true) {
			//code pour faire un café très chaud
		}
		else {
			//code pour faire un café
		}
	}
		
	function The(chaud) {
		if (chaud == true) {
			//code pour faire un thé très chaud
		}
		else {
			//code pour faire un thé
		}
	}
		
	function Chocolat(chaud) {
		if (chaud == true) {
			//code pour faire un chocolat très chaud
		}
		else {
			//code pour faire un chocolat
		}
	}
	
	function JusOrange() {
		//code pour faire un jus d'orange
	}

	function Message(message) {
		console.log(message);
	}

	function AddSucre(i){
		//Ajoute i sucre dans la noisson
	}

	function AddBaton(){
		//Ajoute une touillette
	}
	
	function ManqueMonnaie(montant) {
		var manquant=montant-this.GetSomme();
		this.SetCommande("M: il manque "+manquant+" euros");
		this.instruction(this.GetCommande());
	}
}