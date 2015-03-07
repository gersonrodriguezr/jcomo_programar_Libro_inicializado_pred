// Fig. 7.22: ManipulacionesArreglos.java
// Métodos de la clase Arrays y System.arraycopy.
import java.util.Arrays;

public class ManipulacionesArreglos 
{
   public static void main( String[] args )
   {
      // ordena arregloDouble en forma ascendente
      double[] arregloDouble = { 8.4, 9.3, 0.2, 7.9, 3.4 };
      Arrays.sort( arregloDouble ); 
      System.out.printf( "\narregloDouble: " );

      for ( double valor : arregloDouble )
         System.out.printf( "%.1f ", valor );

      // llena arreglo de 10 elementos con 7
      int[] arregloIntLleno = new int[ 10 ]; 
      Arrays.fill( arregloIntLleno, 7 ); 
      mostrarArreglo( arregloIntLleno, "arregloIntLleno" );

      // copia el arreglo arregloInt en el arreglo copiaArregloInt
      int[] arregloInt = { 1, 2, 3, 4, 5, 6 };
      int[] copiaArregloInt = new int[ arregloInt.length ];
      System.arraycopy( arregloInt, 0, copiaArregloInt, 0, arregloInt.length );
      mostrarArreglo( arregloInt, "arregloInt" );
      mostrarArreglo( copiaArregloInt, "copiaArregloInt" );

      // compara si arregloInt y copiaArregloInt son iguales
      boolean b = Arrays.equals( arregloInt, copiaArregloInt );
      System.out.printf( "\n\narregloInt %s copiaArregloInt\n",
         ( b ? "==" : "!=" ) );

      // compara si arregloInt y arregloIntLleno son iguales
      b = Arrays.equals( arregloInt, arregloIntLleno );
      System.out.printf( "arregloInt %s arregloIntLleno\n", 
         ( b ? "==" : "!=" ) );

      // busca en arregloInt el valor 5
      int ubicacion = Arrays.binarySearch( arregloInt, 5 ); 
      
      if ( ubicacion >= 0 )
         System.out.printf( 
            "Se encontro 5 en el elemento %d de arregloInt\n", ubicacion ); 
      else
         System.out.println( "No se encontro el 5 en arregloInt" ); 

      // busca en arregloInt el valor 8763
      ubicacion = Arrays.binarySearch( arregloInt, 8763 );

      if ( ubicacion >= 0 )
         System.out.printf( 
            "Se encontro el 8763 en el elemento %d de arregloInt\n", ubicacion ); 
      else
         System.out.println( "No se encontro el 8763 en arregloInt" ); 
   } // fin de main

   // imprime los valores en cada arreglo
   public static void mostrarArreglo( int[] arreglo, String descripcion )
   {     
      System.out.printf( "\n%s: ", descripcion );

      for ( int valor : arreglo )
         System.out.printf( "%d ", valor );
   } // fin del método mostrarArreglo
} // fin de la clase ManipulacionesArreglos

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
