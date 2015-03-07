// Fig. 5.7: PruebaDoWhile.java
// La instrucción de repetición do...while.

public class PruebaDoWhile 
{  
   public static void main( String[] args )
   {
      int contador = 1; // inicializa contador

      do 
      {
         System.out.printf( "%d  ", contador );
         ++contador;
      } while ( contador <= 10 ); // fin de do...while 

      System.out.println(); // imprime una nueva línea
   } // fin de main
} // fin de la clase PruebaDoWhile


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
