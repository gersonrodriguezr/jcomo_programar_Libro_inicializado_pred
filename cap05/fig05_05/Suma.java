// Fig. 5.5: Suma.java
// Sumar enteros con la instrucci�n for.

public class Suma 
{
   public static void main( String[] args )
   {
      int total = 0; // inicializa el total

      // total de los enteros pares del 2 al 20
      for ( int numero = 2; numero <= 20; numero += 2 )
         total += numero;

      System.out.printf( "La suma es %d\n", total ); // muestra los resultados
   } // fin de main
} // fin de la clase Suma


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
