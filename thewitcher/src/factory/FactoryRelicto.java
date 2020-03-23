package factory;

import java.util.ArrayList;
import java.util.Random;

import criature.*;
import family.relicto.Dopplers;
import family.relicto.Kernun;
import family.relicto.Silvano;

public class FactoryRelicto extends MonsterFamilyFactory{

	@Override
	public Criature getCriature(MonsterClassEnum tipo) {
		switch (tipo) {
		case Kernun:
			return new Kernun("Kernun / Gênio Construtor", 8, 9, 10, "Não possui um terreno.");
		case Dopplers:
			return new Dopplers("Dopplers / Construtor", 5, 3, 2, "Pântano");
		case Silvano:
			return new Silvano("Silvano / Construtor", 3, 6, 1, "Montanhas");
		default:
			break;	
		}
		
		return null;
	}

	public ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Kernun);
		enumClasses.add(MonsterClassEnum.Dopplers);
		enumClasses.add(MonsterClassEnum.Silvano);
		
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