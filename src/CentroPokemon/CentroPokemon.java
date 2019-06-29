package CentroPokemon;


import java.util.ArrayList;

import ManejadorExcepciones.ExcepcionGenerica;
import Pokemon.*;
import Usuario.Usuario;

public class CentroPokemon 
{
	Usuario usuario;
	boolean compuerta;
	
	
	public CentroPokemon(Usuario usuario)
	{
		this.usuario =usuario;
		this.compuerta = true;
	}
	

	public String mostrarPokemonsDaņados() throws ExcepcionGenerica
	{
		ArrayList <Pokemon> pokemonsDaņados = usuario.getPokemonsDaņados();
		
		String daņados = "";
		
		for(Pokemon daņado : pokemonsDaņados)
		{
			daņados = daņado + "\n" +  daņado.toString();
		}
		
		return daņados;
	}
	
	// devuelve false si ya se curaron los pokemon, asi la compuerta se cierra, true si no se curaron, asi la compuerta sigue abierta.
	public boolean curarPokemonsDaņados() throws ExcepcionGenerica
	{
		boolean rta=false;
		
		if(usuario.restaurarVidas(usuario.getPokemonsDaņados()));
		
		else rta=true;
		
		return rta;
	}
	
	
	
	
}
