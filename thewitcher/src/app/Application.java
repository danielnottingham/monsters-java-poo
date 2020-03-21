package app;

import java.util.Random;

import factory.MonsterClassEnum;
import factory.MonsterFamilyEnum;
import family.construtor.Construtor;
import family.insectoide.Insectoide;
import family.necrofago.Necrofago;
import family.relicto.Relicto;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {

		Random random = new Random();

		ArrayList<MonsterClassEnum> enumClass = new ArrayList<MonsterClassEnum>();
		
		enumClass.addAll(Construtor.getClasses());
		enumClass.addAll(Insectoide.getClasses());
		enumClass.addAll(Relicto.getClasses());
		enumClass.addAll(Necrofago.getClasses());

		ArrayList<MonsterFamilyEnum> enumFamily = new ArrayList<MonsterFamilyEnum>();
		enumFamily.add(MonsterFamilyEnum.Necrofago);
		enumFamily.add(MonsterFamilyEnum.Construtor);
		enumFamily.add(MonsterFamilyEnum.Insectoide);
		enumFamily.add(MonsterFamilyEnum.Relicto);

		MonsterFamilyEnum aleatoryFamily = enumFamily.get(random.nextInt(4));
		MonsterClassEnum aleatoryClass = enumClass.get(random.nextInt(12));

		System.out.println(aleatoryClass);
		System.out.println(aleatoryFamily);

	}

}
