// Fig. 5.18: OperadoresLogicos.java
// Los operadores lógicos.

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

      // crea tabla de verdad para el operador & (AND lógico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "AND logico booleano (&)", "false & false", ( false & false ),
         "false & true", ( false & true ),
         "true & false", ( true & false ),
         "true & true", ( true & true ) );

      // crea tabla de verdad para el operador | (OR inclusivo lógico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "OR inclusivo logico booleano (|)",
         "false | false", ( false | false ),
         "false | true", ( false | true ),
         "true | false", ( true | false ),
         "true | true", ( true | true ) );

      // crea tabla de verdad para el operador ^ (OR exclusivo lógico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "OR exclusivo logico booleano (^)", 
         "false ^ false", ( false ^ false ),
         "false ^ true", ( false ^ true ),
         "true ^ false", ( true ^ false ),
         "true ^ true", ( true ^ true ) );

      // crea tabla de verdad para el operador ! (negación lógica)
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
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/