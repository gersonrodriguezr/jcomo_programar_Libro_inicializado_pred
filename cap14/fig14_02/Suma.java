// Fig. 14.2: Suma.java
// Programa de suma que utiliza a JOptionPane para entrada y salida.
import javax.swing.JOptionPane; // el programa usa JOptionPane

public class Suma 
{
   public static void main( String args[] )
   {
      // obtiene la entrada del usuario de los diálogos de entrada de JOptionPane
      String primerNumero = 
         JOptionPane.showInputDialog( "Introduzca el primer entero" );
      String segundoNumero =
          JOptionPane.showInputDialog( "Introduzca el segundo entero" );

      // convierte las entradas String en valores int para usarlos en un cálculo
      int numero1 = Integer.parseInt( primerNumero ); 
      int numero2 = Integer.parseInt( segundoNumero );

      int suma = numero1 + numero2; // suma números

      // muestra los resultados en un diálogo de mensajes de JOptionPane
      JOptionPane.showMessageDialog( null, "La suma es " + suma, 
         "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
   } // fin del método main
} // fin de la clase Suma


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