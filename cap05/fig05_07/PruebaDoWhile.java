// Fig. 5.7: PruebaDoWhile.java
// La instrucci�n de repetici�n do...while.

public class PruebaDoWhile 
{  
   public static void main( String[] args )
   {
      int contador = 1; // inicializa contador

      do 
      {
         System.out.printf( "%d  ", contador );
         ++contador;
      } while ( contador <= 10 ); // fin de do...while 

      System.out.println(); // imprime una nueva l�nea
   } // fin de main
} // fin de la clase PruebaDoWhile


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
