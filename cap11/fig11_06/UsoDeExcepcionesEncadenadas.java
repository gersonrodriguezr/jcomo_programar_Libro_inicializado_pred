// Fig. 11.6: UsoDeExcepcionesEncadenadas.java
// Las excepciones encadenadas.

public class UsoDeExcepcionesEncadenadas
{
   public static void main( String[] args )
   {
      try 
      { 
         metodo1(); // llama a metodo1
      } // fin de try
      catch ( Exception excepcion ) // excepciones lanzadas desde metodo1
      { 
         excepcion.printStackTrace();
      } // fin de catch
   } // fin de main

   // llama a metodo2; lanza las excepciones de vuelta a main
   public static void metodo1() throws Exception
   {
      try 
      { 
         metodo2(); // llama a metodo2
      } // fin de try
      catch ( Exception excepcion ) // excepción lanzada desde metodo2
      {
         throw new Exception( "La excepcion se lanzo en metodo1", excepcion );
      } // fin de catch
   } // fin del método metodo1

   // llama a metodo3; lanza las excepciones de vuelta a metodo1
   public static void metodo2() throws Exception
   {
      try 
      { 
         metodo3(); // llama a metodo3
      } // fin de try
      catch ( Exception excepcion ) // excepción lanzada desde metodo3
      {
         throw new Exception( "La excepcion se lanzo en metodo2", excepcion );
      } // fin de catch
   } // fin del método metodo2

   // lanza excepción Exception de vuelta a metodo2
   public static void metodo3() throws Exception
   {
      throw new Exception( "La excepcion se lanzo en metodo3" );
   } // fin del método metodo3
} // fin de la clase UsoDeExcepcionesEncadenadas

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
