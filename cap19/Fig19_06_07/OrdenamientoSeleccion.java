// Fig 19.6: OrdenamientoSeleccion.java
// Clase que crea un arreglo lleno con enteros aleatorios.  
// Proporciona un método para ordenar el arreglo mediante el ordenamiento por selección.
import java.util.Arrays;
import java.util.Random;

public class OrdenamientoSeleccion
{
   private int[] datos; // arreglo de valores
   private static final Random generador = new Random();

   // crea un arreglo de un tamaño dado y lo llena con enteros aleatorios
   public OrdenamientoSeleccion( int tamanio )
   {
      datos = new int[ tamanio ]; // crea espacio para el arreglo

      // llena el arreglo con enteros aleatorios en el rango de 10 a 99
      for ( int i = 0; i < tamanio; i++ )
         datos[ i ] = 10 + generador.nextInt( 90 );
   } // fin del constructor de OrdenamientoSeleccion

   // ordena el arreglo usando el ordenamiento por selección
   public void ordenar()
   {
      int masPequenio; // índice del elemento más pequeño

      // itera a través de datos.length - 1 elementos
      for ( int i = 0; i < datos.length - 1; i++ )
      {
         masPequenio = i; // primer índice del resto del arreglo

         // itera para buscar el índice del elemento más pequeño
         for ( int indice = i + 1; indice < datos.length; indice++ )
            if ( datos[ indice ] < datos[ masPequenio ] )
               masPequenio = indice;

         intercambiar( i, masPequenio ); // intercambia el elemento más pequeño en la posición
         imprimirPasada( i + 1, masPequenio ); // imprime la pasada del algoritmo
      } // fin de for exterior
   } // fin del método ordenar

   // método ayudante para intercambiar los valores de dos elementos
   public void intercambiar( int primero, int segundo )
   {
      int temporal = datos[ primero ]; // almacena primero en temporal
      datos[ primero ] = datos[ segundo ]; // sustituye primero con segundo
      datos[ segundo ] = temporal; // coloca temporal en segundo
   } // fin del método intercambiar

   // imprime una pasada del algoritmo
   public void imprimirPasada( int pasada, int indice )
   {
      System.out.print( String.format( "despues de pasada %2d: ", pasada ) );

      // imprime elementos hasta el elemento seleccionado
      for ( int i = 0; i < indice; i++ )
         System.out.print( datos[ i ] + "  " );

      System.out.print( datos[ indice ] + "* " ); // indica intercambio

      // termina de imprmir el arreglo en pantalla
      for ( int i = indice + 1; i < datos.length; i++ )
         System.out.print( datos[ i ] + "  " );
     
      System.out.print( "\n                      " ); // para alineación

      // indica la cantidad del arreglo que está almacenada
      for( int j = 0; j < pasada; j++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // agrega fin de línea
   } // fin del método imprimirPasada

   // método para imprimir los valores del arreglo
   public String toString()
   {
      return Arrays.toString( datos );
   } // fin del método toString
} // fin de la clase OrdenamientoSeleccion


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