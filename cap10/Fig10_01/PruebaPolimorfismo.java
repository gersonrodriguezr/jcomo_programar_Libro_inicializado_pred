// Fig. 10.1: PruebaPolimorfismo.java
// Asignaci�n de referencias a la superclase y la subclase, a
// variables de la superclase y la subclase.

public class PruebaPolimorfismo  
{
   public static void main( String[] args ) 
   {
      // asigna la referencia a la superclase a una variable de la superclase
      EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision( 
         "Sue", "Jones", "222-22-2222", 10000, .06 );                    

      // asigna la referncia a la subclase a una variable de la subclase
      EmpleadoBaseMasComision empleadoBaseMasComision = 
         new EmpleadoBaseMasComision( 
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );         

      // invoca a toString en un objeto de la superclase, usando una variable de la superclase
      System.out.printf( "%s %s:\n\n%s\n\n", 
         "Llamada a toString de EmpleadoPorComision con referencia de superclase ",
         "a un objeto de la superclase", empleadoPorComision.toString() );

      // invoca a toString en un objeto de la subclase, usando una variable de la subclase 
      System.out.printf( "%s %s:\n\n%s\n\n", 
         "Llamada a toString de EmpleadoBaseMasComision con referencia",
         "de subclase a un objeto de la subclase", 
         empleadoBaseMasComision.toString() );

      // invoca a toString en un objeto de la subclase, usando una variable de la superclase
      EmpleadoPorComision empleadoPorComision2 = 
         empleadoBaseMasComision; 
      System.out.printf( "%s %s:\n\n%s\n", 
         "Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
         "a un objeto de la subclase", empleadoPorComision2.toString() );
   } // fin de main
} // fin de la clase PruebaPolimorfismo

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