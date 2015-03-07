// Fig 19.4: ArregloBinario.java
// Clase que contiene un arreglo de enteros aleatorios y un método 
// que utiliza la búsqueda binaria para encontrar un entero.
import java.util.Random;
import java.util.Arrays;

public class ArregloBinario
{
   private int[] datos; // arreglo de valores
   private static final Random generador = new Random();

   // crea un arreglo de un tamaño dado y lo llena con enteros aleatorios
   public ArregloBinario( int tamanio )
   {
      datos = new int[ tamanio ]; // crea espacio para el arreglo

      // llena el arreglo con enteros aleatorios en el rango de 10 a 99
      for ( int i = 0; i < tamanio; i++ )
         datos[ i ] = 10 + generador.nextInt( 90 );

      Arrays.sort( datos );
   } // fin del constructor de ArregloBinario

   // realiza una búsqueda binaria en los datos
   public int busquedaBinaria( int elementoBusqueda )
   {
      int inferior = 0; // extremo inferior del área de búsqueda
      int superior = datos.length - 1; // extremo superior del área de búsqueda
      int medio = ( inferior + superior + 1 ) / 2; // elemento medio
      int ubicacion = -1; // devuelve el valor; -1 si no lo encontró

      do // ciclo para buscar un elemento
      {
         // imprime el resto de los elementos del arreglo
         System.out.print( elementosRestantes( inferior, superior ) );

         // imprime espacios para alineación
         for ( int i = 0; i < medio; i++ )
            System.out.print( "   " );
         System.out.println( " * " ); // indica el elemento medio actual

         // si el elemento se encuentra en medio
         if ( elementoBusqueda == datos[ medio ] )
            ubicacion = medio; // la ubicación es el elemento medio actual

         // el elemento medio es demasiado alto
         else if ( elementoBusqueda < datos[ medio ] )
            superior = medio - 1; // elimina la mitad superior
         else // el elemento medio es demasiado bajo
            inferior = medio + 1; // elimina la mitad inferior

         medio = ( inferior + superior + 1 ) / 2; // recalcula el elemento medio
      } while ( ( inferior <= superior ) && ( ubicacion == -1 ) );

      return ubicacion; // devuelve la ubicación de la clave de búsqueda
   } // fin del método busquedaBinaria

   // método para imprimir ciertos valores en el arreglo
   public String elementosRestantes( int inferior, int superior )
   {
      StringBuilder temporal = new StringBuilder();

      // imprime espacios para alineación
      for ( int i = 0; i < inferior; i++ )
         temporal.append( "   " );

      // imprime los elementos que quedan en el arreglo
      for ( int i = inferior; i <= superior; i++ )
         temporal.append( datos[ i ] + " " );

      temporal.append( "\n" );
      return temporal.toString();
   } // fin del método elementosRestantes

   // método para imprimir los valores en el arreglo
   public String toString()
   {
      return elementosRestantes( 0, datos.length - 1 );
   } // fin del método toString   
} // fin de la clase ArregloBinario


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