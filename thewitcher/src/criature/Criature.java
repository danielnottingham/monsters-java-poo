package criature;

public abstract class Criature {
	
	protected String classe;
	protected int defesa;
	protected int ataque;
	protected int energia;
	protected String terreno;
	
	public Criature( ) {
		
	}

	public Criature (String classe, int defesa, int ataque, int energia, String terreno) {
		this.classe = classe;
		this.defesa = defesa;
		this.ataque = ataque;
		this.energia = energia;
		this.terreno = terreno;
	}

	
	@Override
	public String toString() {
		String aux = "Criatura = [Classe: " + classe + ", " + 
				"Defesa: " + defesa + ", " + 
				"Ataque: " + ataque + ", " + 
				"Energia: " + energia + ", " + 
				"Terreno: " + terreno + "]";
		return aux;
	}
	
}