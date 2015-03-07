// Fig. 5.27: PruebaFiguras.java
// Aplicaci�n de prueba que muestra la clase Figuras.
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFiguras
{
   public static void main( String[] args )
   {
      // obtiene la opci�n del usuario
      String entrada = JOptionPane.showInputDialog(
         "Escriba 1 para dibujar rectangulos\n" +
         "Escriba 2 para dibujar ovalos" );
      
      int opcion = Integer.parseInt( entrada ); // convierte entrada en int
      
      // crea el panel con la entrada del usuario
      Figuras panel = new Figuras( opcion );
      
      JFrame aplicacion = new JFrame(); // crea un nuevo objeto JFrame

      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      aplicacion.add( panel ); // agrega el panel al marco
      aplicacion.setSize( 300, 300 ); // establece el tama�o deseado
      aplicacion.setVisible( true ); // muestra el marco
   } // fin de main
} // fin de la clase PruebaFiguras


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