public class Persona
{
    //Modelado de persona

    //Nombre de la persona
    private String nombre;

    //Apellido  de la persona
    private String apellido;
    //Edad de la persona
    private int edad;
    //Genero de la persona
    private String genero;

    //Constructor sin argumentos
    public Persona()
    {

    }

    //Constructor con argumentos
    public Persona(String nombre, String apellido, int edad, String genero)
    {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setGenero(genero);
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getGenero()
    {
        return this.genero;
    }

}