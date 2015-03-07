// Fig. 7.3: InicArreglo.java
// Inicializaci�n de los elementos de un arreglo con un inicializador de arreglo.

public class InicArreglo 
{
   public static void main( String[] args )
   {
      // la lista inicializadora especifica el valor para cada elemento
      int[] arreglo = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

      System.out.printf( "%s%8s\n", "Indice", "Valor" ); // encabezados de columnas
   
      // imprime el valor del elemento de cada arreglo 
      for ( int contador = 0; contador < arreglo.length; contador++ )
         System.out.printf( "%5d%8d\n", contador, arreglo[ contador ] );
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
