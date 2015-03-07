// Fig. 8.9: PruebaEmpleado.java
// Demostración de la composición.

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
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
