// Fig. 18.5: CalculadoraFibonacci.java
// Método fibonacci recursivo.
import java.math.BigInteger;

public class CalculadoraFibonacci
{
   private static BigInteger DOS = BigInteger.valueOf( 2 );

   // declaración recursiva del método fibonacci
   public static BigInteger fibonacci( BigInteger numero )
   {
      if ( numero.equals( BigInteger.ZERO ) || 
           numero.equals( BigInteger.ONE ) ) // casos base
         return numero;
      else // paso recursivo
         return fibonacci( numero.subtract( BigInteger.ONE ) ).add(
            fibonacci( numero.subtract( DOS ) ) );
   } // fin del método fibonacci

   // muestra los valores de fibonacci del 0 al 40
   public static void main( String[] args)
   {
      for ( int contador = 0; contador <= 40; contador++ )
         System.out.printf( "Fibonacci de %d es: %d\n", contador,
            fibonacci( BigInteger.valueOf( contador ) ) );
   } // fin de main
} // fin de la clase CalculadoraFibonacci

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