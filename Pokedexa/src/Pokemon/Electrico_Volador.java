package Pokemon;

public class Electrico_Volador extends Pokemon implements IElectrico , IVolador{
	
	/**
     * Constructor COPIA
     * @param id
     * @param nombre
     * @param vidas
     * @param genero
     * @param rutaImagen
     */
    public Electrico_Volador (int id, String nombre,int nivel, int vidas, int evolucion ,String rutaImagen)
    {
    	super(id, nombre,nivel, vidas, evolucion, tipoElectrico + tipoVolador, rutaImagen);
    }
	/**
     * Constructor COPIA2
     * @param Pokemon
     */
    public Electrico_Volador(Pokemon poke)
    {
    	super(poke.getId(), poke.getNombre(),poke.getEvolucion(), tipoElectrico + tipoVolador, poke.getRutaImagen());
    	setVidasNivel(calcularNivel());
    }
    /**
     * Constructor DEFECTO
     * @param id
     * @param nombre
     * @param genero
     * @param tipo
     * @param rutaImagen
     */
    public Electrico_Volador (int id, String nombre, int evolucion , String tipo,String rutaImagen)
    {
    	super(id, nombre,evolucion , tipoElectrico + tipoVolador, rutaImagen);
    	setVidasNivel(calcularNivel());
    }
    
  
	
	/**
	 * Metodo abstracto entre las clases solo cambia el "tipo" las evoluciones quedan igual.
	 */
	protected int calcularNivel() 
	{
		return nivelElectrico+nivelVolador+nivelPrimeraEvolucion()+nivelSegundaEvolucion()+nivelTerceraEvolucion();
	}

}



