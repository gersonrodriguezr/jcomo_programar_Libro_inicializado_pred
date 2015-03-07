// Fig. 7.2: InicArreglo.java
// Inicialización de los elementos de un arreglo con valores predeterminados de cero.

public class InicArreglo 
{
   public static void main( String[] args )
   {
      int[] arreglo; // declara un arreglo con el mismo nombre

      arreglo = new int[ 10 ]; // crea el objeto arreglo
      
      System.out.printf( "%s%8s\n", "Indice", "Valor" ); // encabezados de columnas
   
      // imprime el valor de cada elemento del arreglo 
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
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/

