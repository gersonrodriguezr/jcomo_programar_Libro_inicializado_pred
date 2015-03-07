// Fig. 5.12: PruebaBreak.java
// La instrucci�n break para salir de una instrucci�n for.
public class PruebaBreak 
{
   public static void main( String[] args )
   {
      int cuenta; // la variable de control tambi�n se usa cuando termina el ciclo
      
      for ( cuenta = 1; cuenta <= 10; cuenta++ ) // itera 10 veces
      {  
         if ( cuenta == 5 ) // si cuenta es 5, 
            break;         // termina el ciclo

         System.out.printf( "%d ", cuenta );
      } // fin de for

      System.out.printf( "\nSalio del ciclo en cuenta = %d\n", cuenta );
   } // fin de main
} // fin de la clase PruebaBreak


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