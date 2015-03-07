// Fig. 5.18: OperadoresLogicos.java
// Los operadores l�gicos.

public class OperadoresLogicos 
{
   public static void main( String[] args )
   {
      // crea tabla de verdad para el operador && (AND condicional)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "AND condicional (&&)", "false && false", ( false && false ),
         "false && true", ( false && true ), 
         "true && false", ( true && false ),
         "true && true", ( true && true ) );

      // crea tabla de verdad para el operador || (OR condicional)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "OR condicional (||)", "false || false", ( false || false ),
         "false || true", ( false || true ),
         "true || false", ( true || false ),
         "true || true", ( true || true ) );

      // crea tabla de verdad para el operador & (AND l�gico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "AND logico booleano (&)", "false & false", ( false & false ),
         "false & true", ( false & true ),
         "true & false", ( true & false ),
         "true & true", ( true & true ) );

      // crea tabla de verdad para el operador | (OR inclusivo l�gico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "OR inclusivo logico booleano (|)",
         "false | false", ( false | false ),
         "false | true", ( false | true ),
         "true | false", ( true | false ),
         "true | true", ( true | true ) );

      // crea tabla de verdad para el operador ^ (OR exclusivo l�gico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "OR exclusivo logico booleano (^)", 
         "false ^ false", ( false ^ false ),
         "false ^ true", ( false ^ true ),
         "true ^ false", ( true ^ false ),
         "true ^ true", ( true ^ true ) );

      // crea tabla de verdad para el operador ! (negaci�n l�gica)
      System.out.printf( "%s\n%s: %b\n%s: %b\n", "NOT logico (!)",
         "!false", ( !false ), "!true", ( !true ) );
   } // fin de main
} // fin de la clase OperadoresLogicos


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