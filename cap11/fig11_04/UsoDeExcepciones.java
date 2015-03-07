// Fig. 11.4: UsoDeExcepciones.java
// El mecanismo de manejo de excepciones try...catch...finally.

public class UsoDeExcepciones 
{
   public static void main( String[] args )
   {
      try 
      { 
         lanzaExcepcion(); //llama al método lanzaExcepcion
      } // fin de try
      catch ( Exception excepcion ) // excepción lanzada por lanzaExcepcion
      {
         System.err.println( "La excepcion se manejo en main" );
      } // fin de catch

      noLanzaExcepcion();
   } // fin de main

   // demuestra los bloques try...catch...finally
   public static void lanzaExcepcion() throws Exception
   {
      try // lanza una excepción y la atrapa de inmediato
      { 
         System.out.println( "Metodo lanzaExcepcion" );
         throw new Exception(); // genera la excepción
      } // fin de try
      catch ( Exception excepcion ) // atrapa la excepción lanzada en el bloque try
      {
         System.err.println(
            "La excepcion se manejo en el metodo lanzaExcepcion" );
         throw excepcion; // vuelve a lanzar para procesarla más adelante

         // no se llegaría al código que se coloque aquí; se producirían errores de compilación

      } // fin de catch
      finally // se ejecuta sin importar lo que ocurra en los bloques try...catch
      {
         System.err.println( "Se ejecuto finally en lanzaExcepcion" );
      } // fin de finally

      // no se llegaría al código que se coloque aquí; se producirían errores de compilación

   } // fin del método lanzaExcepcion

   // demuestra el uso de finally cuando no ocurre una excepción
   public static void noLanzaExcepcion()
   {
      try // el bloque try no lanza una excepción
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
   } // fin del método noLanzaExcepcion
} // fin de la clase UsoDeExcepciones

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