// Fig. 7.21: InicArreglo.java
// Uso de los argumentos de l�nea de comandos para inicializar un arreglo.

public class InicArreglo 
{
   public static void main( String[] args )
   {
      // comprueba el n�mero de argumentos de l�nea de comandos
      if ( args.length != 3 )
         System.out.println( 
            "Error: Vuelva a escribir el comando completo, incluyendo\n" + 
            "el tamanio del arreglo, el valor inicial y el incremento." );
      else
      {
         // obtiene el tama�o del arreglo del primer argumento de l�nea de comandos
         int longitudArreglo = Integer.parseInt( args[ 0 ] ); 
         int[] arreglo = new int[ longitudArreglo ]; // crea el arreglo

         // obtiene el valor inicial y el incremento de los argumentos de l�nea de comandos
         int valorInicial = Integer.parseInt( args[ 1 ] );
         int incremento = Integer.parseInt( args[ 2 ] );

         // calcula el valor para cada elemento del arreglo
         for ( int contador = 0; contador < arreglo.length; contador++ )
            arreglo[ contador ] = valorInicial + incremento * contador;

         System.out.printf( "%s%8s\n", "Indice", "Valor" );
         
         // muestra el �ndice y el valor del arreglo
         for ( int contador = 0; contador < arreglo.length; contador++ )
            System.out.printf( "%5d%8d\n", contador, arreglo[ contador ] );
      } // fin de else
   } // fin de main
} // fin de la clase InicArreglo


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
