// Fig 19.9: PruebaOrdenamientoInsercion.java
// Prueba de la clase de ordenamiento por inserción.

public class PruebaOrdenamientoInsercion
{
   public static void main( String[] args )
   {
      // crea objeto para realizar el ordenamiento por inserción
      OrdenamientoInsercion arregloOrden = new OrdenamientoInsercion( 10 );
      
      System.out.println( "Arreglo desordenado:" );
      System.out.println( arregloOrden ); // imprime el arreglo desordenado

      arregloOrden.sort(); // ordena el arreglo

      System.out.println( "Arreglo ordenado:" );
      System.out.println( arregloOrden ); // imprime el arreglo ordenado
   } // fin de main
} // fin de la clase PruebaOrdenamientoInsercion


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