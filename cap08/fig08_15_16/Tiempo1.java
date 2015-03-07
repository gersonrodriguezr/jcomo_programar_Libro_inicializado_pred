// Fig. 8.15: Tiempo1.java
// La declaraci�n de la clase Tiempo1 mantiene la hora en formato de 24 horas.
package com.deitel.jhtp.cap08;

public class Tiempo1  
{
   private int hora;   // 0 - 23
   private int minuto; // 0 - 59
   private int segundo; // 0 - 59

   // establece un nuevo valor de tiempo, usando la hora universal; lanza una 
   // excepci�n si la hora, minuto o segundo son inv�lidos
   public void establecerTiempo( int h, int m, int s )
   {
      // valida la hora, el minuto y el segundo
      if ( ( h >= 0 && h < 24 ) && ( m >= 0 && m < 60 ) &&
         ( s >= 0 && s < 60 ))
         {
            hora = h;
            minuto = m;
            segundo = s;
         } // fin de if
         else
            throw new IllegalArgumentException(
               "hora, minuto y/o segundo estaban fuera de rango");

   } // fin del m�todo establecerTiempo

   // convierte a objeto String en formato de hora universal (HH:MM:SS)
   public String aStringUniversal()
   {
      return String.format( "%02d:%02d:%02d", hora, minuto, segundo );
   } // fin del m�todo aStringUniversal

   // convierte a objeto String en formato de hora est�ndar (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( ( hora == 0 || hora == 12 ) ? 12 : hora % 12 ),
         minuto, segundo, ( hora < 12 ? "AM" : "PM" ) );
   } // fin del m�todo toString
} // fin de la clase Tiempo1


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
