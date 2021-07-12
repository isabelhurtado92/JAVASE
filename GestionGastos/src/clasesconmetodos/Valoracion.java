package clasesconmetodos;
import java.util.Scanner;

import modelo.Usuario;

public class Valoracion {
	
	private String Valoracion;

	
	
		public Valoracion() {
		super();
		
	}



		public String getValoracion() {
		return Valoracion;
	}



	public void setValoracion(String valoracion) {
		Valoracion = valoracion;
	}



		public void valorandoServicio(String usuario) {

			System.out.println("Por favor, introduce la opcion mas acorde con tu nivel de satisfacción de nuestro servicio."
					+ "Si, por contra, quieres salir, escribe Salir \n");
			System.out.println(" - - - - - - - - -");
			System.out.println("Extremadamente satisfecha/o");
			System.out.println("Muy satisfecha/o");
			System.out.println("Satisfecha/o");
			System.out.println("Poco satisfecha/o");
			System.out.println("Nada satisfecha/o");

				Scanner reader = new Scanner(System.in);
				String valoracion = reader.nextLine();

				this.setValoracion(valoracion);
						
				
			}
}

