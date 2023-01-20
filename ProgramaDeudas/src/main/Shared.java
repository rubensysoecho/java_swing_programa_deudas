package main;

import java.util.ArrayList;

public class Shared {

	private static ArrayList<Persona> listaPersonas;
	private static ArrayList<Deuda> listaDeudas;
	
	static	{
		listaPersonas = new ArrayList<Persona>();
		listaDeudas = new ArrayList<Deuda>();
		Persona persona = new Persona("Persona generica");
		listaPersonas.add(persona);
		listaDeudas.add(new Deuda(persona, "", 0));
	}
	
	public static void anhadirPersona(Persona persona)	{
		listaPersonas.add(persona);
	}
	
	public static void anhadirDeuda(Deuda deuda)	{
		listaDeudas.add(deuda);
	}
	
	public static int numPersonas()	{
		return listaPersonas.size();
	}
	
	public static int numDeudas()	{
		return listaDeudas.size();
	}
	
	public static Persona seleccionarPersona(int index)	{
		return listaPersonas.get(index);
	}
	
	public static Deuda seleccionarDeuda(int index)	{
		return listaDeudas.get(index);
	}
	
	public static ArrayList<Persona> devolverPersonas()	{
		return listaPersonas;
	}
	
	public static ArrayList<Deuda> devolverDeudas()	{
		return listaDeudas;
	}
	
}
