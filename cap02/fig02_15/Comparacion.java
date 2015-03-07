// Fig. 2.15: COmparacion.java
// Compara enteros utilizando instrucciones if, operadores relacionales  
// y de igualdad.
import java.util.Scanner; // el programa utiliza la clase Scanner

public class Comparacion 
{
   // el método main empieza la ejecución de la aplicación en Java
   public static void main( String[] args )
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int numero1; // primer número a comparar
      int numero2; // segundo número a comparar

      System.out.print( "Escriba el primer entero: " ); // indicador 
      numero1 = entrada.nextInt(); // lee el primer número del usuario

      System.out.print( "Escriba el segundo entero: " ); // indicador 
      numero2 = entrada.nextInt(); // lee el segundo número del usuario 
      
      if ( numero1 == numero2 ) 
         System.out.printf( "%d == %d\n", numero1, numero2 );

      if ( numero1 != numero2 )
         System.out.printf( "%d != %d\n", numero1, numero2 );

      if ( numero1 < numero2 )
         System.out.printf( "%d < %d\n", numero1, numero2 );

      if ( numero1 > numero2 )
         System.out.printf( "%d > %d\n", numero1, numero2 );

      if ( numero1 <= numero2 )
         System.out.printf( "%d <= %d\n", numero1, numero2 );

      if ( numero1 >= numero2 )
         System.out.printf( "%d >= %d\n", numero1, numero2 );
   } // fin del método main
} // fin de la clase Comparacion


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