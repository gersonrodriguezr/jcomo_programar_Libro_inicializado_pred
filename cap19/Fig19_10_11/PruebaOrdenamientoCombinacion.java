// Figura 19.11: PruebaOrdenamientoCombinacion.java
// Prueba de la clase de ordenamiento por combinación.

public class PruebaOrdenamientoCombinacion
{
   public static void main( String[] args )
   {
      // crea un objeto para realizar el ordenamiento por combinación
      OrdenamientoCombinacion arregloOrden = new OrdenamientoCombinacion( 10 );

      // imprime el arreglo desordenado
      System.out.println( "Desordenado:" + arregloOrden + "\n" );

      arregloOrden.ordenar(); // ordena el arreglo

      // imprime el arreglo ordenado
      System.out.println( "Ordenado:   " + arregloOrden );
   } // fin de main
} // fin de la clase PruebaOrdenamientoCombinacion


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