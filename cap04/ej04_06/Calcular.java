// Ejercicio 4.6: Calcular.java
// Calcula la suma de los enteros del 1 al 10 
public class Calcular 
{
   public static void main( String[] args )
   {
      int suma;
      int x;

      x = 1;   // inicializa x en 1 para contar
      suma = 0; // inicializa suma en 0 para el total

      while ( x <= 10 ) // mientras que x sea menor o igual que 10      
      {
         suma += x; // suma x a suma
         ++x; // incrementa x
      } // fin de while

      System.out.printf( "La suma es: %d\n", suma );
   } // fin de main
} // fin de la clase Calcular


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
