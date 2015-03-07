// Fig. 14.35: Pintor.java
// Prueba de PanelDibujo.
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor
{
   public static void main( String[] args )
   { 
      // crea objeto JFrame
      JFrame aplicacion = new JFrame( "Un programa simple de dibujo" );

      PanelDibujo panelDibujo = new PanelDibujo(); // crea panel de dibujo
      aplicacion.add( panelDibujo, BorderLayout.CENTER ); // en el centro
      
      // crea una etiqueta y la coloca en la regi�n SOUTH de BorderLayout
      aplicacion.add( new JLabel( "Arrastre el raton para dibujar" ), 
         BorderLayout.SOUTH );

      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      aplicacion.setSize( 400, 200 ); // establece el tama�o del marco
      aplicacion.setVisible( true ); // muestra el marco
   } // fin de main
} // fin de la clase Pintor


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