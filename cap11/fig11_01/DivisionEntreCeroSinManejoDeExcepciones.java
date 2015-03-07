// Fig. 11.1: DivisionEntreCeroSinManejoDeExcepciones.java
// División entre cero sin manejo de excepciones.
import java.util.Scanner;

public class DivisionEntreCeroSinManejoDeExcepciones
{
   // demuestra el lanzamiento de una excepción cuando ocurre una división entre cero
   public static int cociente( int numerador, int denominador )
   {
      return numerador / denominador; // posible división entre cero
   } // fin del método cociente

   public static void main( String[] args )
   {
      Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada

      System.out.print( "Introduzca un numerador entero: " );
      int numerador = explorador.nextInt();
      System.out.print( "Introduzca un denominador entero: " );
      int denominador = explorador.nextInt();

      int resultado = cociente( numerador, denominador );
      System.out.printf( 
         "\nResultado: %d / %d = %d\n", numerador, denominador, resultado );
   } // fin de main
} // fin de la clase DivisionEntreCeroSinManejoDeExcepciones


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