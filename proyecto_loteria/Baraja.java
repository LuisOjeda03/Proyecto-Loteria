/*
 *  Proyecto Loteria - Estructura de datos Clase Baraja
 *  Creador por:
 *   Ojeda Lopez Luis Enrique
 *   Uribe Armenta Javier
 */

package proyecto_loteria;

public class Baraja implements interfazCola
{
	private Carta inicio;
	private Carta ultimo;
	private int tamanoActual;
	
	public Baraja()
	{
		
	}

	@Override
	public int longitud() {
		return tamanoActual;
	}

	@Override
	public boolean vacia() {
		return tamanoActual==0;
	}
	
	@Override
	public void agregar(Carta c) {
		
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
			if(temp.getSiguiente()==null)
				ultimo = temp.getSiguiente();
			temp.setSiguiente(c);
		}
		tamanoActual++;
	}

	@Override
	public Carta sacarPrimera() {
		if(!vacia())
		{
			Carta temp = inicio;
			Carta sacada = inicio;
			inicio = null;
			inicio = temp.getSiguiente();
			tamanoActual--;			
			System.out.println("Carta: "+sacada.getNombre());
			System.out.println("");
			return sacada;
		}
		return null;
	}

	@Override
	public Carta sacarUltima() {
		
		if(!vacia())
		{
			Carta temp = inicio;
			int contador = 0;
			
			while(temp!=null)
			{
				if(temp.getSiguiente()!=null)
					contador++;
				temp = temp.getSiguiente();
			}
			int maximo = 0;
			temp = inicio;
			
			while(temp!=null)
			{
				if(maximo == contador - 1)
				{
					ultimo = temp.getSiguiente();
					temp.setSiguiente(null);
					maximo++;
				}
				else
				{
					temp = temp.getSiguiente();
					maximo++;
				}
			}
			tamanoActual--;
			System.out.println("Carta: "+ultimo.getNombre());
			System.out.println("");
			return ultimo;
		}
		return null;
	}
	
	public void mostrar()
	{
		Carta c = inicio;
		int contador = 1;
		while(c!=null)
		{
			System.out.println(c.getNombre()+" "+contador);
			c = c.getSiguiente();
			contador++;
		}
	}
	
	public void eliminarCarta(int numero)
	{
		if(!vacia())
		{
			Carta temp = inicio;
			Carta tempAnterior = inicio;
			
			if(numero == inicio.getNumero())
				inicio = temp.getSiguiente();
			
			while(temp.getNumero()!=numero)
			{
				System.out.println("while");
				temp = temp.getSiguiente();
			}
			for(int i=0; i<temp.getNumero() - 2;i++)
			{
				System.out.println("for");
				tempAnterior = tempAnterior.getSiguiente();
			}
				
			if(temp.getSiguiente()!=null)
			{
				tempAnterior.setSiguiente(temp.getSiguiente());
			}
			tamanoActual--;
		}
	}
	
	private void reemplazar(Baraja baraja, Baraja barajaTemporal)
	{
		int contador = 0;
		Carta c = baraja.inicio;
		Carta cT = barajaTemporal.inicio; 
		while(contador<54)	
		{
			c.setNumero(cT.getNumero());
			c.setNombre(cT.getNombre());
			
			c = c.getSiguiente();
			cT = cT.getSiguiente();
			contador++;
		}
	}
	
	public void barajear(Baraja baraja)
	{
		Baraja barajaTemp = new Baraja();
		int[] vect = new int [54];
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
			barajaTemp.agregar(cart);
		}
		
		reemplazar(baraja,barajaTemp);
	}
}