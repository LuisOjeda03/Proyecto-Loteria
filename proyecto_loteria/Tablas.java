/*
 *  Proyecto Loteria - Estructura de datos Clase Tablas
 *  Creador por:
 *   Ojeda Lopez Luis Enrique
 *   Uribe Armenta Javier
 */

package proyecto_loteria;

public class Tablas 
{
	private Carta inicio;
	private int tamanoActual;
	private boolean juegoCompleto;
	
	public Tablas()
	{

	}
	
	public boolean vacia()
	{
		return tamanoActual==0;
	}
	
	private void llenarTabla(Carta c)
	{
		if(vacia())
		{
			inicio = c;
		}
		else
		{
			Carta temp = inicio;
			while(temp.getSiguiente()!=null)
			{
				temp = temp.getSiguiente();
			}
			
			temp.setSiguiente(c);
		}
		tamanoActual++;
	}
	
	public void llenar()
	{
		int[] vect = new int [16];
		boolean existe = false;
		
		for(int x = 0; x<vect.length; x++)
		{
			int numero = (int)(Math.random()*54+1);
			for(int y=0; y<vect.length; y++)
			{
				if(vect[y]==numero)
					existe = true;
					
			}
			if(existe == false)
				vect[x] = numero;
			else
				x--;
			existe = false;
			
			
		}
		
		for(int x = 0; x<vect.length; x++)
		{
			Carta cart = Main.cartas(vect[x]);
			llenarTabla(cart);
		}
	}
	
	public void modificar(int x, int y)
	{
		if(!vacia())
		{
			Carta temp = inicio;
			Carta tempVerificar = inicio;
			boolean existe = false;
			while(temp.getNumero()!=x)
			{
				temp = temp.getSiguiente();
			}
			Carta nueva = Main.cartas(y);
			while(tempVerificar.getSiguiente()!=null)
			{
				tempVerificar = tempVerificar.getSiguiente();
				if(tempVerificar.getNumero()==nueva.getNumero())
				{
					existe = true;
					break;
				}
			}
			if(existe==false)
			{
				temp.setNombre(nueva.getNombre());
				temp.setNumero(nueva.getNumero());
			}
			else
				System.out.println("No ha sido posible modificar la tarjeta solicitada");
		}
		else
		{
			System.out.println("Tabla vacia");
		}
	}
	
	public void marcarCarta(Carta c)
	{
		Carta temp = inicio;
		while(temp!=null)
		{
			if(temp.getNumero()==c.getNumero())
			{
				temp.setMarcada(true);
				temp.setNombre("*");
			}
			temp = temp.getSiguiente();
		}
	}

	public boolean haGanado(){
		boolean ganado = false;
		boolean completo = true;

		Carta temp = inicio;
		while(temp!=null)
		{
			ganado = temp.getMarcada();
			if(ganado!=true)
			{
				completo = false;
				return completo;
			}
			temp = temp.getSiguiente();
		}
		return completo;
	}
	
	public void mostrarElemento()
	{
		int contador = 1;
		Carta c = inicio;
		
		while(c!=null)
		{
			System.out.print(c.getNumero()+" "+c.getNombre()+"\t");
			c = c.getSiguiente();
			if(contador%4==0)
				System.out.println();
			contador++;
		}
	}

	public void mostrar()
	{
		Carta c = inicio;
		while(c!=null)
		{
			System.out.println(c.getNumero()+" "+c.getNombre());
			c = c.getSiguiente();
		}
	}


	public boolean getJuegoCompleto() {
		return this.juegoCompleto;
	}

	public void setJuegoCompleto(boolean juegoCompleto) {
		this.juegoCompleto = juegoCompleto;
	}
}