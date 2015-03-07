// Ejercicio 6.6: Esfera.java
// Calcula el volumen de una esfera.
import java.util.Scanner;

public class Esfera
{
   // obtiene el radio del usuario y muestra el volumen de la esfera
   public static void main( String[] args )
   {
      Scanner entrada = new Scanner( System.in );

      System.out.print( "Escriba el radio de la esfera: " );
      double radio = entrada.nextDouble();

      System.out.printf( "El volumen es %f\n", volumenEsfera( radio ) );
   } // fin de main

   // calcula y devuelve el volumen de una esfera
   public static double volumenEsfera( double radio )
   {
      double volumen = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radio, 3 );
      return volumen;
   } // fin del m�todo volumenEsfera
} // fin de la clase Esfera

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
