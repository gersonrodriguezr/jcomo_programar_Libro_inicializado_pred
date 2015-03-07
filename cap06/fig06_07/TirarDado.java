// Fig. 6.7: TirarDado.java
// Tirar un dado de seis lados 6,000,000 veces.
import java.util.Random;

public class TirarDado 
{
   public static void main( String[] args )
   {
      Random numerosAleatorios = new Random(); // generador de n�meros aleatorios

      int frecuencia1 = 0; // cuenta de veces que se tir� 1
      int frecuencia2 = 0; // cuenta de veces que se tir� 2
      int frecuencia3 = 0; // cuenta de veces que se tir� 3
      int frecuencia4 = 0; // cuenta de veces que se tir� 4
      int frecuencia5 = 0; // cuenta de veces que se tir� 5
      int frecuencia6 = 0; // cuenta de veces que se tir� 6

      int cara; // almacena el valor que se tir� m�s recientemente
   
      // sintetiza los resultados de tirar un dado 6,000,000 veces
      for ( int tiro = 1; tiro <= 6000; tiro++ ) 
      {
         cara = 1 + numerosAleatorios.nextInt( 6 ); // n�mero del 1 al 6
   
         // determina el valor del tiro de 1 a 6 e incrementa el contador apropiado
         switch ( cara ) 
         {   
            case 1:
               ++frecuencia1; // incrementa el contador de 1s
               break; 
            case 2:
               ++frecuencia2; // incrementa el contador de 2s
               break;
            case 3:
               ++frecuencia3; // incrementa el contador de 3s
               break;
            case 4:
               ++frecuencia4; // incrementa el contador de 4s
               break;
            case 5:
               ++frecuencia5; // incrementa el contador de 5s
               break;
            case 6:
               ++frecuencia6; // incrementa el contador de 6s
               break; // opcional al final del switch
         } // fin de switch
      } // fin de for

      System.out.println( "Cara\tFrecuencia" ); // encabezados de salida
      System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
         frecuencia1, frecuencia2, frecuencia3, frecuencia4,
         frecuencia5, frecuencia6 );
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
