// Fig. 4.9: LibroCalificaciones.java
// La clase LibroCalificaciones resuelve el problema del promedio de la clase 
// usando la repetición controlada por un centinela.
import java.util.Scanner; // el programa usa la clase Scanner

public class LibroCalificaciones 
{
   private String nombreDelCurso; // el nombre del curso que representa este LibroCalificaciones

   // el constructor inicializa a nombreDelCurso
   public LibroCalificaciones( String nombre )
   {
      nombreDelCurso = nombre; // inicializa a nombreDelCurso
   } // fin del constructor

   // método para establecer el nombre del curso
   public void establecerNombreDelCurso( String nombre )
   {
      nombreDelCurso = nombre; // almacena el nombre del curso
   } // fin del método establecerNombreDelCurso

   // método para obtener el nombre del curso
   public String obtenerNombreDelCurso()
   {
      return nombreDelCurso;
   } // fin del método obtenerNombreDelCurso

   // muestra un mensaje de bienvenida al usuario de LibroCalificaciones
   public void mostrarMensaje()
   {
      // obtenerNombreDelCurso obtiene el nombre del curso
      System.out.printf( "Bienvenido al libro de calificaciones para\n%s!\n\n", 
         obtenerNombreDelCurso() );
   } // fin del método mostrarMensaje

   // determina el promedio de un número arbitrario de calificaciones
   public void determinarPromedioClase()
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int total; // suma de las calificaciones
      int contadorCalif; // número de calificaciones introducidas
      int calificacion; // valor de calificación
      double promedio; // número con punto decimal para el promedio

      // fase de inicialización
      total = 0; // inicializa el total
      contadorCalif = 0; // inicializa el contador del ciclo
      
      // fase de procesamiento
      // pide entrada y lee calificación del usuario
      System.out.print( "Escriba calificacion o -1 para terminar: " ); 
      calificacion = entrada.nextInt(); 

      // itera hasta leer el valor centinela del usuario
      while ( calificacion != -1 ) 
      {
         total = total + calificacion; // suma calificacion al total
         contadorCalif = contadorCalif + 1; // incrementa el contador

         // pide entrada y lee siguiente calificación del usuario
         System.out.print( "Escriba calificacion o -1 para terminar: " ); 
         calificacion = entrada.nextInt(); 
      } // fin de while

      // fase de terminación
      // si el usuario introdujo por lo menos una calificación...
      if ( contadorCalif != 0 ) 
      {
         // calcula el promedio de todas las calificaciones introducidas
         promedio = (double) total / contadorCalif;  

         // muestra el total y el promedio (con dos dígitos de precisión)
         System.out.printf( "\nEl total de las %d calificaciones introducidas es %d\n", 
            contadorCalif, total );
         System.out.printf( "El promedio de la clase es %.2f\n", promedio ); 
      } // fin de if
      else // no se introdujeron calificaciones, por lo que se imprime el mensaje apropiado
         System.out.println( "No se introdujeron calificaciones" ); 
   } // fin del método determinarPromedioClase
} // fin de la clase LibroCalificaciones

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
