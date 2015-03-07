// Fig. 17.11: OpcionMenu.java
// Enumeraci�n para las opciones del programa de consulta de cr�dito.

public enum OpcionMenu
{
   // declara el contenido del tipo enum
   SALDO_CERO( 1 ),
   SALDO_CREDITO( 2 ),
   SALDO_DEBITO( 3 ),
   FIN( 4 );

   private final int valor; // opci�n actual del men�

   // constructor   
   OpcionMenu( int valorOpcion )
   {
      valor = valorOpcion;
   } // fin del constructor del tipo enum OpcionMenu

   // devuelve el valor de una constante   
   public int obtenerValor()
   {
      return valor;
   } // fin del m�todo obtenerValor
} // fin del tipo enum OpcionMenu

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