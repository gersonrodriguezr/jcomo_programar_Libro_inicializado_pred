// Fig. 3.5: PruebaLibroCalificaciones.java
// Crea un objeto LibroCalificaciones y pasa un objeto String  
// a su método mostrarMensaje.
import java.util.Scanner; // el programa usa la clase Scanner

public class PruebaLibroCalificaciones
{
   // el método main empieza la ejecución del programa
   public static void main( String args[] )
   { 
      // crea un objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      // crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaciones
      LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(); 

      // pide y recibe el nombre del curso como entrada
      System.out.println( "Escriba el nombre del curso:" );
      String nombreDelCurso = entrada.nextLine(); // lee una línea de texto
      System.out.println(); // imprime una línea en blanco

      // llama al método mostrarMensaje de miLibroCalificaciones 
      // y pasa nombreDelCurso como argumento
      miLibroCalificaciones.mostrarMensaje( nombreDelCurso );
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