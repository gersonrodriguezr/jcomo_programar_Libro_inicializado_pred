// Fig. 7.17: InicArreglo.java
// Inicialización de arreglos bidimensionales.

public class InicArreglo 
{
   // crea e imprime arreglos bidimensionales
   public static void main( String args[] )
   {
      int[][] arreglo1 = { { 1, 2, 3 }, { 4, 5, 6 } };        
      int[][] arreglo2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } }; 

      System.out.println( "Los valores en arreglo1 por filas son" );
      imprimirArreglo( arreglo1 ); // muestra arreglo1 por filas
   
      System.out.println( "\nLos valores en arreglo2 por filas son" );
      imprimirArreglo( arreglo2 ); // muestra arreglo2 por filas
   } // fin de main

   // imprime filas y columnas de un arreglo bidimensional
   public static void imprimirArreglo( int[][] arreglo )
   {
      // itera a través de las filas del arreglo
      for ( int fila = 0; fila < arreglo.length; fila++ ) 
      {
         // itera a través de las columnas de la fila actual
         for ( int columna = 0; columna < arreglo[ fila ].length; columna++ )
            System.out.printf( "%d  ", arreglo[ fila ][ columna ] );

         System.out.println(); // inicia nueva línea de salida
      } // fin de for externo 
   } // fin del método imprimirArreglo
} // fin de la clase InicArreglo


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
