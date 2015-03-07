// Fig. 11.5: UsoDeExcepciones.java
// Limpieza de la pila y obtenci�n de datos de un objeto excepci�n.

public class UsoDeExcepciones 
{
   public static void main( String[] args )
   {
      try 
      { 
         metodo1(); // llama a metodo1 
      } // fin de try
      catch ( Exception excepcion ) // atrapa la excepci�n lanzada en metodo1
      { 
         System.err.printf( "%s\n\n", excepcion.getMessage() );
         excepcion.printStackTrace(); // imprime el rastreo de la pila de la excepci�n

         // obtiene la informaci�n de rastreo de la pila
         StackTraceElement[] elementosRastreo = excepcion.getStackTrace();
         
         System.out.println( "\nRastreo de la pila de getStackTrace:" );
         System.out.println( "Clase\t\t\tArchivo\t\t\tLinea\tMetodo" );

         // itera a trav�s de elementosRastreo para obtener la descripci�n de la excepci�n
         for ( StackTraceElement elemento : elementosRastreo ) 
         {
            System.out.printf( "%s\t", elemento.getClassName() );
            System.out.printf( "%s\t", elemento.getFileName() );
            System.out.printf( "%s\t", elemento.getLineNumber() );
            System.out.printf( "%s\n", elemento.getMethodName() );
         } // fin de for
      } // fin de catch
   } // fin de main

   // llama a metodo2; lanza las excepciones de vuelta a main
   public static void metodo1() throws Exception
   {
      metodo2();
   } // fin del m�todo metodo1

   // llama a metodo3; lanza las excepciones de vuelta a metodo1
   public static void metodo2() throws Exception
   {
      metodo3();
   } // fin del m�todo metodo2

   // lanza la excepci�n Exception de vuelta a metodo2
   public static void metodo3() throws Exception
   {
      throw new Exception( "La excepcion se lanzo en metodo3" );
   } // fin del m�todo metodo3
} // fin de la clase UsoDeExcepciones

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