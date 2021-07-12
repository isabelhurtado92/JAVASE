package modelo;

import java.util.ArrayList;

import clasesconmetodos.Valoracion;


public class Usuario {
	//Creamos los atributos de Usuario
	//Un atributo es el array de gastos
	
	private String username;
	private String password;
	private ArrayList<Gasto> gastos;
	private Valoracion valoracion;


	//Creamos Getters, Setters, Constructor y toString
	public ArrayList<Gasto> getGastos() {
		return gastos;
	}


	public void setGastos(ArrayList<Gasto> gastos) {
		this.gastos = gastos;
	}


	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.gastos = new ArrayList<Gasto>();
		this.valoracion = new Valoracion();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public Valoracion getValoracion() {
		return valoracion;
	}


	public void setValoracion(Valoracion valoracion) {
		this.valoracion = valoracion;
	}
	

	@Override
	public String toString() {
		return "Usuario [username=" + username + ", password=" + password + ", gastos=" + gastos + ", valoracion=" + valoracion +"]";
	}



	
	
}