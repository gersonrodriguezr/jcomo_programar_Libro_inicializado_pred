// Fig 19.8: OrdenamientoInsercion.java
// Clase que crea un arreglo lleno de enteros aleatorios.  
// Proporciona un método para ordenar el arreglo mediante el ordenamiento por inserción.
import java.util.Arrays;
import java.util.Random;

public class OrdenamientoInsercion
{
   private int[] datos; // arreglo de valores
   private static Random generador = new Random();

   // crea un arreglo de un tamaño dado y lo llena con enteros aleatorios
   public OrdenamientoInsercion( int tamanio )
   {
      datos = new int[ tamanio ]; // crea espacio para el arreglo

      // llena el arreglo con enteros aleatorios en el rango de 10 a 99
      for ( int i = 0; i < tamanio; i++ )
         datos[ i ] = 10 + generador.nextInt( 90 );
   } // fin del constructor de OrdenamientoInsercion

   // ordena el arreglo usando el ordenamiento por inserción
   public void sort()
   {
      int insercion; // variable temporal para contener el elemento a insertar

      // itera a través de datos.length - 1 elementos
      for ( int siguiente = 1; siguiente < datos.length; siguiente++ )
      {
         // almacena el valor en el elemento actual
         insercion = datos[ siguiente ]; 

         // inicializa ubicación para colocar el elemento
         int moverElemento = siguiente; 

         // busca un lugar para colocar el elemento actual
         while ( moverElemento > 0 && datos[ moverElemento - 1 ] > insercion )
         {
            // desplaza el elemento una posición a la derecha
            datos[ moverElemento ] = datos[ moverElemento - 1 ];
            moverElemento--;
         } // fin de while

         datos[ moverElemento ] = insercion; // coloca el elemento insertado
         imprimirPasada( siguiente, moverElemento ); // imprime la pasada del algoritmo
      } // fin de for
   } // fin del método ordenar

   // imprime una pasada del algoritmo
   public void imprimirPasada( int pasada, int indice )
   {
      System.out.print( String.format( "despues de pasada %2d: ", pasada ) );

      // imprime los elementos hasta el elemento intercambiado
      for ( int i = 0; i < indice; i++ )
         System.out.print( datos[ i ] + "  " );

      System.out.print( datos[ indice ] + "* " ); // indica intercambio

      // termina de imprimir el arreglo en pantalla
      for ( int i = indice + 1; i < datos.length; i++ )
         System.out.print( datos[ i ] + "  " );
     
      System.out.print( "\n                      " ); // para alineación

      // indica la cantidad del arreglo que está ordenado
      for( int i = 0; i <= pasada; i++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // agrega fin de línea
   } // fin del método imprimirPasada

   // método para mostrar los valores del arreglo en pantalla
   public String toString()
   {
      return Arrays.toString( datos );
   } // fin del método toString
} // fin de la clase OrdenamientoInsercion


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