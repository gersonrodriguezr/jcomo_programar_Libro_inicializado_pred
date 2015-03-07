// Fig. 4.6: LibroCalificaciones.java
// La clase LibroCalificaciones que resuelve el problema del promedio 
// usando la repetici�n controlada por un contador.
import java.util.Scanner; // el programa utiliza la clase Scanner

public class LibroCalificaciones 
{
   private String nombreDelCurso; // el nombre del curso que representa este LibroCalificaciones

   // el constructor inicializa a nombreDelCurso
   public LibroCalificaciones( String nombre )
   {
      nombreDelCurso = nombre; // inicializa a nombreDelCurso
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

   // determina el promedio de la clase, con base en las 10 calificaciones introducidas por el usuario
   public void determinarPromedioClase() 
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int total; // suma de las calificaciones escritas por el usuario
      int contadorCalif; // n�mero de la siguiente calificaci�n a introducir
      int calificacion; // valor de la calificaci�n escrita por el usuario
      int promedio; // el promedio de las calificaciones

      // fase de inicializaci�n
      total = 0; // inicializa el total
      contadorCalif = 1; // inicializa el contador del ciclo
   
      // fase de procesamiento; utiliza la repetici�n controlada por contador
      while ( contadorCalif <= 10 ) // itera 10 veces
      {
         System.out.print( "Escriba la calificacion: " ); // indicador 
         calificacion = entrada.nextInt(); // lee calificaci�n del usuario
         total = total + calificacion; // suma calificaci�n a total
         contadorCalif = contadorCalif + 1; // incrementa contador en 1
      } // fin de while
   
      // fase de terminaci�n
      promedio = total / 10; // la divisi�n entera produce un resultado entero

      // muestra el total y el promedio de las calificaciones
      System.out.printf( "\nEl total de las 10 calificaciones es %d\n", total );
      System.out.printf( "El promedio de la clase es %d\n", promedio );
   } // fin del m�todo determinarPromedioClase
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
