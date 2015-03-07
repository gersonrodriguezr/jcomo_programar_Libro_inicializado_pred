// Fig. 7.14: LibroCalificaciones.java
// Libro de calificaciones que utiliza un arreglo para almacenar las calificaciones de una prueba.

public class LibroCalificaciones
{
   private String nombreDelCurso; // nombre del curso que representa este LibroCalificaciones
   private int[] calificaciones; // arreglo de calificaciones de estudiantes
   
   // el constructor de dos argumentos inicializa nombreDelCurso y el arreglo calificaciones
   public LibroCalificaciones( String nombre, int[] arregloCalif )
   {
      nombreDelCurso = nombre; // inicializa nombreDelCurso
      calificaciones = arregloCalif; // almacena las calificaciones
   } // fin del constructor de LibroCalificaciones con dos argumentos

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

   // realiza varias operaciones sobre los datos
   public void procesarCalificaciones()
   {
      // imprime el arreglo de calificaciones
      imprimirCalificaciones();

      // llama al método obtenerPromedio para calcular la calificación promedio      
      System.out.printf( "\nEl promedio de la clase es %.2f\n", obtenerPromedio() ); 

      // llama a los métodos obtenerMinima y obtenerMaxima
      System.out.printf( "La calificacion mas baja es %d\nLa calificacion mas alta es %d\n\n",
         obtenerMinima(), obtenerMaxima() );

      // llama a imprimirGraficoBarras para imprimir el gráfico de distribución de calificaciones
      imprimirGraficoBarras();
   } // fin del método procesarCalificaciones

   // busca la calificación más baja
   public int obtenerMinima()
   { 
      int califBaja = calificaciones[ 0 ]; // asume que calificaciones[ 0 ] es la más baja

      // itera a través del arreglo de calificaciones
      for ( int calificacion : calificaciones ) 
      {
         // si calificación es menor que califBaja, se asigna a califBaja
         if ( calificacion < califBaja )
            califBaja = calificacion; // nueva calificación más baja
      } // fin de for

      return califBaja; // devuelve la calificación más baja
   } // fin del método obtenerMinima

   // busca la calificación más alta
   public int obtenerMaxima()
   { 
      int califAlta = calificaciones[ 0 ]; // asume que calificaciones[ 0 ] es la más alta

      // itera a través del arreglo de calificaciones
      for ( int calificacion : calificaciones ) 
      {
         // si calificacion es mayor que califAlta, se asigna a califAlta
         if ( calificacion > califAlta )
            califAlta = calificacion; // nueva calificación más alta
      } // fin de for

      return califAlta; // devuelve la calificación más alta
   } // fin del método obtenerMaxima

   // determina la calificación promedio de la prueba
   public double obtenerPromedio()
   {      
      int total = 0; // inicializa el total
 
      // suma las calificaciones para un estudiante
      for ( int calificacion : calificaciones )
         total += calificacion;

      // devuelve el promedio de las calificaciones
      return (double) total / calificaciones.length;
   } // fin del método obtenerPromedio

   // imprime grafico de barras que muestra la distribución de las calificaciones
   public void imprimirGraficoBarras()
   {
      System.out.println( "Distribucion de calificaciones:" );

      // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
      int[] frecuencia = new int[ 11 ];
      
      // para cada calificación, incrementa la frecuencia apropiada
      for ( int calificacion : calificaciones )
         ++frecuencia[ calificacion / 10 ];

      // para cada frecuencia de calificación, imprime una barra en el gráfico
      for ( int cuenta = 0; cuenta < frecuencia.length; cuenta++ )
      {
         // imprime etiqueta de barra ( "00-09: ", ..., "90-99: ", "100: " )
         if ( cuenta == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               cuenta * 10, cuenta * 10 + 9  ); 
         
         // imprime barra de asteriscos
         for ( int estrellas = 0; estrellas < frecuencia[ cuenta ]; estrellas++ )
            System.out.print( "*" );

         System.out.println(); // inicia una nueva línea de salida
      } // fin de for externo
   } // fin del método imprimirGraficoBarras

   // imprime el contenido del arreglo de calificaciones
   public void imprimirCalificaciones()
   {    
      System.out.println( "Las calificaciones son:\n" );
      
      // imprime la calificación de cada estudiante
      for ( int estudiante = 0; estudiante < calificaciones.length; estudiante++ ) 
         System.out.printf( "Estudiante %2d: %3d\n", 
            estudiante + 1, calificaciones[ estudiante ] );
   } // fin del método imprimirCalificaciones
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