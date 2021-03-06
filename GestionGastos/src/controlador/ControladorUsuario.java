package controlador;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Gasto;
import modelo.Usuario;
import clasesconmetodos.Valoracion;

public class ControladorUsuario {

	//Creamos el menu principal
	//Con opciones y llamadas a metodos contenidos en sus clases correspondientes

	public static void menu(String usuario) {

		Scanner reader = new Scanner(System.in);
		String nuevoNombreContrasenia = "";
		String SeleccionMenu = "";
		
		
		while (true) {

			System.out.println("MENU PRINCIPAL:");
			System.out.println("Cambiar nombre de usuario");
			System.out.println("Cambiar contrase?a");
			System.out.println("Administrar gastos");
			System.out.println("Eliminar la cuenta");
			System.out.println("Valorar el servicio");
			System.out.println("Salir");
			System.out.println("--------------------------------\n");
			System.out.println("Por favor, introduce la opci?n que desees llevar a cabo\n");
			
			SeleccionMenu = reader.nextLine();
			

			if (SeleccionMenu.equalsIgnoreCase("Cambiar nombre de usuario")) {

				System.out.println("Introduce un nuevo nombre de usuario, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (ControladorPrincipal.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("El nombre de usuario fue cambiado con exito");
				} else {
					System.out.println("Error. No existe el usuario: " + usuario);
				}
				
				
			}

			else if (SeleccionMenu.equalsIgnoreCase("Cambiar contrase?a")) {

				System.out.println("Introduce una contrase?a nueva, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (ControladorPrincipal.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("La contrase?a fue cambiada con exito");
				} else {
					System.out.println("Error. No existe el usuario: " + usuario);
				}
				
				
			}

			else if (SeleccionMenu.equalsIgnoreCase("Administrar gastos")) {

				ControladorGastos.MenuPrincipalGestionGastos(usuario);
			}

			else if (SeleccionMenu.equalsIgnoreCase("Eliminar la cuenta")) {

				if (ControladorPrincipal.eliminarUsuario(usuario)) {
					System.out.println("La cuenta fue eliminada con exito.");
				} else {
					System.out.println("Error. No existe la cuenta: " + usuario);
				}
			}
			
			else if (SeleccionMenu.equalsIgnoreCase("Valorar el servicio")) {
			//Valoracion.valorandoServicio(usuario);
				
				//to-do.
				//Method already created (valorandoServicio).
				
			}


			else if (SeleccionMenu.equalsIgnoreCase("Salir")) {
				break;
			}

			else {
				System.out.println(
						"Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");

			}
		}

	}


}