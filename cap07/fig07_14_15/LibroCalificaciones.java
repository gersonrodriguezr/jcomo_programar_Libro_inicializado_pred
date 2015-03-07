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

      // llama al m�todo obtenerPromedio para calcular la calificaci�n promedio      
      System.out.printf( "\nEl promedio de la clase es %.2f\n", obtenerPromedio() ); 

      // llama a los m�todos obtenerMinima y obtenerMaxima
      System.out.printf( "La calificacion mas baja es %d\nLa calificacion mas alta es %d\n\n",
         obtenerMinima(), obtenerMaxima() );

      // llama a imprimirGraficoBarras para imprimir el gr�fico de distribuci�n de calificaciones
      imprimirGraficoBarras();
   } // fin del m�todo procesarCalificaciones

   // busca la calificaci�n m�s baja
   public int obtenerMinima()
   { 
      int califBaja = calificaciones[ 0 ]; // asume que calificaciones[ 0 ] es la m�s baja

      // itera a trav�s del arreglo de calificaciones
      for ( int calificacion : calificaciones ) 
      {
         // si calificaci�n es menor que califBaja, se asigna a califBaja
         if ( calificacion < califBaja )
            califBaja = calificacion; // nueva calificaci�n m�s baja
      } // fin de for

      return califBaja; // devuelve la calificaci�n m�s baja
   } // fin del m�todo obtenerMinima

   // busca la calificaci�n m�s alta
   public int obtenerMaxima()
   { 
      int califAlta = calificaciones[ 0 ]; // asume que calificaciones[ 0 ] es la m�s alta

      // itera a trav�s del arreglo de calificaciones
      for ( int calificacion : calificaciones ) 
      {
         // si calificacion es mayor que califAlta, se asigna a califAlta
         if ( calificacion > califAlta )
            califAlta = calificacion; // nueva calificaci�n m�s alta
      } // fin de for

      return califAlta; // devuelve la calificaci�n m�s alta
   } // fin del m�todo obtenerMaxima

   // determina la calificaci�n promedio de la prueba
   public double obtenerPromedio()
   {      
      int total = 0; // inicializa el total
 
      // suma las calificaciones para un estudiante
      for ( int calificacion : calificaciones )
         total += calificacion;

      // devuelve el promedio de las calificaciones
      return (double) total / calificaciones.length;
   } // fin del m�todo obtenerPromedio

   // imprime grafico de barras que muestra la distribuci�n de las calificaciones
   public void imprimirGraficoBarras()
   {
      System.out.println( "Distribucion de calificaciones:" );

      // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
      int[] frecuencia = new int[ 11 ];
      
      // para cada calificaci�n, incrementa la frecuencia apropiada
      for ( int calificacion : calificaciones )
         ++frecuencia[ calificacion / 10 ];

      // para cada frecuencia de calificaci�n, imprime una barra en el gr�fico
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

         System.out.println(); // inicia una nueva l�nea de salida
      } // fin de for externo
   } // fin del m�todo imprimirGraficoBarras

   // imprime el contenido del arreglo de calificaciones
   public void imprimirCalificaciones()
   {    
      System.out.println( "Las calificaciones son:\n" );
      
      // imprime la calificaci�n de cada estudiante
      for ( int estudiante = 0; estudiante < calificaciones.length; estudiante++ ) 
         System.out.printf( "Estudiante %2d: %3d\n", 
            estudiante + 1, calificaciones[ estudiante ] );
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