package app;

import java.util.Random;

import factory.MonsterClassEnum;
import factory.MonsterFamilyEnum;

import java.util.ArrayList;


public class Application {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<MonsterClassEnum> enumClass = new ArrayList<MonsterClassEnum>();
		enumClass.add(MonsterClassEnum.Djinn); enumClass.add(MonsterClassEnum.Gargula); enumClass.add(MonsterClassEnum.Golem);
		enumClass.add(MonsterClassEnum.Ghouls); enumClass.add(MonsterClassEnum.Necroso); enumClass.add(MonsterClassEnum.Nevoloso);
		enumClass.add(MonsterClassEnum.Kikimora); enumClass.add(MonsterClassEnum.Arachno); enumClass.add(MonsterClassEnum.Harrisi);
		enumClass.add(MonsterClassEnum.Silvano); enumClass.add(MonsterClassEnum.Kernun); enumClass.add(MonsterClassEnum.Dopplers);
		
		
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
