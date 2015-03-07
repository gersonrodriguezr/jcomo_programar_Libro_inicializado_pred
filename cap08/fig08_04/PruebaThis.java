// Fig. 8.4: PruebaThis.java
//Uso impl�cito y expl�cito de this para hacer referencia a los miembros de un objeto.

public class PruebaThis 
{
   public static void main( String[] args )
   {
      TiempoSimple tiempo = new TiempoSimple( 15, 30, 19 );
      System.out.println( tiempo.crearString() );
   } // fin de main
} // fin de la clase PruebaThis

// la clase TiempoSimple demuestra la referencia "this"
class TiempoSimple 
{
   private int hora;   // 0-23
   private int minuto; // 0-59
   private int segundo; // 0-59 

   // si el constructor utiliza nombres de par�metros id�nticos a 
   // los nombres de las variables de instancia, se requiere la 
   // referencia "this" para diferenciar unos nombres de otros
   public TiempoSimple( int hora, int minuto, int segundo )
   {
      this.hora = hora;      // establece la hora del objeto "this"
      this.minuto = minuto;  // establece el minuto del objeto "this"
      this.segundo = segundo;  // establece el segundo del objeto "this"
   } // fin del constructor de TiempoSimple

   // usa la referencia "this" expl�cita e impl�cita para llamar aStringUniversal
   public String crearString()
   {
      return String.format( "%24s: %s\n%24s: %s", 
         "this.aStringUniversal()", this.aStringUniversal(),
         "aStringUniversal()", aStringUniversal() );
   } // fin del m�todo crearString

   // convierte a String en formato de hora universal (HH:MM:SS)
   public String aStringUniversal()
   {
      // "this" no se requiere aqu� para acceder a las variables de instancia, 
      // ya que el m�todo no tiene variables locales con los mismos
      // nombres que las variables de instancia
      return String.format( "%02d:%02d:%02d", 
         this.hora, this.minuto, this.segundo );
   } // fin del m�todo aStringUniversal
} // fin de la clase TiempoSimple


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
