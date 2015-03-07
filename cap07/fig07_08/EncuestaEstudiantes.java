// Fig. 7.8: EncuestaEstudiantes.java
// Programa de an�lisis de una encuesta.

public class EncuestaEstudiantes 
{
   public static void main( String[] args )
   {
      // arreglo de respuestas de estudiantes (lo m�s com�n es que se introduzcan en tiempo de ejecuci�n)
      int[] respuestas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 
           2, 3, 3, 2, 14 };
      int[] frecuencia = new int[ 6 ]; // arreglo de contadores de frecuencia

      // para cada respuesta, selecciona el elemento de respuestas y usa ese valor 
      // como �ndice de frecuencia para determinar el elemento a incrementar
      for ( int respuesta = 0; respuesta < respuestas.length; respuesta++ )
         {
            try
            {
                ++frecuencia[ respuestas[ respuesta ] ];
            }  // fin de try
            catch ( ArrayIndexOutOfBoundsException e )
   	    {
 	       System.out.println( e );
 	       System.out.printf( "   respuestas[%d] = %d\n\n",
	          respuesta, respuestas[ respuesta ] );
  	    } // fin de catch
       } // fin de for

       System.out.printf( "%s %10s\n", "Calificacion", "Frecuencia" );
   
       // imprime el valor de cada elemento del arreglo
       for ( int calificacion = 1; calificacion < frecuencia.length; calificacion++ )
          System.out.printf( "%6d %10d\n", calificacion, frecuencia[ calificacion ] );    
   } // fin de main
} // fin de la clase EncuestaEstudiantes


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
