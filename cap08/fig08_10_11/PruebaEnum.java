// Fig. 8.11: PruebaEnum.java
// Prueba del tipo enum Libro.
import java.util.EnumSet;

public class PruebaEnum 
{
   public static void main( String[] args ) 
   {
      System.out.println( "Todos los libros:\n" );

      // imprime todos los libros en enum Libro 
      for ( Libro libro : Libro.values() )                        
         System.out.printf( "%-10s%-45s%s\n", libro,
             libro.obtenerTitulo(), libro.obtenerAnioCopyright() );

      System.out.println( "\nMostrar un rango de constantes enum:\n" );
    
      // imprime los primeros cuatro libros 
      for ( Libro libro : EnumSet.range( Libro.JHTP, Libro.CPPHTP ) )
         System.out.printf( "%-10s%-45s%s\n", libro,
             libro.obtenerTitulo(), libro.obtenerAnioCopyright() );
   } // fin de main
} // fin de la clase PruebaEnum


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
