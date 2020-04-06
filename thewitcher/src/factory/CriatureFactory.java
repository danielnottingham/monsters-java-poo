package factory;

import criature.Criature;

public abstract class CriatureFactory {
	public abstract Criature getCriature(MonsterClassEnum tipo);
	public abstract Criature getRandomCriature();
}
