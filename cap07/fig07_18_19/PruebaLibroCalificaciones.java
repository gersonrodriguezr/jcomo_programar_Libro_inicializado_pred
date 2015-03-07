// Fig. 7.19: PruebaLibroCalificaciones.java
// PruebaLibroCalificaciones crea un objeto LibroCalificaciones, usando un arreglo bidimensional
// de calificaciones, y después invoca al método procesarCalificaciones para analizarlas 
public class PruebaLibroCalificaciones
{
   // el método main comienza la ejecución del programa
   public static void main( String[] args )
   {
      // arreglo bidimensional de calificaciones de estudiantes
      int[][] arregloCalif = { { 87, 96, 70 },
                               { 68, 87, 90 },
                               { 94, 100, 90 },
                               { 100, 81, 82 },
                               { 83, 65, 85 },
                               { 78, 87, 65 },
                               { 85, 75, 83 }, 
                               { 91, 94, 100 },
                               { 76, 72, 84 },
                               { 87, 93, 73 } };
      
      LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones( 
         "CS101 Introduccion a la programacion en Java", arregloCalif );
      miLibroCalificaciones.mostrarMensaje();
      miLibroCalificaciones.procesarCalificaciones();
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
