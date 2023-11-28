package arreglos;

import java.util.ArrayList;

import clases.Cliente;

public class ArregloCliente {
	private ArrayList<Cliente> arreglo;

	public ArregloCliente() {
		arreglo = new ArrayList<Cliente>();
	}

	public Cliente obtener(int posicion) {
		return arreglo.get(posicion);
	}

	public Cliente buscar(int codigo) {
		for (Cliente cli : arreglo) {
			if (cli.getCodigo() == codigo)
				return cli;
		}
		return null;
	}

	public void agregar(Cliente c) {
		arreglo.add(c);
	}

	public void eliminar(Cliente c) {
		arreglo.remove(c);
	}

	public int generarCodigo() {
		if (arreglo.size() == 0)
			return 1001;
		return obtener(tamaño() - 1).getCodigo() + 1;
	}

	public int tamaño() {
		return arreglo.size();
	}
}
