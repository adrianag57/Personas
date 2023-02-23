package personas;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		
		Persona[] personas = new Persona[5];
		personas[0] = new Persona("Adrián", 19);
		personas[1] = new Persona("Claudia", 20);
		personas[2] = new Persona("Juan", 65);
		personas[3] = new Persona("Lucía", 53);
		personas[4] = new Persona("Carlos", 63);
		
		int[] numeros = {2, 97, 35, 5, 10, 11, 43, 21, 65, 73};
		
//		System.out.println(Arrays.toString(numeros));
//		Arrays.sort(numeros);
//		System.out.println(Arrays.toString(numeros));
		
		System.out.println(Arrays.toString(personas));
		
		ComparadorPersonas cp = new ComparadorPersonas();
//		Arrays.sort(personas, cp);
//		System.out.println(Arrays.toString(personas));
//		
//		cp.setComoOrdenar(ComparadorPersonas.DESCENDENTE_EDAD);
//		Arrays.sort(personas, cp);
//		System.out.println(Arrays.toString(personas));
		
		cp.setComoOrdenar(ComparadorPersonas.ASCENDENTE_NOMBRE);
		Arrays.sort(personas, cp);
		System.out.println(Arrays.toString(personas));
		
	}

}
