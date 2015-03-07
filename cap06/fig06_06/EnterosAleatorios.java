// Fig. 6.6: EnterosAleatorios.java
// Enteros aleatorios desplazados y escalados.
import java.util.Random; // el programa usa la clase Random

public class EnterosAleatorios 
{
   public static void main( String[] args )
   {      
      Random numerosAleatorios = new Random(); // generador de números aleatorios
      int cara; // almacena cada entero aleatorio generado

      // itera 20 times
      for ( int contador = 1; contador <= 20; contador++ ) 
      {
         // elige entero aleatorio del 1 al 6
         cara = 1 + numerosAleatorios.nextInt( 6 );

         System.out.printf( "%d  ", cara ); // muestra el valor generado
         
         // si contador es divisible entre 5, empieza una nueva línea de salida
         if ( contador % 5 == 0 )
            System.out.println();
      } // fin de for
   } // fin de main
} // fin de la clase EnterosAleatorios


/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/

