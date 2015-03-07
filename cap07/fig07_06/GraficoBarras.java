// Fig. 7.6: GraficoBarras.java
// Programa para imprimir gr�ficos de barras.

public class GraficoBarras 
{
   public static void main( String[] args )
   {
      int[] arreglo = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

      System.out.println( "Distribucion de calificaciones:" ); 

      // para cada elemento del arreglo, imprime una barra del gr�fico
      for ( int contador = 0; contador < arreglo.length; contador++ ) 
      {
         // imprime etiqueta de la barra ( "00-09: ", ..., "90-99: ", "100: " )
         if ( contador == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               contador * 10, contador * 10 + 9  ); 
 
         // imprime barra de asteriscos
         for ( int estrellas = 0; estrellas < arreglo[ contador ]; estrellas++ )
            System.out.print( "*" );

         System.out.println(); // inicia una nueva l�nea de salida
      } // fin de for externo
   } // fin de main
} // fin de la clase GraficoBarras



/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/

