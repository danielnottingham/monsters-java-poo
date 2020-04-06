package app;

import java.util.Random;

import criature.Criature;
import factory.MonsterClassEnum;
import factory.MonsterFamilyEnum;
import factory.MonsterFamilyFactory;
import family.construtor.Construtor;
import family.insectoide.Insectoide;
import family.necrofago.Necrofago;
import family.relicto.Relicto;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {

		Random random = new Random();

		ArrayList<MonsterFamilyEnum> enumFamily = new ArrayList<MonsterFamilyEnum>();
		enumFamily.add(MonsterFamilyEnum.Necrofago);
		enumFamily.add(MonsterFamilyEnum.Construtor);
		enumFamily.add(MonsterFamilyEnum.Insectoide);
		enumFamily.add(MonsterFamilyEnum.Relicto);
		
		for(int i=1; i<=25 ; i++) {
			MonsterFamilyEnum aleatoryFamily = enumFamily.get(random.nextInt(4));
			MonsterFamilyFactory family = MonsterFamilyFactory.getFactory(aleatoryFamily);
			Criature criatura = family.getRandomCriature();
			System.out.println(i + ". " + criatura);
			
		} 
		
	}

}
