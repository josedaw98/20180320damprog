package examen.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
	
	static Map<Character, ArrayList<Integer>> mapa = new HashMap<>();
	ArrayList<Integer> valores = new ArrayList<Integer>();
	
	public static Map<Character, ArrayList<Integer>> crear(String frase) {
		for(int i=0; i<frase.length();i++) {
			if(mapa.containsKey(frase.charAt(i))) {
				mapa.get(frase.charAt(i)).add(i);
				
			}else {
			mapa.put(frase.charAt(i),mapa.get(frase.charAt(i)));
			}
		}
		return mapa;
	}
	

	public static void main(String[] args) {
		crear("hola mundo feliz");
		mapa.values();

	}

}
