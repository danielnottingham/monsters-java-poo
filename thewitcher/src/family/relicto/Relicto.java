package family.relicto;

import java.util.ArrayList;

import criature.Criature;
import factory.MonsterClassEnum;

public class Relicto extends Criature{
	public Relicto(String classe, int defesa, int ataque, int energia, String terreno) {
		super(classe, defesa, ataque, energia, terreno);
	}

	public static ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Dopplers);
		enumClasses.add(MonsterClassEnum.Kernun);
		enumClasses.add(MonsterClassEnum.Silvano);
		
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