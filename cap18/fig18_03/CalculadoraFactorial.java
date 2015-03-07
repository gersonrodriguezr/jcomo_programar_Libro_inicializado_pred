// Fig. 18.3: CalculadoraFactorial.java
// Método factorial recursivo.

public class CalculadoraFactorial
{
   // método factorial recursivo (asume que su parámetro es >= 0)
   public static long factorial( long numero )
   {
      if ( numero <= 1 ) // evalúa el caso base
         return 1; // casos base: 0! = 1 y 1! = 1
      else // paso recursivo
         return numero * factorial( numero - 1 );
   } // fin del método factorial

   // imprime factoriales para los valores del 0 al 21
   public static void main( String[] args )
   {
      // calcula los factoriales del 0 al 21
      for ( int contador = 0; contador <= 21; contador++ )
         System.out.printf( "%d! = %d\n", contador, factorial( contador ) );
   } // fin de main
} // fin de la clase CalculadoraFactorial

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