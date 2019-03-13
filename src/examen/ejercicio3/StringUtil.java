package examen.ejercicio3;

import java.util.HashMap;
import java.util.Map;

public class StringUtil {
	
	static Map<String,Integer > Cadenas = new HashMap();
	
	public static int contarLetrasUnicas(String frase) {
		int valor = 0;
		
		frase = frase.toLowerCase();
		char letra;
		
		if(Cadenas.containsKey(frase)) {
			return Cadenas.get(frase);
		}
		
		for(int i=0;i<frase.length();i++) {
			int cont = 0;
			letra=frase.charAt(i);
			for(int j=0;j<frase.length();j++) {
				if(i != j && letra == (frase.charAt(j))) {
					 cont++;
				}
			}
			if(cont == 0) {
				valor++;
			}
		}
		
		Cadenas.put(frase, valor);
		
		
		return valor;
		
	}

	public static void main(String[] args) {
		System.out.println(contarLetrasUnicas("HOLA tardes amigos"));
		System.out.println("siguiente frase");
		System.out.println(contarLetrasUnicas("ADIOS"));
		System.out.println("siguiente frase");
		System.out.println(contarLetrasUnicas("HOoLAa"));
		System.out.println(Cadenas.values());
		

	}


}
