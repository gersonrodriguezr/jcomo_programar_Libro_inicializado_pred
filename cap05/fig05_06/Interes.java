// Fig. 5.6: Interes.java
// C�lculo del inter�s compuesto con for.

public class Interes 
{
   public static void main( String[] args )
   {
      double monto; // monto depositado al final de cada a�o
      double principal = 1000.0; // monto inicial antes de los intereses
      double tasa = 0.05; // tasa de inter�s

      // muestra los encabezados
      System.out.printf( "%s%20s\n", "Anio", "Monto en deposito" );

      // calcula el monto en dep�sito para cada uno de diez a�os
      for ( int anio = 1; anio <= 10; anio++ ) 
      {
         // calcula el nuevo monto para el a�o especificado
         monto = principal * Math.pow( 1.0 + tasa, anio );

         // muestra el a�o y el monto
         System.out.printf( "%4d%,20.2f\n", anio, monto );
      } // fin de for
   } // fin de main
} // fin de la clase Interes


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