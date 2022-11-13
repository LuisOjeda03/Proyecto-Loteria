/*
 *  Proyecto Loteria - Estructura de datos Interfaz interfazCola
 *  Creador por:
 *   Ojeda Lopez Luis Enrique
 *   Uribe Armenta Javier
 */

package proyecto_loteria;

public interface interfazCola 
{
	public int longitud();
	public boolean vacia();
	public void agregar(Carta c);
	public Carta sacarPrimera();
	public Carta sacarUltima();
}