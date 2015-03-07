// Fig. 3.8: PruebaLibroCalificaciones.java
// Crea y manipula un objeto LibroCalificaciones.
import java.util.Scanner; // el programa usa la clase Scanner

public class PruebaLibroCalificaciones
{
   // el m�todo main empieza la ejecuci�n del programa
   public static void main( String[] args )
   { 
      // crea un objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      // crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaciones
      LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(); 

      // muestra el valor inicial de nombreDelCurso
      System.out.printf( "El nombre inicial del curso es: %s\n\n",
         miLibroCalificaciones.obtenerNombreDelCurso() );

      // pide y recibe el nombre del curso
      System.out.println( "Escriba el nombre del curso:" );
      String elNombre = entrada.nextLine(); // lee una l�nea de texto
      miLibroCalificaciones.establecerNombreDelCurso( elNombre ); // establece el nombre del curso
      System.out.println(); // imprime una l�nea en blanco

      // muestra el mensaje de bienvenida despu�s de especificar el nombre del curso
      miLibroCalificaciones.mostrarMensaje();
   } // fin de main
} // fin de la clase PruebaLibroCalificaciones


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
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