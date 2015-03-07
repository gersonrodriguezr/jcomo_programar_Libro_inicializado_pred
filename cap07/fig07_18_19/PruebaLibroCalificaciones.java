// Fig. 7.19: PruebaLibroCalificaciones.java
// PruebaLibroCalificaciones crea un objeto LibroCalificaciones, usando un arreglo bidimensional
// de calificaciones, y despu�s invoca al m�todo procesarCalificaciones para analizarlas 
public class PruebaLibroCalificaciones
{
   // el m�todo main comienza la ejecuci�n del programa
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
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
