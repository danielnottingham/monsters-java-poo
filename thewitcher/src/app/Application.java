package app;

import java.util.Random;

import factory.MonsterClassEnum;
import factory.MonsterFamilyEnum;

import java.util.ArrayList;


public class Application {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<MonsterClassEnum> enums = new ArrayList<MonsterClassEnum>();
		enums.add(MonsterClassEnum.Djinn); enums.add(MonsterClassEnum.Gargula); enums.add(MonsterClassEnum.Golem);
		enums.add(MonsterClassEnum.Ghouls); enums.add(MonsterClassEnum.Necroso); enums.add(MonsterClassEnum.Nevoloso);
		enums.add(MonsterClassEnum.Kikimora); enums.add(MonsterClassEnum.Arachno); enums.add(MonsterClassEnum.Harrisi);
		enums.add(MonsterClassEnum.Silvano); enums.add(MonsterClassEnum.Kernun); enums.add(MonsterClassEnum.Dopplers);
		
		
		ArrayList<MonsterFamilyEnum> enumFactory = new ArrayList<MonsterFamilyEnum>();
		enumFactory.add(MonsterFamilyEnum.Necrofago);
		enumFactory.add(MonsterFamilyEnum.Construtor);
		enumFactory.add(MonsterFamilyEnum.Insectoide);
		enumFactory.add(MonsterFamilyEnum.Relicto);
		
		
		MonsterFamilyEnum aleatoryFactory = enumFactory.get(random.nextInt(4)); 
		MonsterClassEnum aleatoryClass = enums.get(random.nextInt(12)); 
		
		
		System.out.println(aleatoryClass);
		System.out.println(aleatoryFactory);
		
	}

}
