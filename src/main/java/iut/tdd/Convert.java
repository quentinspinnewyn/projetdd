package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	
	static String[]  chiffres = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","20"};
	static String[]  chiffreslettres = {"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf","dix","onze","douze","treize","quatorze","quinze","seize","vingt"};
	
	public static String num2text(String input) {
		for (int i=0 ; i<chiffres.length;i++){
			if(chiffres[i].equals(input)){
				return chiffreslettres[i];
			}
		}
		return null;
	}
}