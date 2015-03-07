// Fig. 10.15: PruebaInterfazPorPagar.java
// Prueba la interfaz PorPagar.

public class PruebaInterfazPorPagar 
{
   public static void main( String[] args )
   {
      // crea arreglo PorPagar con cuatro elementos
      PorPagar[] objetosPorPagar = new PorPagar[ 4 ];
      
      // llena el arreglo con objetos que implementan la interfaz PorPagar
      objetosPorPagar[ 0 ] = new Factura( "01234", "asiento", 2, 375.00 );
      objetosPorPagar[ 1 ] = new Factura( "56789", "llanta", 4, 79.95 );
      objetosPorPagar[ 2 ] = 
         new EmpleadoAsalariado( "John", "Smith", "111-11-1111", 800.00 );
      objetosPorPagar[ 3 ] = 
         new EmpleadoAsalariado( "Lisa", "Barnes", "888-88-8888", 1200.00 );

      System.out.println( 
         "Facturas y Empleados procesados en forma polimorfica:\n" ); 

      // procesa en forma genérica cada elemento en el arreglo objetosPorPagar
      for ( PorPagar porPagarActual : objetosPorPagar )
      {
         // imprime porPagarActual y su monto de pago apropiado
         System.out.printf( "%s \n%s: $%,.2f\n\n", 
            porPagarActual.toString(), 
            "pago vencido", porPagarActual.obtenerMontoPago() ); 
      } // fin de for
   } // fin de main
} // fin de la clase PruebaInterfazPorPagar


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
