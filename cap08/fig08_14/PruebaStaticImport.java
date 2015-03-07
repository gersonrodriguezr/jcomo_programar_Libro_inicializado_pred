// Fig. 8.14: PruebaStaticImport.java
// Uso de static import para importar métodos de la clase Math.
import static java.lang.Math.*;

public class PruebaStaticImport 
{
   public static void main( String[] args ) 
   {
      System.out.printf( "sqrt( 900.0 ) = %.1f\n", sqrt( 900.0 ) );
      System.out.printf( "ceil( -9.8 ) = %.1f\n", ceil( -9.8 ) );
      System.out.printf( "E = %f\n", E );
      System.out.printf( "PI = %f\n", PI );
   } // fin de main
} // fin de la clase PruebaStaticImport


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
