// Fig. 11.4: UsoDeExcepciones.java
// El mecanismo de manejo de excepciones try...catch...finally.

public class UsoDeExcepciones 
{
   public static void main( String[] args )
   {
      try 
      { 
         lanzaExcepcion(); //llama al m�todo lanzaExcepcion
      } // fin de try
      catch ( Exception excepcion ) // excepci�n lanzada por lanzaExcepcion
      {
         System.err.println( "La excepcion se manejo en main" );
      } // fin de catch

      noLanzaExcepcion();
   } // fin de main

   // demuestra los bloques try...catch...finally
   public static void lanzaExcepcion() throws Exception
   {
      try // lanza una excepci�n y la atrapa de inmediato
      { 
         System.out.println( "Metodo lanzaExcepcion" );
         throw new Exception(); // genera la excepci�n
      } // fin de try
      catch ( Exception excepcion ) // atrapa la excepci�n lanzada en el bloque try
      {
         System.err.println(
            "La excepcion se manejo en el metodo lanzaExcepcion" );
         throw excepcion; // vuelve a lanzar para procesarla m�s adelante

         // no se llegar�a al c�digo que se coloque aqu�; se producir�an errores de compilaci�n

      } // fin de catch
      finally // se ejecuta sin importar lo que ocurra en los bloques try...catch
      {
         System.err.println( "Se ejecuto finally en lanzaExcepcion" );
      } // fin de finally

      // no se llegar�a al c�digo que se coloque aqu�; se producir�an errores de compilaci�n

   } // fin del m�todo lanzaExcepcion

   // demuestra el uso de finally cuando no ocurre una excepci�n
   public static void noLanzaExcepcion()
   {
      try // el bloque try no lanza una excepci�n
      { 
         System.out.println( "Metodo noLanzaExcepcion" );
      } // fin de try
      catch ( Exception excepcion ) // no se ejecuta
      {
         System.err.println( excepcion );
      } // fin de catch
      finally // se ejecuta sin importar lo que ocurra en los bloques try...catch
      {
         System.err.println( 
            "Se ejecuto Finally en noLanzaExcepcion" );
      } // fin de bloque finally

      System.out.println( "Fin del metodo noLanzaExcepcion" );
   } // fin del m�todo noLanzaExcepcion
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