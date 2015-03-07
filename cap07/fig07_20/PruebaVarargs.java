// Fig. 7.20: PruebaVarargs.java
// Uso de listas de argumentos de longitud variable.

public class PruebaVarargs 
{
   // calcula el promedio
   public static double promedio( double... numeros )
   {
      double total = 0.0; // inicializa el total

      // calcula el total usando la instrucción for mejorada
      for ( double d : numeros )
         total += d;

      return total / numeros.length;
   } // fin del método promedio

   public static void main( String[] args ) 
   {
      double d1 = 10.0;
      double d2 = 20.0;
      double d3 = 30.0;
      double d4 = 40.0;

      System.out.printf( "d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",
         d1, d2, d3, d4 );

      System.out.printf( "El promedio de d1 y d2 es %.1f\n", 
         promedio( d1, d2 ) ); 
      System.out.printf( "El promedio de d1, d2 y d3 es %.1f\n", 
         promedio( d1, d2, d3 ) );
      System.out.printf( "El promedio de d1, d2, d3 y d4 es %.1f\n", 
         promedio( d1, d2, d3, d4 ) );
   } // fin de main
} // fin de la clase PruebaVarargs


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
