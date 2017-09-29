public class Main


//Posibles bibliotecas

{
    //Declaración de variables



    //Mi método main
    public static void main(String[] args)
    {
        //Salida de consola
        System.out.println("Hola mundo!");

       //Instancia
        Persona persona = new Persona("Juancho", "Lopez", 25, "Masculino");

        //System.out.println(persona.getNombre());

        //&&, ||, >, <, ==, <=, >=, %, *, + , =, /,  !=, !

        int a = 0;
        int b = 3;
        Integer c = 0;

        //Imprimir una suma
        System.out.println(a + b);
        System.out.println("Hola suma: "+a + b);


        //Imprimir una conversión de tipo de dato (casteo (cast))
        //System.out.println(String.valueOf(a)+String.valueOf(b));
        //Error, son tipos primitivos
        //System.out.println(a.toString()+b.toString());
        //Con wrapper
        ///System.out.println(c.toString());

        /*Qué pasa si tratas de sumar un int con un float? */
        int x = 2;
        float y = 1.1f;
        System.err.println(x+y);
        //Error de tipo incompatible
        //int s = x+y;
        //System.err.println(s);
        //
        float s = x+y;
        System.err.println(s);
        

        /* */


    }
}