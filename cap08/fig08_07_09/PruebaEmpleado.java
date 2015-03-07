// Fig. 8.9: PruebaEmpleado.java
// Demostraci�n de la composici�n.

public class PruebaEmpleado 
{
   public static void main( String[] args )
   {
      Fecha nacimiento = new Fecha( 7, 24, 1949 );
      Fecha contratacion = new Fecha( 3, 12, 1988 );
      Empleado empleado = new Empleado( "Bob", "Blue", nacimiento, contratacion );

      System.out.println( empleado ); 
   } // fin de main
} // fin de la clase PruebaEmpleado


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
