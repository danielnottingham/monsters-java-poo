package factory;

import java.util.ArrayList;
import java.util.Random;

import criature.*;
import family.construtor.Djinn;
import family.construtor.Gargula;
import family.construtor.Golem;

public class FactoryConstrutor extends MonsterFamilyFactory {

	@Override
	public Criature getCriature(MonsterClassEnum tipo) {
		switch (tipo) {
		case Djinn:
			return new Djinn("Djin / G�nio Construtor", 8, 9, 10, "N�o possui um terreno.");
		case Golem:
			return new Golem("Golem / Construtor", 5, 3, 2, "P�ntano");
		case Gargula:
			return new Gargula("Gargula / Construtor", 3, 6, 1, "Montanhas");
		default:
			break;
		}

		return null;
	}
	
	public ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Djinn);
		enumClasses.add(MonsterClassEnum.Golem);
		enumClasses.add(MonsterClassEnum.Gargula);
		
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