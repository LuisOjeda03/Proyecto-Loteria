/*
 *  Proyecto Loteria - Estructura de datos Clase Jugador
 *  Creador por:
 *   Ojeda Lopez Luis Enrique
 *   Uribe Armenta Javier
 */

package proyecto_loteria;

public class Jugador 
{
    private Jugador siguiente;
    private int id;
    private Tablas tabla;

    public Jugador(int id, Tablas tabla)
    {
        this.id = id;
        this.tabla = tabla;
    }

    public Jugador getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Jugador siguiente) {
        this.siguiente = siguiente;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Tablas getTabla() {
        return this.tabla;
    }

    public void setTabla(Tablas tabla) {
        this.tabla = tabla;
    }

}