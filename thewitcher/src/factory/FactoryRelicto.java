package factory;

import criature.*;
import family.relicto.Dopplers;
import family.relicto.Kernun;
import family.relicto.Silvano;

public class FactoryRelicto extends MonsterFamilyFactory{
	public static Criature getNecrofago(MonsterClassEnum tipo) {
		
		switch (tipo) {
		case Kernun:
			return new Kernun("Kernun / G�nio Construtor", 8, 9, 10, "N�o possui um terreno.");
		case Dopplers:
			return new Dopplers("Dopplers / Construtor", 5, 3, 2, "P�ntano");
		case Silvano:
			return new Silvano("Silvano / Construtor", 3, 6, 1, "Montanhas");	
		}
		
		return null;
		
	}

}