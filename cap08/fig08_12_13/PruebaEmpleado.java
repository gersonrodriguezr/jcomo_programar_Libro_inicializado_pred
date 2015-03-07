// Fig. 8.13: PruebaEmpleado.java
// Demostración de miembros static.

public class PruebaEmpleado 
{
   public static void main( String[] args )
   {
      // muestra que la cuenta es 0 antes de crear Empleados
      System.out.printf( "Empleados antes de instanciar: %d\n",
         Empleado.obtenerCuenta() );

      // crea dos Empleados; la cuenta debe ser 2
      Empleado e1 = new Empleado( "Susan", "Baker" );
      Empleado e2 = new Empleado( "Bob", "Blue" );
   
      // muestra que la cuenta es 2 después de crear dos Empleados
      System.out.println( "\nEmpleados despues de instanciar: " );
      System.out.printf( "mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuenta() );
      System.out.printf( "mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuenta() );
      System.out.printf( "mediante Empleado.obtenerCuenta(): %d\n", 
         Empleado.obtenerCuenta() );
   
      // obtiene los nombres de los Empleados
      System.out.printf( "\nEmpleado 1: %s %s\nEmpleado 2: %s %s\n\n",
         e1.obtenerPrimerNombre(), e1.obtenerApellidoPaterno(), 
         e2.obtenerPrimerNombre(), e2.obtenerApellidoPaterno() );

      // en este ejemplo, sólo hay una referencia a cada Empleado,
      // por lo que las siguientes dos instrucciones hacen que la JVM 
      // marque a cada objeto Empleado para la recolección de basura
      e1 = null; 
      e2 = null;  
   } // fin de main
} // fin de la clase PruebaEmpleado



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

