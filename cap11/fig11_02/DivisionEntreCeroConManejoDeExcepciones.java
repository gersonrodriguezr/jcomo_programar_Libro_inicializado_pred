// Fig. 11.2: DivisionEntreCeroConManejoDeExcepciones.java
// Manejo de excepciones ArithmeticException e InputMismatchException.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEntreCeroConManejoDeExcepciones
{
   // demuestra cómo se lanza una excepción cuando ocurre una división entre cero
   public static int cociente( int numerador, int denominador )
      throws ArithmeticException
   {
      return numerador / denominador; // posible división entre cero
   } // fin del método cociente

   public static void main( String[] args )
   {
      Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada
      boolean continuarCiclo = true; // determina si se necesitan más datos de entrada

      do
      {
         try // lee dos números y calcula el cociente
         {
            System.out.print( "Introduzca un numerador entero: " );
            int numerador = explorador.nextInt();
            System.out.print( "Introduzca un denominador entero: " );
            int denominador = explorador.nextInt();

            int resultado = cociente( numerador, denominador );
            System.out.printf( "\nResultado: %d / %d = %d\n", numerador,
               denominador, resultado );
            continuarCiclo = false; // entrada exitosa; termina el ciclo
         } // fin de bloque try
         catch ( InputMismatchException inputMismatchException )
         {
            System.err.printf( "\nExcepcion: %s\n",
               inputMismatchException );
            explorador.nextLine(); // descarta entrada para que el usuario intente otra vez
            System.out.println(
               "Debe introducir enteros. Intente de nuevo.\n" );
         } // fin de bloque catch
         catch ( ArithmeticException arithmeticException )
         {
            System.err.printf( "\nExcepcion: %s\n", arithmeticException );
            System.out.println(
               "Cero es un denominador invalido. Intente de nuevo.\n" );
         } // fin de catch
      } while ( continuarCiclo ); // fin de do...while
   } // fin de main
} // fin de la clase DivisionEntreCeroConManejoDeExcepciones


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