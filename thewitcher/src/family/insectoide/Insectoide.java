package family.insectoide;

import java.util.ArrayList;

import criature.Criature;
import factory.MonsterClassEnum;

public class Insectoide extends Criature{
	public Insectoide(String classe, int defesa, int ataque, int energia, String terreno) {
		super(classe, defesa, ataque, energia, terreno);
	}

	public static ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Kikimora);
		enumClasses.add(MonsterClassEnum.Arachno);
		enumClasses.add(MonsterClassEnum.Harrisi);
		
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