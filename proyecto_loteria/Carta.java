/*
 *  Proyecto Loteria - Estructura de datos Clase Carta
 *  Creador por:
 *   Ojeda Lopez Luis Enrique
 *   Uribe Armenta Javier
 */

package proyecto_loteria;

public class Carta 
{
	private Carta siguiente;
	private int numero;
	private String nombre;
	private boolean marcada;
	
	public Carta(int numero, String nombre)
	{
		this.setNumero(numero);
		this.setNombre(nombre);
	}
	
	@Override
	public String toString()
	{
		return numero+" "+nombre;
	}
	
	public Carta getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Carta siguiente) {
		this.siguiente = siguiente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getMarcada() {
		return marcada;
	}

	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}
	
}
