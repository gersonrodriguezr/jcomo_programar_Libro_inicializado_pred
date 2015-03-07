// Ejercicio 4.26. Misterio3.java
public class Misterio3 
{
   public static void main( String[] args )
   {
      int fila = 10;
      int columna;

      while ( fila >= 1 ) 
      {
         columna = 1;

         while ( columna <= 10 ) 
         {
            System.out.print( fila % 2 == 1 ? "<" : ">" );
            ++columna;
         } // fin de while

         --fila;
         System.out.println();
      } // fin de while
   } // fin de main
} // fin de la clase Misterio3



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