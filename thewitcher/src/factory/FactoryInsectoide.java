package factory;

import java.util.ArrayList;
import java.util.Random;

import criature.*;
import family.insectoide.Arachno;
import family.insectoide.Harrisi;
import family.insectoide.Kikimora;

public class FactoryInsectoide extends MonsterFamilyFactory{

	@Override
	public Criature getCriature(MonsterClassEnum tipo) {
		switch (tipo) {
		case Kikimora:
			return new Kikimora("Kikimora / Gênio Construtor", 8, 9, 10, "Não possui um terreno.");
		case Harrisi:
			return new Harrisi("Harrisi / Construtor", 5, 3, 2, "Pântano");
		case Arachno:
			return new Arachno("Arachno / Construtor", 3, 6, 1, "Montanhas");
		default:
			break;	
		}
		
		return null;
	}

	public ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Kikimora);
		enumClasses.add(MonsterClassEnum.Harrisi);
		enumClasses.add(MonsterClassEnum.Arachno);
		
		return enumClasses;
	}

	@Override
	public Criature getRandomCriature() {
		Random random = new Random();
		ArrayList<MonsterClassEnum> familyList = getClasses();
		MonsterClassEnum monsterClassEnum = familyList.get(random.nextInt(familyList.size()));
		return getCriature(monsterClassEnum);
	}

}