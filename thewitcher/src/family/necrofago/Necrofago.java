package family.necrofago;

import java.util.ArrayList;

import criature.Criature;
import factory.MonsterClassEnum;

public class Necrofago extends Criature{

	public static ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Ghouls);
		enumClasses.add(MonsterClassEnum.Necroso);
		enumClasses.add(MonsterClassEnum.Nevoloso);
		
		return enumClasses;
	}

}
