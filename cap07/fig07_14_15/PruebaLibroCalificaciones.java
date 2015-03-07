// Fig. 7.15: PruebaLibroCalificaciones.java
// Crea objeto LibroCalificaciones, usando un arreglo de calificaciones,
// y después invoca al método procesarCalificaciones para analizarlas.
public class PruebaLibroCalificaciones
{ 
   // el método main comienza la ejecución del programa
   public static void main( String[] args )
   {
      // arreglo de calificaciones de estudiantes
      int[] arregloCalif = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      
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
