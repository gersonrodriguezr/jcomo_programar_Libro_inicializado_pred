// Fig. 14.15: MarcoBoton.java
// Creaci�n de objetos JButton.
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
   private JButton botonJButtonSimple; // bot�n con texto solamente
   private JButton botonJButtonElegante; // bot�n con iconos

   // MarcoBoton agrega objetos JButton a JFrame
   public MarcoBoton()
   {
      super( "Prueba de botones" );
      setLayout( new FlowLayout() ); // establece el esquema del marco

      botonJButtonSimple = new JButton( "Boton simple" ); // bot�n con texto
      add( botonJButtonSimple ); // agrega botonJButtonSimple a JFrame

      Icon insecto1 = new ImageIcon( getClass().getResource( "insecto1.gif" ) );
      Icon insecto2 = new ImageIcon( getClass().getResource( "insecto2.gif" ) );
      botonJButtonElegante = new JButton( "Boton elegante", insecto1 ); // establece la imagen
      botonJButtonElegante.setRolloverIcon( insecto2 ); // establece la imagen de sustituci�n
      add( botonJButtonElegante ); // agrega botonJButtonElegante a JFrame

      // crea nuevo ManejadorBoton para manejar los eventos de bot�n 
      ManejadorBoton manejador = new ManejadorBoton();
      botonJButtonElegante.addActionListener( manejador );
      botonJButtonSimple.addActionListener( manejador );
   } // fin del constructor de MarcoBoton

   // clase interna para manejar eventos de bot�n
   private class ManejadorBoton implements ActionListener 
   {
      // maneja evento de bot�n
      public void actionPerformed( ActionEvent evento )
      {
         JOptionPane.showMessageDialog( MarcoBoton.this, String.format(
            "Usted oprimio: %s", evento.getActionCommand() ) );
      } // fin del m�todo actionPerformed
   } // fin de la clase interna privada ManejadorBoton
} // fin de la clase MarcoBoton

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