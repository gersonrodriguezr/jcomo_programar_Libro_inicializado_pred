// Ejercicio 4.16: Misterio.java
public class Misterio 
{
   public static void main( String[] args )
   {
      int y;
      int x = 1;
      int total = 0;

      while ( x <= 10 ) 
      {
         y = x * x;
         System.out.println( y );
         total += y;
         ++x;
      } // end while

      System.out.printf( "El total es %d\n", total );
   } // fin de main
} // fin de la clase Misterio


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