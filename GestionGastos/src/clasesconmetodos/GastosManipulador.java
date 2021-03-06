package clasesconmetodos;

import modelo.Gasto;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class GastosManipulador {

	public static void a?adirGasto(Usuario usuarioObject, ArrayList<Gasto> gastos, Scanner scanner) {
		String gastoName = "";
		double precio = 0.0;
		Gasto gasto = new Gasto("", 0.0);
		boolean mas = false;

		do {
			System.out.println("Escribe nombre del gasto, por favor:");
			gastoName = scanner.nextLine();

			System.out.println("Escribe el precio, por favor:");
			precio = Double.parseDouble(scanner.nextLine().replace(",", "."));
			gasto.setNombre(gastoName);
			gasto.setPrecio(precio);
			gastos.add(new Gasto(gastoName, precio));
			usuarioObject.setGastos(gastos);

			System.out.println("El gasto fue a?adido" + "\n" + "Quiere a?adir m?s gastos?(y/n)");
			mas = scanner.nextLine().equalsIgnoreCase("y") ? true : false;
		} while (mas);
	}

	public static void listarGasto(ArrayList<Gasto> gastos) {

		System.out.println("\nLista de gastos: \n");

		for (Gasto gasto : gastos) {
			System.out.println(gasto.getNombre() + ": " + gasto.getPrecio());
		}

		if (gastos.isEmpty()) {
			System.out.println("No hay gastos!");
		}

		System.out.println("");
	}

	public static void borrarGastos(Usuario usuarioObject, ArrayList<Gasto> gastos, Scanner scanner) {
		String gastoName = "";
		Gasto gasto = new Gasto();
		boolean mas = false;

		do {
			listarGasto(gastos);
			System.out.print("Todos");
			System.out.println("\nElije el gasto que quieres borrar: ");
			gastoName = scanner.nextLine();

			if (gastoName.equalsIgnoreCase("todos")) {
				gastos.removeAll(gastos);
				usuarioObject.setGastos(gastos);
				System.out.println("Gastos fueron borrados");
			} else {
				gasto = sacarGastoDeLista(gastos, gastoName);

				if (!sacarGastoDeLista(gastos, gastoName).getNombre().equals("null")) {
					gastos.remove(gasto);
					usuarioObject.setGastos(gastos);
					System.out.println("El gasto fue borrado" + "\n" + "Quiere borrar otro gasto?(y/n)");
					mas = scanner.nextLine().equalsIgnoreCase("y") ? true : false;

				} else {
					System.out.println(
							"El nombre del gasto no coincide. Comprueba si has escrito el nombre correctamente!\n");
				}
			}
			System.out.println("");
		} while (mas);
	}

	public static void modificarGastos(Usuario usuarioObject, ArrayList<Gasto> gastos, Scanner scanner) {
		String gastoName = "";
		Gasto gasto = new Gasto();
		double precio = 0.0;
		boolean mas = false;

		do {
			listarGasto(gastos);
			System.out.println("\nElije el gasto que quieres modificar: ");
			gastoName = scanner.nextLine();
			gasto = sacarGastoDeLista(gastos, gastoName);

			if (!sacarGastoDeLista(gastos, gastoName).equals("null")) {
				System.out
						.println("Precio del gasto es " + gasto.getPrecio() + "\nIntroduce nuevo precio, por favor: ");
				precio = Double.parseDouble(scanner.nextLine().replace(",", "."));
				gasto.setPrecio(precio);
				usuarioObject.setGastos(gastos);

				System.out.println("El gasto fue modificado" + "\n" + "Quiere modificar otro gasto?(y/n)");
				mas = scanner.nextLine().equalsIgnoreCase("y") ? true : false;
			} else {
				System.out
						.println("El nombre del gasto no coincide. Comprueba si has escrito el nombre correctamente!");
			}

		} while (mas);
	}

	public static Gasto sacarGastoDeLista(ArrayList<Gasto> gastos, String gastoName) {
		Gasto gasto = new Gasto("null", 0.0);

		for (Gasto deGasto : gastos) {
			if (deGasto.getNombre().equalsIgnoreCase(gastoName)) {
				return deGasto;
			}
		}
		return gasto;
	}
}
