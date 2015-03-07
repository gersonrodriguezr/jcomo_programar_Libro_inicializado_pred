// Fig. 11.7: PruebaAssert.java
// Comprobar mediante assert que un valor est� dentro del rango
import java.util.Scanner;

public class PruebaAssert
{
   public static void main( String[] args )
   {
      Scanner entrada = new Scanner( System.in );
      
      System.out.print( "Escriba un numero entre 0 y 10: " );
      int numero = entrada.nextInt();
      
      // asegura que el valor sea >= 0 y <= 10
      assert ( numero >= 0 && numero <= 10 ) : "numero incorrecto: " + numero;
      
      System.out.printf( "Usted escribio %d\n", numero );
   } // fin de main
} // fin de la clase PruebaAssert

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