package factory;

import criature.*;
import family.insectoide.Arachno;
import family.insectoide.Harrisi;
import family.insectoide.Kikimora;

public class FactoryInsectoide extends MonsterFamilyFactory{
public static Criature getNecrofago(MonsterClassEnum tipo) {
		
		switch (tipo) {
		case Kikimora:
			return new Kikimora("Kikimora / G�nio Construtor", 8, 9, 10, "N�o possui um terreno.");
		case Harrisi:
			return new Harrisi("Harrisi / Construtor", 5, 3, 2, "P�ntano");
		case Arachno:
			return new Arachno("Arachno / Construtor", 3, 6, 1, "Montanhas");	
		}
		
		return null;
		
	}
}