package factory;

import criature.*;

public class FactoryNecrofago extends MonsterFamilyFactory{
public static Criature getNecrofago(MonsterClassEnum tipo) {
		
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necr�fago", 5, 7, 3, "Cemit�rio");
		case Necroso:
			return new Necroso("Necroso / Necr�fago", 5, 3, 2, "Cemit�rio");
		case Nevoloso:
			return new Nevoloso("Nevoloso / Necr�fago", 3, 6, 1, "Cemit�rio");	
		}
		
		return null;
		
	}
}
