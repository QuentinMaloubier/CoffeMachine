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
		var monnaie = this.GetSomme();
		
		if (boisson == "C") {
			if(montant >= 0.6) {
				this.Cafe();
			}
			else {
				this.ManqueMonnaie(0.6);
			}
		}
		else if (boisson == "T") {
			if(montant >= 0.4) {
				this.Cafe();
			}
			else {
				this.ManqueMonnaie(0.4);
			}
		}
		else if (boisson == "H") {
			if(montant >= 0.5) {
				this.Cafe();
			}
			else {
				this.ManqueMonnaie(0.5);
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

	function Cafe() {
		//code pour faire un café
	}
		
	function The() {
		//code pour faire un thé
	}
		
	function Chocolat() {
		//code pour faire un chocolat
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