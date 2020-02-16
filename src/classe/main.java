package classe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fabricant f=new fabricant();
		f.SetCommande("C: 1 :0");
		f.SetSomme(0.3);	
		instruction i = new instruction();
		i.SetInstruction(f);
		

	}

}
