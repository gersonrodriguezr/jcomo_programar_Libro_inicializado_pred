// Fig. 18.18: Fractal.java
// Interfaz de usuario para dibujar un fractal.
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;

public class Fractal extends JFrame
{
   private static final int ANCHURA = 400;  // define la anchura de la GUI
   private static final int ALTURA = 480; // define la altura de la GUI
   private static final int NIVEL_MIN = 0, NIVEL_MAX = 15;

   private JButton cambiarColorJButton, aumentarNivelJButton,
      reducirNivelJButton;
   private JLabel nivelJLabel;
   private FractalJPanel espacioDibujo;
   private JPanel principalJPanel, controlJPanel;

   // establece la GUI
   public Fractal()
   {
      super( "Fractal" );

      // establece el panel de control
      controlJPanel = new JPanel();
      controlJPanel.setLayout( new FlowLayout() );

      // establece el botón de color y registra el componente de escucha
      cambiarColorJButton = new JButton( "Color" );
      controlJPanel.add( cambiarColorJButton );
      cambiarColorJButton.addActionListener(
         new ActionListener() // clase interna anónima
         {
            // procesa el evento de cambiarColorJButton
            public void actionPerformed( ActionEvent evento )
            {
               Color color = JColorChooser.showDialog(
                  Fractal.this, "Elija un color", Color.BLUE );

               // establece el color predeterminado, si no se devuelve un color
               if ( color == null )
                  color = Color.BLUE;

               espacioDibujo.establecerColor( color );		  
            } // fin del método actionPerformed
         } // fin de la clase interna anónima
      ); // fin de addActionListener

      // establece botón para reducir nivel, para agregarlo al panel de control y 
      // registra el componente de escucha
      reducirNivelJButton = new JButton( "Reducir nivel" );
      controlJPanel.add( reducirNivelJButton );
      reducirNivelJButton.addActionListener(
         new ActionListener() // clase interna anónima
         {
            // procesa el evento de reducirNivelJButton
            public void actionPerformed( ActionEvent evento )
            {
               int nivel = espacioDibujo.obtenerNivel();
               --nivel; // reduce el nivel en uno

               // modifica el nivel si es posible
               if ( ( nivel >= NIVEL_MIN ) &&
                  ( nivel <= NIVEL_MAX ) )
               {
                  nivelJLabel.setText( "Nivel: " + nivel );
                  espacioDibujo.establecerNivel( nivel );
                  repaint(); 
               } // fin de if
            } // fin del método actionPerformed
         } // fin de la clase interna anónima
      ); // fin de addActionListener

      // establece el botón para aumentar nivel, para agregarlo al panel de control
      // y registra el componente de escucha
      aumentarNivelJButton = new JButton( "Aumentar nivel" );
      controlJPanel.add( aumentarNivelJButton );
      aumentarNivelJButton.addActionListener(
         new ActionListener() // clase interna anónima
         {
            // procesa el evento de aumentarNivelJButton
            public void actionPerformed( ActionEvent evento )
            {
               int nivel = espacioDibujo.obtenerNivel();
               ++nivel; // aumenta el nivel en uno

               // modifica el nivel si es posible
               if ( ( nivel >= NIVEL_MIN ) &&
                  ( nivel <= NIVEL_MAX ) )
               {
                  nivelJLabel.setText( "Nivel: " + nivel );
                  espacioDibujo.establecerNivel( nivel );
                  repaint();
               } // fin de if
            } // fin del método actionPerformed
         } // fin de la clase interna anónima
      ); // fin de addActionListener

      // establece nivelJLabel para agregarlo a controlJPanel
      nivelJLabel = new JLabel( "Nivel: 0" );
      controlJPanel.add( nivelJLabel );

      espacioDibujo = new FractalJPanel( 0 );
 
      // crea principalJPanel para que contenga a controlJPanel y espacioDibujo
      principalJPanel = new JPanel();
      principalJPanel.add( controlJPanel );
      principalJPanel.add( espacioDibujo );

      add( principalJPanel ); // agrega JPanel a JFrame

      setSize( ANCHURA, ALTURA ); // establece el tamaño de JFrame
      setVisible( true ); // muestra JFrame
   } // fin del constructor de Fractal

   public static void main( String[] args )
   {
      Fractal demo = new Fractal();
      demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } // fin de main
} // fin de la clase Fractal

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