// Fig. 8.6: PruebaTiempo2.java
// Uso de constructores sobrecargados para inicializar objetos Tiempo2.

public class PruebaTiempo2 
{
   public static void main( String[] args )
   {
      Tiempo2 t1 = new Tiempo2();             // 00:00:00
      Tiempo2 t2 = new Tiempo2( 2 );          // 02:00:00
      Tiempo2 t3 = new Tiempo2( 21, 34 );     // 21:34:00
      Tiempo2 t4 = new Tiempo2( 12, 25, 42 ); // 12:25:42
      Tiempo2 t5 = new Tiempo2( t4 );         // 12:25:42
      
      System.out.println( "Se construyo con:" );
      System.out.println( "t1: todos los argumentos predeterminados" );
      System.out.printf( "   %s\n", t1.aStringUniversal() );
      System.out.printf( "   %s\n", t1.toString() );

      System.out.println( 
         "t2: se especifico hora; minuto y segundo predeterminados" );
      System.out.printf( "   %s\n", t2.aStringUniversal() );
      System.out.printf( "   %s\n", t2.toString() );

      System.out.println( 
         "t3: se especificaron hora y minuto; segundo predeterminado" );
      System.out.printf( "   %s\n", t3.aStringUniversal() );
      System.out.printf( "   %s\n", t3.toString() );

      System.out.println( "t4: se especificaron hora, minuto y segundo" );
      System.out.printf( "   %s\n", t4.aStringUniversal() );
      System.out.printf( "   %s\n", t4.toString() );

      System.out.println( "t5: se especifico el objeto Tiempo2 llamado t4" );
      System.out.printf( "   %s\n", t5.aStringUniversal() );
      System.out.printf( "   %s\n", t5.toString() );

      // intento de inicializar t6 con valores inv�lidos
      try
      {
         Tiempo2 t6 = new Tiempo2( 27, 74, 99); // valores inv�lidos
      } // fin de try
      catch ( IllegalArgumentException e )
      {
         System.out.printf( "\nExcepcion al inicializar t6: %s\n",
            e.getMessage() );
      } // fin de catch
   } // fin de main
} // fin de la clase PruebaTiempo2


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
