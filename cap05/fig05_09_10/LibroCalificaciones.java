// Fig. 5.9: LibroCalificaciones.java
// La clase LibroCalificaciones usa la instrucci�n switch para contar las calificaciones de letras.
import java.util.Scanner; // el programa usa la clase Scanner

public class LibroCalificaciones 
{
   private String nombreDelCurso; // nombre del curso que representa este LibroCalificaciones
   // las variables de instancia int se inicializan en 0 de manera predeterminada
   private int total; // suma de las calificaciones
   private int contadorCalif; // n�mero de calificaciones introducidas
   private int aCuenta; // cuenta de calificaciones A
   private int bCuenta; // cuenta de calificaciones B
   private int cCuenta; // cuenta de calificaciones C
   private int dCuenta; // cuenta de calificaciones D
   private int fCuenta; // cuenta de calificaciones F
   
   // el constructor inicializa nombreDelCurso; 
   public LibroCalificaciones( String nombre )
   {
      nombreDelCurso = nombre; // inicializa nombreDelCurso
   } // fin del constructor

   // m�todo para establecer el nombre del curso
   public void establecerNombreDelCurso( String nombre )
   {
      nombreDelCurso = nombre; // almacena el nombre del curso
   } // fin del m�todo establecerNombreDelCurso

   // m�todo para obtener el nombre del curso
   public String obtenerNombreDelCurso()
   {
      return nombreDelCurso;
   } // fin del m�todo obtenerNombreDelCurso

   // muestra un mensaje de bienvenida al usuario de LibroCalificaciones
   public void mostrarMensaje()
   {
      // obtenerNombreDelCurso obtiene el nombre del curso
      System.out.printf( "Bienvenido al libro de calificaciones para\n%s!\n\n", 
         obtenerNombreDelCurso() );
   } // fin del m�todo mostrarMensaje

   // introduce un n�mero arbitrario de calificaciones del usuario
   public void introducirCalif()
   {
      Scanner entrada = new Scanner( System.in );

      int calificacion; // calificaci�n introducida por el usuario

      System.out.printf( "%s\n%s\n   %s\n   %s\n", 
         "Escriba las calificaciones enteras en el rango de 0 a 100.", 
         "Escriba el indicador de fin de archivo para terminar la entrada:", 
         "En UNIX/Linux/Mac OS X escriba <Ctrl> d y despues oprima Intro",
         "En Windows escriba <Ctrl> z y despues oprima Intro" );

      // itera hasta que el usuario introduzca el indicador de fin de archivo
      while ( entrada.hasNext() ) 
      {
         calificacion = entrada.nextInt(); // lee calificacion
         total += calificacion; // suma calificacion a total
         ++contadorCalif; // incrementa el n�mero de calificaciones
         
         // llama al m�todo para incrementar el contador apropiado
         incrementarContadorCalifLetra( calificacion );
      } // fin de while 
   } // fin del m�todo introducirCalif

   // suma 1 al contador apropiado para la calificaci�n especificada
   private void incrementarContadorCalifLetra( int calificacion )
   {
      // determina cu�l calificaci�n se introdujo
      switch ( calificacion / 10 )
      {  
         case 9:  // calificacion est� entre 90
         case 10: // y 100, inclusive 
            ++aCuenta; // incrementa aCuenta
            break; // necesaria para salir del switch

         case 8: // calificacion est� entre 80 y 89
            ++bCuenta; // incrementa bCuenta    
            break; // sale del switch

         case 7: // calificacion est� entre0 70 y 79
            ++cCuenta; // incrementa cCuenta    
            break; // sale del switch

         case 6: // calificacion est� entre 60 y 69
            ++dCuenta; // incrementa dCuenta    
            break; // sale del switch

         default: // calificacion es menor que 60
            ++fCuenta; // incrementa fCuenta    
            break; // opcional; de todas formas sale del switch
      } // fin de switch
   } // fin del m�todo incrementarContadorCalifLetra

   // muestra un reporte con base en las calificaciones introducidas por el usuario 
   public void mostrarReporteCalif()
   {
      System.out.println( "\nReporte de calificaciones:" );

      // si el usuario introdujo por lo menos una calificaci�n...
      if ( contadorCalif != 0 ) 
      {
         // calcula el promedio de todas las calificaciones introducidas
         double promedio = (double) total / contadorCalif;  

         // imprime resumen de resultados
         System.out.printf( "El total de las %d calificaciones introducidas es %d\n", 
            contadorCalif, total );
         System.out.printf( "El promedio de la clase es %.2f\n", promedio );
         System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
            "Numero de estudiantes que recibieron cada calificacion:", 
            "A: ", aCuenta,   // muestra el n�mero de calificaciones A
            "B: ", bCuenta,   // muestra el n�mero de calificaciones B
            "C: ", cCuenta,   // muestra el n�mero de calificaciones C 
            "D: ", dCuenta,   // muestra el n�mero de calificaciones D
            "F: ", fCuenta ); // muestra el n�mero de calificaciones F
      } // fin de if
      else // no se introdujeron calificaciones, por lo que imprime el mensaje apropiado
         System.out.println( "No se introdujeron calificaciones" );
   } // fin del m�todo mostrarReporteCalif
} // fin de la clase LibroCalificaciones


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

