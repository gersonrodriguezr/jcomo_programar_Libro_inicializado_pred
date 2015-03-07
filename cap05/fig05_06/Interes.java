// Fig. 5.6: Interes.java
// Cálculo del interés compuesto con for.

public class Interes 
{
   public static void main( String[] args )
   {
      double monto; // monto depositado al final de cada año
      double principal = 1000.0; // monto inicial antes de los intereses
      double tasa = 0.05; // tasa de interés

      // muestra los encabezados
      System.out.printf( "%s%20s\n", "Anio", "Monto en deposito" );

      // calcula el monto en depósito para cada uno de diez años
      for ( int anio = 1; anio <= 10; anio++ ) 
      {
         // calcula el nuevo monto para el año especificado
         monto = principal * Math.pow( 1.0 + tasa, anio );

         // muestra el año y el monto
         System.out.printf( "%4d%,20.2f\n", anio, monto );
      } // fin de for
   } // fin de main
} // fin de la clase Interes


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