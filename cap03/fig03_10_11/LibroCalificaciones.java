// Fig. 3.10: LibroCalificaciones.java
// La clase LibroCalificaciones con un constructor para inicializar el nombre del curso.

public class LibroCalificaciones
{
   private String nombreDelCurso; // nombre del curso para este LibroCalificaciones

   // el constructor inicializa nombreDelCurso con un argumento String
   public LibroCalificaciones( String nombre ) // el nombre del constructor es el nombre de la clase
   {
      nombreDelCurso = nombre; // inicializa nombreDelCurso
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
      // esta instrucción llama a obtenerNombreDelCurso para obtener el 
      // nombre del curso que este LibroCalificaciones representa
      System.out.printf( "Bienvenido al Libro de calificaciones para\n%s!\n", 
         obtenerNombreDelCurso() );
   } // fin del método mostrarMensaje
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
