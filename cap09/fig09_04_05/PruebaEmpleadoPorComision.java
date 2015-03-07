// Fig. 9.5: PruebaEmpleadoPorComision.java
// Programa de prueba de la clase EmpleadoPorComision.

public class PruebaEmpleadoPorComision 
{
   public static void main( String[] args ) 
   {
      // crea instancia de objeto EmpleadoPorComision
      EmpleadoPorComision empleado = new EmpleadoPorComision( 
         "Sue", "Jones", "222-22-2222", 10000, .06 );
      
      // obtiene datos del empleado por comisi�n
      System.out.println( 
         "Informacion del empleado obtenida por los metodos establecer: \n" );
      System.out.printf( "%s %s\n", "El primer nombre es",
         empleado.obtenerPrimerNombre() );
      System.out.printf( "%s %s\n", "El apellido paterno es", 
         empleado.obtenerApellidoPaterno() );
      System.out.printf( "%s %s\n", "El numero de seguro social es", 
         empleado.obtenerNumeroSeguroSocial() );
      System.out.printf( "%s %.2f\n", "Las ventas brutas son", 
         empleado.obtenerVentasBrutas() );
      System.out.printf( "%s %.2f\n", "La tarifa de comision es",
         empleado.obtenerTarifaComision() );

      empleado.establecerVentasBrutas( 500 ); // establece las ventas brutas
      empleado.establecerTarifaComision( .1 ); // establece la tarifa de comisi�n
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Informacion actualizada del empleado, obtenida mediante toString", empleado );
   } // fin de main
} // fin de la clase PruebaEmpleadoPorComision


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
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
