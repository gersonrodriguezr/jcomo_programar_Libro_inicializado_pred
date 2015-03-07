// Fig. 18.9: CalculadoraFactorial.java
// M�todo factorial iterativo.

public class CalculadoraFactorial
{
   // declaraci�n recursiva del m�todo factorial
   public static long factorial( long numero )
   {
      long resultado = 1;

      // declaraci�n iterativa del m�todo factorial
      for ( long i = numero; i >= 1; i-- )
         resultado *= i;

      return resultado;
   } // fin del m�todo factorial

   // muestra los factoriales para los valores del 0 al 10
   public static void main( String[] args )
   {
      // calcula los factoriales del 0 al 10
      for ( int contador = 0; contador <= 10; contador++ )
         System.out.printf( "%d! = %d\n", contador, factorial( contador ) );
   } // fin de main
} // fin de la clase CalculadoraFactorial

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