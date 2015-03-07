// Fig. 7.12: PruebaForMejorado.java
// Uso de la instrucci�n for mejorada para sumar el total de enteros en un arreglo.

public class PruebaForMejorado 
{
   public static void main( String[] args ) 
   {
      int[] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      int total = 0;

      // suma el valor de cada elemento al total
      for ( int numero : arreglo )
         total += numero;

      System.out.printf( "Total de elementos del arreglo: %d\n", total );
   } // fin de main
} // fin de la clase PruebaForMejorado

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

