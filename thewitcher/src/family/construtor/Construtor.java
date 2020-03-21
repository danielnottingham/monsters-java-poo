package family.construtor;

import java.util.ArrayList;

import criature.Criature;
import factory.MonsterClassEnum;

public class Construtor extends Criature{

	public static ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Djinn);
		enumClasses.add(MonsterClassEnum.Golem);
		enumClasses.add(MonsterClassEnum.Gargula);
		
		return enumClasses;
	}

}