package ejemplo_4_beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento implements Proceso {

	@Override
	public Object ejecuta() {
		// TODO Auto-generated method stub
		List< Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros.add(9);
		listaEnteros.add(3);
		listaEnteros.add(1);
		listaEnteros.add(6);
		listaEnteros.add(5);
		listaEnteros.add(10);
		Collections.sort(listaEnteros);
		return listaEnteros;
	}

}
