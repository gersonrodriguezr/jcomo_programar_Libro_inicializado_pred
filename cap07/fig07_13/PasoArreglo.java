// Fig. 7.13: PasoArreglo.java
// Paso de arreglos y elementos individuales de un arreglo a los métodos.

public class PasoArreglo 
{
   // main crea el arreglo y llama a modificarArreglo y a modificarElemento
   public static void main( String[] args )
   {
      int[] arreglo = { 1, 2, 3, 4, 5 };
      
      System.out.println( 
         "Efectos de pasar una referencia a un arreglo completo:\n" +
         "Los valores del arreglo original son:" );

      // imprime los elementos originales del arreglo 
      for ( int valor : arreglo )
         System.out.printf( "   %d", valor );
   
      modificarArreglo( arreglo ); // pasa la referencia al arreglo
      System.out.println( "\n\nLos valores del arreglo modificado son:" );

      // imprime los elementos modificados del arreglo 
      for ( int valor : arreglo )
         System.out.printf( "   %d", valor );
   
      System.out.printf( 
         "\n\nEfectos de pasar el valor de un elemento del arreglo:\n" +
         "arreglo[3] antes de modificarElemento: %d\n", arreglo[ 3 ] );
   
      modificarElemento( arreglo[ 3 ] ); // intento por modificar arreglo[ 3 ]
      System.out.printf( 
         "arreglo[3] despues de modificarElemento: %d\n", arreglo[ 3 ] );
   } // fin de main
   
   // multiplica cada elemento de un arreglo por 2 
   public static void modificarArreglo( int[] arreglo2 )
   {
      for ( int contador = 0; contador < arreglo2.length; contador++ )
         arreglo2[ contador ] *= 2;
   } // fin del método modificarArreglo
   
   // multiplica el argumento por 2
   public static void modificarElemento( int elemento )
   {
      elemento *= 2;
      System.out.printf( 
         "Valor del elemento en modificarElemento: %d\n", elemento );
   } // fin del método modificarElemento  
} // fin de la clase PasoArreglo


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
