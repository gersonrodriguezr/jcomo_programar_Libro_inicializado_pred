// Fig. 7.7: TirarDado.java
// Programa para tirar dados que utiliza arreglos en vez de switch.
import java.util.Random;

public class TirarDado 
{
   public static void main( String[] args )
   {
      Random numerosAleatorios = new Random(); // generador de n�meros aleatorios
      int[] frecuencia = new int[ 7 ]; // arreglo de contadores de frecuencia

      // tira el dado 6,000,000 veces; usa el valor del dado como �ndice de frecuencia
      for ( int tiro = 1; tiro <= 6000000; tiro++ ) 
         ++frecuencia[ 1 + numerosAleatorios.nextInt( 6 ) ];  

      System.out.printf( "%s%10s\n", "Cara ", "Frecuencia" );
   
      // imprime el valor de cada elemento del arreglo
      for ( int cara = 1; cara < frecuencia.length; cara++ )
         System.out.printf( "%4d %10d\n", cara, frecuencia[ cara ] );
   } // fin de main
} // fin de la clase TirarDado



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
