// Fig. 6.10: SobrecargaMetodos.java
// Declaraciones de m�todos sobrecargados.

public class SobrecargaMetodos 
{
   // prueba los m�todos cuadrado sobrecargados
   public static void main( String[] args )
   {
      System.out.printf( "El cuadrado del entero 7 es %d\n", cuadrado( 7 ) );
      System.out.printf( "El cuadrado del double 7.5 es %f\n", cuadrado( 7.5 ) );
   } // fin de main
   
   // m�todo cuadrado con argumento int
   public static int cuadrado( int valorInt )
   {
      System.out.printf( "\nSe llamo a cuadrado con argumento int: %d\n", 
         valorInt );
      return valorInt * valorInt;
   } // fin del m�todo cuadrado con argumento int

   // m�todo cuadrado con argumento double
   public static double cuadrado( double valorDouble )
   {
      System.out.printf( "\nSe llamo a cuadrado con argumento double: %f\n",
         valorDouble );
      return valorDouble * valorDouble;
   } // fin del m�todo cuadrado con argumento double
} // fin de la clase SobrecargaMetodos

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
