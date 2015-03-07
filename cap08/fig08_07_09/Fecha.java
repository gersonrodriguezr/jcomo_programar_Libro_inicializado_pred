// Fig. 8.7: Fecha.java 
// Declaraci�n de la clase Fecha.

public class Fecha 
{
   private int mes; // 1-12
   private int dia;   // 1-31 con base en el mes
   private int anio;  // cualquier a�o

   private static final int[] diasPorMes = // d�as en cada mes  
      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   // constructor: llama a comprobarMes para confirmar el valor apropiado para el mes; 
   // llama a comprobarDia para confirmar el valor apropiado para el d�a
   public Fecha( int elMes, int elDia, int elAnio )
   {
      mes = comprobarMes( elMes ); // valida el mes
      anio = elAnio; // pudo validar el a�o
      dia = comprobarDia( elDia ); // valida el d�a

      System.out.printf( 
         "Constructor de objeto Fecha para la fecha %s\n", this );
   } // fin del constructor de Fecha

   // m�todo utilitario para confirmar el valor apropiado del mes
   private int comprobarMes( int mesPrueba )
   {
      if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
         return mesPrueba;
      else // mes es inv�lido
         throw new IllegalArgumentException ( "el mes debe ser 1 a 12"); 
   } // fin del m�todo comprobarMes

   // m�todo utilitario para confirmar el valor apropiado del d�a, con base en el mes y el a�o
   private int comprobarDia( int diaPrueba )
   {
      // comprueba si el d�a est� dentro del rango para el mes
      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
         return diaPrueba;
   
      // comprueba si es a�o bisiesto
      if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 || 
           ( anio % 4 == 0 && anio % 100 != 0 ) ) )
         return diaPrueba;
   
      throw new IllegalArgumentException(
         "dia fuera de rango para el mes y anio especificados" );
   } // fin del m�todo comprobarDia
   
   // devuelve un objeto String de la forma mes/dia/anio
   public String toString()
   { 
      return String.format( "%d/%d/%d", mes, dia, anio ); 
   } // fin del m�todo toString
} // fin de la clase Fecha


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
