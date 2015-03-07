// Fig. 4.6: LibroCalificaciones.java
// La clase LibroCalificaciones que resuelve el problema del promedio 
// usando la repetición controlada por un contador.
import java.util.Scanner; // el programa utiliza la clase Scanner

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

   // determina el promedio de la clase, con base en las 10 calificaciones introducidas por el usuario
   public void determinarPromedioClase() 
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int total; // suma de las calificaciones escritas por el usuario
      int contadorCalif; // número de la siguiente calificación a introducir
      int calificacion; // valor de la calificación escrita por el usuario
      int promedio; // el promedio de las calificaciones

      // fase de inicialización
      total = 0; // inicializa el total
      contadorCalif = 1; // inicializa el contador del ciclo
   
      // fase de procesamiento; utiliza la repetición controlada por contador
      while ( contadorCalif <= 10 ) // itera 10 veces
      {
         System.out.print( "Escriba la calificacion: " ); // indicador 
         calificacion = entrada.nextInt(); // lee calificación del usuario
         total = total + calificacion; // suma calificación a total
         contadorCalif = contadorCalif + 1; // incrementa contador en 1
      } // fin de while
   
      // fase de terminación
      promedio = total / 10; // la división entera produce un resultado entero

      // muestra el total y el promedio de las calificaciones
      System.out.printf( "\nEl total de las 10 calificaciones es %d\n", total );
      System.out.printf( "El promedio de la clase es %d\n", promedio );
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
