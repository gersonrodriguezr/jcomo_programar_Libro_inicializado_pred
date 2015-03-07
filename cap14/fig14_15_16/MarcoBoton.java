// Fig. 14.15: MarcoBoton.java
// Creación de objetos JButton.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame 
{
   private JButton botonJButtonSimple; // botón con texto solamente
   private JButton botonJButtonElegante; // botón con iconos

   // MarcoBoton agrega objetos JButton a JFrame
   public MarcoBoton()
   {
      super( "Prueba de botones" );
      setLayout( new FlowLayout() ); // establece el esquema del marco

      botonJButtonSimple = new JButton( "Boton simple" ); // botón con texto
      add( botonJButtonSimple ); // agrega botonJButtonSimple a JFrame

      Icon insecto1 = new ImageIcon( getClass().getResource( "insecto1.gif" ) );
      Icon insecto2 = new ImageIcon( getClass().getResource( "insecto2.gif" ) );
      botonJButtonElegante = new JButton( "Boton elegante", insecto1 ); // establece la imagen
      botonJButtonElegante.setRolloverIcon( insecto2 ); // establece la imagen de sustitución
      add( botonJButtonElegante ); // agrega botonJButtonElegante a JFrame

      // crea nuevo ManejadorBoton para manejar los eventos de botón 
      ManejadorBoton manejador = new ManejadorBoton();
      botonJButtonElegante.addActionListener( manejador );
      botonJButtonSimple.addActionListener( manejador );
   } // fin del constructor de MarcoBoton

   // clase interna para manejar eventos de botón
   private class ManejadorBoton implements ActionListener 
   {
      // maneja evento de botón
      public void actionPerformed( ActionEvent evento )
      {
         JOptionPane.showMessageDialog( MarcoBoton.this, String.format(
            "Usted oprimio: %s", evento.getActionCommand() ) );
      } // fin del método actionPerformed
   } // fin de la clase interna privada ManejadorBoton
} // fin de la clase MarcoBoton

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