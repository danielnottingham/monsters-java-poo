package factory;

import criature.*;
import family.necrofago.Ghouls;
import family.necrofago.Necroso;
import family.necrofago.Nevoloso;

public class FactoryNecrofago extends MonsterFamilyFactory{
	@Override
	public Criature getCriature(MonsterClassEnum tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necrófago", 5, 7, 3, "Cemitério");
		case Necroso:
			return new Necroso("Necroso / Necrófago", 5, 3, 2, "Cemitério");
		case Nevoloso:
			return new Nevoloso("Nevoloso / Necrófago", 3, 6, 1, "Cemitério");
		default:
			break;	
		}
		
		return null;
	}

}
