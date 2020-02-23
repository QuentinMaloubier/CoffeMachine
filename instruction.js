function instruction(commande){
	var res = commande.split(":");
	var boisson = res[0];
	var nbSucre = res[1];
	
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