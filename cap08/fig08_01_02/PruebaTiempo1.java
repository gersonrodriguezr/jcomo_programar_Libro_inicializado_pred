// Fig. 8.2: PruebaTiempo1.java
// Objeto Tiempo1 utilizado en una aplicación.

public class PruebaTiempo1 
{
   public static void main( String[] args )
   {
      // crea e inicializa un objeto Tiempo1
      Tiempo1 tiempo = new Tiempo1(); // invoca el constructor de Tiempo1

      // imprime representaciones de cadena del tiempo
      System.out.print( "La hora universal inicial es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar inicial es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una línea en blanco

      // modifica el tiempo e imprime el tiempo actualizado
      tiempo.establecerTiempo( 13, 27, 6 ); 
      System.out.print( "La hora universal despues de establecerTiempo es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar despues de establecerTiempo es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una línea en blanco

      // intenta establecer el tiempo con valores inválidos 
      try
      {
         tiempo.establecerTiempo( 99, 99, 99 ); // todos los valores fuera de rango
      } // fin de try
      catch (IllegalArgumentException e)
      {
         System.out.printf( "Excepcion: %s\n\n", e.getMessage() );
      } // fin de catch

      // muestra el tiempo después de tratar de establecer valores inválidos
      System.out.println( "Despues de intentar ajustes invalidos:" );
      System.out.print( "Hora universal: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "Hora estandar: " );
      System.out.println( tiempo.toString() );
   } // fin de main
} // fin de la clase PruebaTiempo1


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