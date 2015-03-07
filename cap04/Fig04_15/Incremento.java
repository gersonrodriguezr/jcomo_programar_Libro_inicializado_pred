// Fig. 4.15: Incremento.java
// Operadores de preincremento y postincremento.

public class Incremento 
{
   public static void main( String[] args )
   {
      int c;
   
      // demuestra el operador de postincremento
      c = 5; // asigna 5 a c
      System.out.println( c );   // imprime 5
      System.out.println( c++ ); // imprime 5, después postincrementa
      System.out.println( c );   // imprime 6

      System.out.println(); // omite una línea

      // demuestra el operador de preincremento
      c = 5; // asigna 5 a c
      System.out.println( c );   // imprime 5
      System.out.println( ++c ); // preincrementa y después imprime 6
      System.out.println( c );   // imprime 6
   } // fin de main
} // fin de la clase Incremento

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