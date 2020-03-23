package factory;

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


}