package personas;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona> {

	private int comoOrdenar;
	public static final int ASCENDENTE_EDAD = 1;
	public static final int DESCENDENTE_EDAD = 2;
	public static final int ASCENDENTE_NOMBRE = 3;
	public static final int DESCENDENTE_NOMBRE = 4;

	public ComparadorPersonas() {

		comoOrdenar = ASCENDENTE_EDAD;
	}

	public void setComoOrdenar(int como) {

		if (como == DESCENDENTE_EDAD) {

			comoOrdenar = DESCENDENTE_EDAD;
		} else if (como == ASCENDENTE_NOMBRE) {

			comoOrdenar = ASCENDENTE_NOMBRE;
		} else
			comoOrdenar = DESCENDENTE_NOMBRE;
	}

	@Override
	public int compare(Persona p1, Persona p2) {

		int devolver;

		if (comoOrdenar == ASCENDENTE_EDAD) {

			devolver = p1.getEdad() - p2.getEdad();
		} else if (comoOrdenar == DESCENDENTE_EDAD) {

			devolver = p2.getEdad() - p1.getEdad();
		} else if (comoOrdenar == ASCENDENTE_NOMBRE) {

			devolver = p1.getNombre().compareTo(p2.getNombre());
		} else
			devolver = p2.getNombre().compareTo(p1.getNombre());

		return devolver;
	}

	public int compare2(Persona p1, Persona p2) {

		int devolver;

		if (comoOrdenar == ASCENDENTE_EDAD && p1.getEdad() == p2.getEdad()) {

			devolver = p1.getNombre().compareTo(p2.getNombre());
		} else if (comoOrdenar == DESCENDENTE_EDAD && p1.getEdad() == p2.getEdad()) {

			devolver = p1.getNombre().compareTo(p2.getNombre());
		} else if (comoOrdenar == ASCENDENTE_NOMBRE && p1.getNombre() == p2.getNombre()) {

			devolver = p1.getEdad() - p2.getEdad();
		} else
			devolver = p1.getEdad() - p2.getEdad();

		return devolver;
	}

//	@Override
//	public int compare(Persona p1, Persona p2) {
//		
//		int devolver;
//		
//		if (comoOrdenar == ASCENDENTE_EDAD) {
//			
//			devolver = p1.getEdad()-p2.getEdad();
//		} else devolver = p2.getEdad()-p1.getEdad();
//		
//		return devolver;
//	}

//	@Override
//	public int compare(Persona p1, Persona p2) {
//
//		return p1.getEdad() - p2.getEdad();
//	}

}
