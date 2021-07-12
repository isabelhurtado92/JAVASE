package controlador;

import java.util.Scanner;

public class LoginControlador {
	
	//pedir al usuario nombre y contraseña
	//con sus mensajes por pantalla

	
	public static void login() {
		
		Scanner scanner = new Scanner(System.in);
		String usuario = "";
		String password = "";
	
		
		System.out.print("Por favor, introduce tu nombre de usuario\n");
		usuario = scanner.nextLine();
		
		System.out.print("Por favor, introduce tu contraseña\n");
		password = scanner.nextLine();
		
		
		//compare with array of users
		
		if (ControladorPrincipal.checkIfUserExist(usuario) &&
				ControladorPrincipal.getUserFromList(usuario).getPassword().equals(password)) {
			
			System.out.println("Bienvenido/a " + usuario);
	
			ControladorUsuario.menu(usuario);
			ControladorGastos.MenuPrincipalGestionGastos(usuario);
			
		} else {
			System.out.println("La contraseña o login no es correcto. Por favor, intentalo de nuevo");
		}
		scanner.close();
	}
}

