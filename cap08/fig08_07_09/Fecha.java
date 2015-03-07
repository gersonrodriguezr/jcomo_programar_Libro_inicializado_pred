// Fig. 8.7: Fecha.java 
// Declaración de la clase Fecha.

public class Fecha 
{
   private int mes; // 1-12
   private int dia;   // 1-31 con base en el mes
   private int anio;  // cualquier año

   private static final int[] diasPorMes = // días en cada mes  
      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   // constructor: llama a comprobarMes para confirmar el valor apropiado para el mes; 
   // llama a comprobarDia para confirmar el valor apropiado para el día
   public Fecha( int elMes, int elDia, int elAnio )
   {
      mes = comprobarMes( elMes ); // valida el mes
      anio = elAnio; // pudo validar el año
      dia = comprobarDia( elDia ); // valida el día

      System.out.printf( 
         "Constructor de objeto Fecha para la fecha %s\n", this );
   } // fin del constructor de Fecha

   // método utilitario para confirmar el valor apropiado del mes
   private int comprobarMes( int mesPrueba )
   {
      if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
         return mesPrueba;
      else // mes es inválido
         throw new IllegalArgumentException ( "el mes debe ser 1 a 12"); 
   } // fin del método comprobarMes

   // método utilitario para confirmar el valor apropiado del día, con base en el mes y el año
   private int comprobarDia( int diaPrueba )
   {
      // comprueba si el día está dentro del rango para el mes
      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
         return diaPrueba;
   
      // comprueba si es año bisiesto
      if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 || 
           ( anio % 4 == 0 && anio % 100 != 0 ) ) )
         return diaPrueba;
   
      throw new IllegalArgumentException(
         "dia fuera de rango para el mes y anio especificados" );
   } // fin del método comprobarDia
   
   // devuelve un objeto String de la forma mes/dia/anio
   public String toString()
   { 
      return String.format( "%d/%d/%d", mes, dia, anio ); 
   } // fin del método toString
} // fin de la clase Fecha


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
