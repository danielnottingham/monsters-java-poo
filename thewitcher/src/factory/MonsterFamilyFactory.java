package factory;

import criature.Criature;

public abstract class MonsterFamilyFactory {

	public static MonsterFamilyFactory getFactory(MonsterFamilyEnum tipo) {
		switch (tipo) {
		case Necrofago:
			return new FactoryNecrofago();
		case Construtor:
			 return new FactoryConstrutor();
		case Relicto:
			 return new FactoryRelicto();
		case Insectoide:
			 return new FactoryInsectoide();
		}
		return null;
	}
	
	public abstract Criature getCriature(MonsterClassEnum tipo);
	
	public abstract Criature getRandomCriature();
	
}
