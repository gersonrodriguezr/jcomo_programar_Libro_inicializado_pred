// Fig. 6.9: Alcance.java
// La clase Alcance demuestra los alcances de los campos y las variables locales.

public class Alcance
{
   // campo accesible para todos los métodos de esta clase 
   private static int x = 1; 

   // el método main crea e inicializa la variable local x
   // y llama a los métodos usarVariableLocal y usarCampo
   public static void main( String[] args )
   {
      int x = 5; // la variable local x del método oculta al campo x

      System.out.printf( "la x local en main es %d\n", x );

      usarVariableLocal(); // usarVariableLocal tiene la x local
      usarCampo(); // usarCampo usa el campo x de la clase Alcance
      usarVariableLocal(); // usarVariableLocal reinicia a la x local
      usarCampo(); // el campo x de la clase Alcance retiene su valor

      System.out.printf( "\nla x local main es %d\n", x );
   } // fin de main

   // crea e inicializa la variable local x durante cada llamada
   public static void usarVariableLocal()
   {
      int x = 25; // se inicializa cada vez que se llama a usarVariableLocal

      System.out.printf( 
         "\nla x local al entrar al metodo usarVariableLocal es %d\n", x );
      ++x; // modifica la variable x local de este método
      System.out.printf( 
         "la x local antes de salir del metodo usarVariableLocal es %d\n", x );
   } // fin del método usarVariableLocal

   // modifica el campo x de la clase Alcance durante cada llamada
   public static void usarCampo()
   {
      System.out.printf( 
         "\nel campo x al entrar al metodo usarCampo es %d\n", x );
      x *= 10; // modifica el campo x de la clase Alcance
      System.out.printf( 
         "el campo x antes de salir del metodo usarCampo es %d\n", x );
   } // fin del método usarCampo
} // fin de la clase Alcance

/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
