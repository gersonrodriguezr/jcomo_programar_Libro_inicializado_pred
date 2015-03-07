// Fig. 6.10: SobrecargaMetodos.java
// Declaraciones de métodos sobrecargados.

public class SobrecargaMetodos 
{
   // prueba los métodos cuadrado sobrecargados
   public static void main( String[] args )
   {
      System.out.printf( "El cuadrado del entero 7 es %d\n", cuadrado( 7 ) );
      System.out.printf( "El cuadrado del double 7.5 es %f\n", cuadrado( 7.5 ) );
   } // fin de main
   
   // método cuadrado con argumento int
   public static int cuadrado( int valorInt )
   {
      System.out.printf( "\nSe llamo a cuadrado con argumento int: %d\n", 
         valorInt );
      return valorInt * valorInt;
   } // fin del método cuadrado con argumento int

   // método cuadrado con argumento double
   public static double cuadrado( double valorDouble )
   {
      System.out.printf( "\nSe llamo a cuadrado con argumento double: %f\n",
         valorDouble );
      return valorDouble * valorDouble;
   } // fin del método cuadrado con argumento double
} // fin de la clase SobrecargaMetodos

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
