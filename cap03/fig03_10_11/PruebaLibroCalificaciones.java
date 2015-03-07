// Fig. 3.11: PruebaLibroCalificaciones.java
// El constructor de LibroCalificaciones se utiliza para especificar el
// nombre del curso cada vez que se crea cada objeto LibroCalificaciones.

public class PruebaLibroCalificaciones
{
   // el método main empieza la ejecución del programa
   public static void main( String[] args )
   { 
      // crea objeto LibroCalificaciones
      LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones( 
         "CS101 Introduccion a la programacion en Java" ); 
      LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones( 
         "CS102 Estructuras de datos en Java" );

      // muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones
      System.out.printf( "El nombre del curso de libroCalificaciones1 es: %s\n",
         libroCalificaciones1.obtenerNombreDelCurso() );
      System.out.printf( "El nombre del curso de libroCalificaciones2 es: %s\n",
         libroCalificaciones2.obtenerNombreDelCurso() );
   } // fin de main
} // fin de la clase PruebaLibroCalificaciones


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
