package family.construtor;

import java.util.ArrayList;

import criature.Criature;
import factory.MonsterClassEnum;

public class Construtor extends Criature{
	public Construtor(String classe, int defesa, int ataque, int energia, String terreno) {
		super(classe, defesa, ataque, energia, terreno);
	}

	public static ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Djinn);
		enumClasses.add(MonsterClassEnum.Golem);
		enumClasses.add(MonsterClassEnum.Gargula);
		
		return enumClasses;
	}

	@Override
	public String toString() {
		String aux = "Classe: " + classe + ", " + 
				"Defesa: " + defesa + ", " + 
				"Ataque: " + ataque + ", " + 
				"Energia: " + energia + ", " + 
				"Terreno: " + terreno;
		return aux;
	}


}