// Fig. 7.18: LibroCalificaciones.java
// Clase LibroCalificaciones que utiliza un arreglo bidimensional para almacenar calificaciones.

public class LibroCalificaciones
{
   private String nombreDelCurso; // nombre del curso que representa este LibroCalificaciones
   private int[][] calificaciones; // arreglo bidimensional de calificaciones de estudiantes
   
   // el constructor con dos argumentos inicializa nombreDelCurso y el arreglo calificaciones
   public LibroCalificaciones( String nombre, int[][] arregloCalif )
   {
      nombreDelCurso = nombre; // inicializa nombreDelCurso
      calificaciones = arregloCalif; // almacena calificaciones
   } // fin del constructor de LibroCalificaciones con dos argumentos

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

   // realiza varias operaciones sobre los datos
   public void procesarCalificaciones()
   {
      // imprime el arreglo de calificaciones
      imprimirCalificaciones();

      // llama a los m�todos obtenerMinima y obtenerMaxima
      System.out.printf( "\n%s %d\n%s %d\n\n", 
         "La calificacion mas baja en el libro de calificaciones es", obtenerMinima(), 
         "La calificacion mas alta en el libro de calificaciones es", obtenerMaxima() );

      // imprime gr�fico de distribuci�n de todas las calificaciones para todas las pruebas
      imprimirGraficoBarras();
   } // fin del m�todo procesarCalificaciones

   // busca la calificaci�n m�s baja
   public int obtenerMinima()
   { 
      // asume que el primer elemento del arreglo calificaciones es el m�s bajo
      int califBaja = calificaciones[ 0 ][ 0 ];

      // itera a trav�s de las filas del arreglo calificaciones
      for ( int[] califEstudiantes : calificaciones ) 
      {
         // itera a trav�s de las columnas de la fila actual
         for ( int calificacion : califEstudiantes ) 
         {
            // si la calificaci�n es menor que califBaja, la asigna a califBaja
            if ( calificacion < califBaja )
               califBaja = calificacion;
         } // fin de for interior
      } // fin de for exterior

      return califBaja; // devuelve calificaci�n m�s baja
   } // fin del m�todo obtenerMinima

   // busca la calificaci�n m�s alta
   public int obtenerMaxima()
   { 
      // asume que el primer elemento del arreglo calificaciones es el m�s alto
      int califAlta = calificaciones[ 0 ][ 0 ];

      // itera a trav�s de las filas del arreglo calificaciones
      for ( int[] califEstudiantes : calificaciones ) 
      {
         // itera a trav�s de las columnas de la fila actual
         for ( int calificacion : califEstudiantes ) 
         {
            // si la calificaci�n es mayor que califAlta, la asigna a califAlta
            if ( calificacion > califAlta )
               califAlta = calificacion;
         } // fin de for interior
      } // fin de for exterior

      return califAlta; // devuelve la calificaci�n m�s alta
   } // fin del m�todo obtenerMaxima

   // determina la calificaci�n promedio para un conjunto espec�fico de calificaciones
   public double obtenerPromedio( int[] conjuntoDeCalif )
   {      
      int total = 0; // inicializa el total
 
      // suma las calificaciones para un estudiante
      for ( int calificacion : conjuntoDeCalif )
         total += calificacion;

      // devuelve el promedio de calificaciones
      return (double) total / conjuntoDeCalif.length;
   } // fin del m�todo obtenerPromedio

   // imprime gr�fico de barras que muestra la distribuci�n de calificaciones en general
   public void imprimirGraficoBarras()
   {
      System.out.println( "Distribucion de calificaciones en general:" );

      // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
      int[] frecuencia = new int[ 11 ];
      
      // para cada calificaci�n en LibroCalificaciones, incrementa la frecuencia apropiada
      for ( int[] califEstudiantes : calificaciones )
      {
         for ( int calificacion : califEstudiantes )
            ++frecuencia[ calificacion / 10 ];
      } // fin de for exterior
      
      // para cada frecuencia de calificaciones, imprime una barra en el gr�fico
      for ( int cuenta = 0; cuenta < frecuencia.length; cuenta++ )
      {
         // imprime etiquetas de las barras ( "00-09: ", ..., "90-99: ", "100: " )
         if ( cuenta == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               cuenta * 10, cuenta * 10 + 9  ); 
         
         // imprime barra de asteriscos
         for ( int estrellas = 0; estrellas < frecuencia[ cuenta ]; estrellas++ )
            System.out.print( "*" );

         System.out.println(); // inicia una nueva l�nea de salida
      } // fin de for exterior
   } // fin del m�todo imprimirGraficoBarras

   // imprime el contenido del arreglo calificaciones
   public void imprimirCalificaciones()
   {
      System.out.println( "Las calificaciones son:\n" );
      System.out.print( "            " ); // alinea encabezados de columnas

      // crea un encabezado de columna para cada una de las pruebas
      for ( int prueba = 0; prueba < calificaciones[ 0 ].length; prueba++ ) 
         System.out.printf( "Prueba %d  ", prueba + 1 );

      System.out.println( "Promedio" ); // encabezado de columna de promedio de estudiantes

      // crea filas/columnas de texto que representan el arreglo calificaciones
      for ( int estudiante = 0; estudiante < calificaciones.length; estudiante++ ) 
      {
         System.out.printf( "Estudiante %2d", estudiante + 1 );

         for ( int prueba : calificaciones[ estudiante ] ) // imprime calificaciones de estudiante
            System.out.printf( "%8d", prueba );

         // llama al m�todo obtenerPromedio para calcular la calificaci�n promedio del estudiante;
         // pasa fila de calificaciones como argumento para obtenerPromedio
         double promedio = obtenerPromedio( calificaciones[ estudiante ] );
         System.out.printf( "%9.2f\n", promedio );
      } // fin de for exterior
   } // fin del m�todo imprimirCalificaciones
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
