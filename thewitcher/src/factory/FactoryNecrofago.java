package factory;

import java.util.ArrayList;
import java.util.Random;

import criature.*;
import family.necrofago.Ghouls;
import family.necrofago.Necroso;
import family.necrofago.Nevoloso;

public class FactoryNecrofago extends MonsterFamilyFactory{
	@Override
	public Criature getCriature(MonsterClassEnum tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necr�fago", 5, 7, 3, "Cemit�rio");
		case Necroso:
			return new Necroso("Necroso / Necr�fago", 5, 3, 2, "Cemit�rio");
		case Nevoloso:
			return new Nevoloso("Nevoloso / Necr�fago", 3, 6, 1, "Cemit�rio");
		default:
			break;	
		}
		
		return null;
	}

	public ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Ghouls);
		enumClasses.add(MonsterClassEnum.Necroso);
		enumClasses.add(MonsterClassEnum.Nevoloso);
		
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
