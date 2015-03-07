// Fig. 17.11: OpcionMenu.java
// Enumeración para las opciones del programa de consulta de crédito.

public enum OpcionMenu
{
   // declara el contenido del tipo enum
   SALDO_CERO( 1 ),
   SALDO_CREDITO( 2 ),
   SALDO_DEBITO( 3 ),
   FIN( 4 );

   private final int valor; // opción actual del menú

   // constructor   
   OpcionMenu( int valorOpcion )
   {
      valor = valorOpcion;
   } // fin del constructor del tipo enum OpcionMenu

   // devuelve el valor de una constante   
   public int obtenerValor()
   {
      return valor;
   } // fin del método obtenerValor
} // fin del tipo enum OpcionMenu

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