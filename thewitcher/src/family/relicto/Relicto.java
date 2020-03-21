package family.relicto;

import java.util.ArrayList;

import criature.Criature;
import factory.MonsterClassEnum;

public class Relicto extends Criature{

	public static ArrayList<MonsterClassEnum> getClasses(){
		ArrayList<MonsterClassEnum> enumClasses = new ArrayList<MonsterClassEnum>();
		enumClasses.add(MonsterClassEnum.Dopplers);
		enumClasses.add(MonsterClassEnum.Kernun);
		enumClasses.add(MonsterClassEnum.Silvano);
		
		return enumClasses;
	}
}