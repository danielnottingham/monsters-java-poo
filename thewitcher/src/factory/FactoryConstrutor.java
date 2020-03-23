package factory;

import criature.*;
import family.construtor.Djinn;
import family.construtor.Gargula;
import family.construtor.Golem;

public class FactoryConstrutor extends MonsterFamilyFactory {

	@Override
	public Criature getCriature(MonsterClassEnum tipo) {
		switch (tipo) {
		case Djinn:
			return new Djinn("Djin / Gênio Construtor", 8, 9, 10, "Não possui um terreno.");
		case Golem:
			return new Golem("Golem / Construtor", 5, 3, 2, "Pântano");
		case Gargula:
			return new Gargula("Gargula / Construtor", 3, 6, 1, "Montanhas");
		default:
			break;
		}

		return null;
	}

}