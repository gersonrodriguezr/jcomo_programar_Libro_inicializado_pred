// Fig. 14.45: MarcoPanel.java
// Uso de un objeto JPanel para ayudar a distribuir los componentes.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MarcoPanel extends JFrame 
{
   private JPanel panelBotones; // panel que contiene los botones
   private JButton[] botones; // arreglo de botones

   // constructor sin argumentos
   public MarcoPanel()
   {
      super( "Demostracion de Panel" );
      botones = new JButton[ 5 ]; // crea el arreglo botones
      panelBotones = new JPanel(); // establece el panel
      panelBotones.setLayout( new GridLayout( 1, botones.length ) );

      // crea y agrega los botones
      for ( int cuenta = 0; cuenta < botones.length; cuenta++ ) 
      {
         botones[ cuenta ] = new JButton( "Boton " + ( cuenta + 1 ) );
         panelBotones.add( botones[ cuenta ] ); // agrega el botón al panel
      } // fin de for

      add( panelBotones, BorderLayout.SOUTH ); // agrega el panel a JFrame
   } // fin del constructor de MarcoPanel
} // fin de la clase MarcoPanel


/**************************************************************************
 * (C) Copyright 1992-2011 por Deitel & Associates, Inc. y                *
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