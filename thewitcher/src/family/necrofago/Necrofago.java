package family.necrofago;

import java.util.ArrayList;

import criature.Criature;
import factory.MonsterClassEnum;

public class Necrofago extends Criature{
	public Necrofago(String classe, int defesa, int ataque, int energia, String terreno) {
		super(classe, defesa, ataque, energia, terreno);
	}

	public static ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Ghouls);
		enumClasses.add(MonsterClassEnum.Necroso);
		enumClasses.add(MonsterClassEnum.Nevoloso);
		
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
