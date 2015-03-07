// Fig 19.2: ArregloLineal.java
// Clase que contiene un arreglo de enteros aleatorios y un método 
// que busca en ese arreglo, en forma secuencial.
import java.util.Random;
import java.util.Arrays;

public class ArregloLineal
{
   private int[] datos; // arreglo de valores
   private static final Random generador = new Random();

   // crea un arreglo de un tamaño dado, y lo rellena con enteros aleatorios
   public ArregloLineal( int tamanio )
   {
      datos = new int[ tamanio ]; // crea un espacio para el arreglo

      // llena el arreglo con valores int aleatorios, en el rango de 10 a 99
      for ( int i = 0; i < tamanio; i++ )
         datos[ i ] = 10 + generador.nextInt( 90 );
   } // fin del constructor de ArregloLineal

   // realiza una búsqueda lineal en los datos
   public int busquedaLineal( int claveBusqueda )
   {
      // itera a través del arreglo en forma secuencial
      for ( int indice = 0; indice < datos.length; indice++ )
         if ( datos[ indice ] == claveBusqueda )
            return indice; // devuelve el índice del entero

      return -1; // no se encontró el entero
   } // fin del método busquedaLineal

   // método para imprimir los valores del arreglo
   public String toString()
   {
      return Arrays.toString (datos );
   } // fin del método toString
} // fin de la clase ArregloLineal


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