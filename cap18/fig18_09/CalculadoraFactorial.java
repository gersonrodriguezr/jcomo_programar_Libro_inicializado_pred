// Fig. 18.9: CalculadoraFactorial.java
// Método factorial iterativo.

public class CalculadoraFactorial
{
   // declaración recursiva del método factorial
   public static long factorial( long numero )
   {
      long resultado = 1;

      // declaración iterativa del método factorial
      for ( long i = numero; i >= 1; i-- )
         resultado *= i;

      return resultado;
   } // fin del método factorial

   // muestra los factoriales para los valores del 0 al 10
   public static void main( String[] args )
   {
      // calcula los factoriales del 0 al 10
      for ( int contador = 0; contador <= 10; contador++ )
         System.out.printf( "%d! = %d\n", contador, factorial( contador ) );
   } // fin de main
} // fin de la clase CalculadoraFactorial

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