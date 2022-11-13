/*
 *  Proyecto Loteria - Estructura de datos Clase Main
 *  Creador por:
 *   Ojeda Lopez Luis Enrique
 *   Uribe Armenta Javier
 */

package proyecto_loteria;

import java.util.Scanner;

public class Main 
{

	public static Carta cartas(int numeroCarta)
	{
		switch(numeroCarta)
		{
			case 1: 
				Carta c1 = new Carta(1,"El Gallo");
				return c1;
			case 2: 
				Carta c2 = new Carta(2,"El Diablo");
				return c2;
			case 3: 
				Carta c3 = new Carta(3,"La Dama");
				return c3;
			case 4: 
				Carta c4 = new Carta(4,"El Catrin");
				return c4;
			case 5: 
				Carta c5 = new Carta(5,"El Paraguas");
				return c5;
			case 6: 
				Carta c6 = new Carta(6,"La Sirena");
				return c6;
			case 7: 
				Carta c7 = new Carta(7,"La Escalera");
				return c7;
			case 8: 
				Carta c8 = new Carta(8,"La Botella");
				return c8;
			case 9: 
				Carta c9 = new Carta(9,"El Barril");
				return c9;
			case 10: 
				Carta c10 = new Carta(10,"El Arbol");
				return c10;
			case 11: 
				Carta c11 = new Carta(11,"El Melon");
				return c11;
			case 12: 
				Carta c12 = new Carta(12,"El Valiente");
				return c12;
			case 13: 
				Carta c13 = new Carta(13,"El Gorrito");
				return c13;
			case 14: 
				Carta c14 = new Carta(14,"La Muerte");
				return c14;
			case 15: 
				Carta c15 = new Carta(15,"La Pera");
				return c15;
			case 16: 
				Carta c16 = new Carta(16,"La Bandera");
				return c16;
			case 17: 
				Carta c17 = new Carta(17,"El Bandolon");
				return c17;
			case 18: 
				Carta c18 = new Carta(18,"El Violoncello");
				return c18;
			case 19: 
				Carta c19 = new Carta(19,"La Garza");
				return c19;
			case 20:
				Carta c20 = new Carta(20,"El Pajaro");
				return c20;
			case 21:
				Carta c21 = new Carta(21,"La Mano");
				return c21;
			case 22:
				Carta c22 = new Carta(22,"La Bota");
				return c22;
			case 23:
				Carta c23 = new Carta(23,"La Luna");
				return c23;
			case 24:
				Carta c24 = new Carta(24,"El Cotorro");
				return c24;
			case 25:
				Carta c25 = new Carta(25,"El Borracho");
				return c25;
			case 26:
				Carta c26 = new Carta(26,"El Negrito");
				return c26;
			case 27:
				Carta c27 = new Carta(27,"El Corazon");
				return c27;
			case 28:
				Carta c28 = new Carta(28,"La Sandia");
				return c28;
			case 29:
				Carta c29 = new Carta(29,"El Tambor");
				return c29;
			case 30:
				Carta c30 = new Carta(30,"El Camaron");
				return c30;
			case 31:
				Carta c31 = new Carta(31,"Las Jaras");
				return c31;
			case 32:
				Carta c32 = new Carta(32,"El Musico");
				return c32;
			case 33:
				Carta c33 = new Carta(33,"La Arana");
				return c33;
			case 34:
				Carta c34 = new Carta(34,"El Soldado");
				return c34;
			case 35:
				Carta c35 = new Carta(35,"La Estrella");
				return c35;
			case 36:
				Carta c36 = new Carta(36,"El Cazo");
				return c36;
			case 37:
				Carta c37 = new Carta(37,"El Mundo");
				return c37;
			case 38:
				Carta c38 = new Carta(38,"El Apache");
				return c38;
			case 39:
				Carta c39 = new Carta(39,"El Nopal");
				return c39;
			case 40:
				Carta c40 = new Carta(40,"El Alacran");
				return c40;
			case 41:
				Carta c41 = new Carta(41,"La Rosa");
				return c41;
			case 42:
				Carta c42 = new Carta(42,"La Calavera");
				return c42;
			case 43:
				Carta c43 = new Carta(43,"La Campana");
				return c43;
			case 44:
				Carta c44 = new Carta(44,"El Cantarito");
				return c44;
			case 45:
				Carta c45 = new Carta(45,"El Venado");
				return c45;
			case 46:
				Carta c46 = new Carta(46,"El Sol");
				return c46;
			case 47:
				Carta c47 = new Carta(47,"La Corona");
				return c47;
			case 48:
				Carta c48 = new Carta(48,"La Chalupa");
				return c48;
			case 49:
				Carta c49 = new Carta(49,"El Pino");
				return c49;
			case 50:
				Carta c50 = new Carta(50,"El Pescado");
				return c50;
			case 51:
				Carta c51 = new Carta(51,"La Palma");
				return c51;
			case 52:
				Carta c52 = new Carta(52,"La Maceta");
				return c52;
			case 53:
				Carta c53 = new Carta(53,"El Arpa");
				return c53;
			case 54:
				Carta c54 = new Carta(54,"La Rana");
				return c54;
		}
		return null;
	}
	
	public static void generarCartas(Baraja baraja)
	{
		for(int x = 1; x<=54; x++)
		{
			Carta c = cartas(x);
			baraja.agregar(c);
		}
	}

	public static Carta sacarCarta(Baraja baraja)
	{	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int op=0;
		
		while(op<1 && op>2);
		{
			System.out.println("");
			System.out.println("¿De donde la quiere sacar? (1 - Arriba / 2 - Abajo)");
			op = sc.nextInt();
			System.out.println();
		}
		if(op==1)
		{
			return baraja.sacarPrimera();
		}
		else
		{
			return baraja.sacarUltima();
		}
	}

	private static Tablas generarTablas()
	{
		Tablas tablas = new Tablas();
		tablas.llenar();
		return tablas;
	}

	public static void generarJugadores(int x, ColaJugadores jugadores)
	{
		for(int i=1; i<=x; i++)
		{
			Tablas tabla = generarTablas();
			Jugador causa = new Jugador(i,tabla);
			jugadores.agregar(causa);
		}
	}

	public static void modificarTarjeta(ColaJugadores jugadores, int j)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int rep = 1;
		while(rep==1)
		{
			int id = j+1, idCarta = 0, idCartaNueva = 0;
			imprimirTablas(jugadores);
			System.out.print("");
			while(id>j || id<=0)
			{
				System.out.print("Numero de jugador: ");
				id = sc.nextInt();
			}

			System.out.print("Numero de tarjeta a reemplazar: ");
			idCarta = sc.nextInt();

			System.out.print("Numero de tarjeta nueva: ");
			idCartaNueva = sc.nextInt();

			jugadores.getJugador(id).getTabla().modificar(idCarta, idCartaNueva);
			
			System.out.println("");
			System.out.println("¿Quiere cambiar otra tarjeta? (1- Seguir / 2 - Cancelar)");
			rep = sc.nextInt();
			System.out.println("");
		}
	}

	public static void imprimirTablas(ColaJugadores jugadores)
	{
		for (int x = 1; x <=jugadores.getTamanoActual(); x++) 
		{
			System.out.println("Jugador "+jugadores.getJugador(x).getId()); 
			jugadores.getJugador(x).getTabla().mostrarElemento();
			System.out.println("");
		}
	}
	
	public static void main(String[] args) 
	{
		Baraja baraja = new Baraja();
		ColaJugadores jugadores = new ColaJugadores();
		
		generarCartas(baraja);
		baraja.barajear(baraja);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LOTERIA - JUEGO");
		System.out.println("---------------");
	
		int opcion = 0;
		while(opcion<1 || opcion>2){
		System.out.println("1 - Jugar");
		System.out.println("2 - Salir");
		System.out.print("Opcion: ");
		opcion = sc.nextInt();
		System.out.println();
		}

		switch(opcion){
			case 1:
			int j = 0;
			while(j<=1)
			{
				System.out.print("Jugadores: ");
				j = sc.nextInt();
			}

			generarJugadores(j, jugadores);	
			System.out.println("");
			imprimirTablas(jugadores);
			System.out.println();
			int opcion2=0;
			System.out.println("¿Desea modificar una tarjeta? (1 - continuar / 2 - modificar)");

			do{
			opcion2 = sc.nextInt();
			}while(opcion2<0 && opcion2>1 );

			if(opcion2 == 2){
				System.out.println("");
				modificarTarjeta(jugadores,j);
			}
			System.out.println("");
			imprimirTablas(jugadores);
			System.out.println("");
			int numeroCarta = 1;
			
			boolean juegoTerminado = false;
			Carta cartaSacada = null;
			int[] ganadores = new int[j+1]; 

			boolean terminado = false;
			int contadorGanadores = 0;

			while(numeroCarta<=54)
			{
				if(juegoTerminado==false)
				{
					cartaSacada = sacarCarta(baraja);
					for(int i=1;i<=j;i++){
						jugadores.getJugador(i).getTabla().marcarCarta(cartaSacada);
					}
					numeroCarta++;
					imprimirTablas(jugadores);
				}

				if(terminado!=true)
				{
					for(int i = 1 ; i<=j;i++)
					{
						terminado = jugadores.getJugador(i).getTabla().haGanado();
						if(terminado==true)
							break;
					}
				}
				
				if(terminado==true)
				{
					juegoTerminado = true;
					for(int x = 1 ; x<=j;x++){

						boolean ganador = jugadores.getJugador(x).getTabla().haGanado();
						if(ganador==true)
						{
							ganadores[contadorGanadores] = jugadores.getJugador(x).getId();
							contadorGanadores++;
						}
					}
					numeroCarta = 100;
				}
				
			}
			System.out.println();
			System.out.println("Jugadores Ganadores");

			for(int i = 0; i<j; i++)
			{
				if(ganadores[i]==0)
				{

				}
				else
				{
					System.out.println("Jugador # "+ganadores[i]);
					System.out.println("");
				}
			}
		}		
	}

}