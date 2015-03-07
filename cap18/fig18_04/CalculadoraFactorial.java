// Fig. 18.4: CalculadoraFactorial.java
// M�todo factorial recursivo.
import java.math.BigInteger;

public class CalculadoraFactorial
{
   // m�todo factorial recursivo (asume que su par�metro es >= 0)
   public static BigInteger factorial( BigInteger numero )
   {
      if ( numero.compareTo( BigInteger.ONE) <= 0 ) // eval�a el caso base
         return BigInteger.ONE; // casos base: 0! = 1 y 1! = 1
      else // paso recursivo
         return numero.multiply( 
	    factorial( numero.subtract( BigInteger.ONE) ) );
   } // fin del m�todo factorial

   // imprime factoriales para los valores del 0 al 50
   public static void main( String[] args )
   {
      // calcula los factoriales del 0 al 50
      for ( int contador = 0; contador <= 50; contador++ )
         System.out.printf( "%d! = %d\n", contador,         
            factorial( BigInteger.valueOf( contador ) ) );
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