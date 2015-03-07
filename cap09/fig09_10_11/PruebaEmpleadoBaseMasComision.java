// PruebaEmpleadoBaseMasComision.java
// Programa de prueba de EmpleadoBaseMasComision.

public class PruebaEmpleadoBaseMasComision 
{
   public static void main( String[] args ) 
   {
      // crea instancia de objeto EmpleadoBaseMasComision
      EmpleadoBaseMasComision empleado = 
         new EmpleadoBaseMasComision( 
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
      
      // obtiene datos del empleado por comisi�n con sueldo base
      System.out.println( 
         "Informacion del empleado obtenida por metodos establecer: \n" );
      System.out.printf( "%s %s\n", "El primer nombre es",
         empleado.obtenerPrimerNombre() );
      System.out.printf( "%s %s\n", "El apellido es", 
         empleado.obtenerApellidoPaterno() );
      System.out.printf( "%s %s\n", "El numero de seguro social es", 
         empleado.obtenerNumeroSeguroSocial() );
      System.out.printf( "%s %.2f\n", "Las ventas brutas son", 
         empleado.obtenerVentasBrutas() );
      System.out.printf( "%s %.2f\n", "La tarifa de comision es",
         empleado.obtenerTarifaComision() );
      System.out.printf( "%s %.2f\n", "El salario base es",
         empleado.obtenerSalarioBase() );

      empleado.establecerSalarioBase( 1000 ); // establece el salario base
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Informacion actualizada del empleado, obtenida por toString", 
         empleado.toString() );
   } // fin de main
} // fin de la clase PruebaEmpleadoBaseMasComision


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
