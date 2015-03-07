// Fig. 14.21: MarcoCuadroCombinado.java
// Objeto JComboBox que muestra una lista de nombres de im�genes.
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MarcoCuadroCombinado extends JFrame 
{
   private JComboBox imagenesJComboBox; // cuadro combinado con los nombres de los iconos
   private JLabel etiqueta; // etiqueta para mostrar el icono seleccionado

   private static final String nombres[] = 
      { "insecto1.gif", "insecto2.gif",  "insectviaje.gif", "insectanim.gif" };
   private Icon iconos[] = { 
      new ImageIcon( getClass().getResource( nombres[ 0 ] ) ),
      new ImageIcon( getClass().getResource( nombres[ 1 ] ) ), 
      new ImageIcon( getClass().getResource( nombres[ 2 ] ) ),
      new ImageIcon( getClass().getResource( nombres[ 3 ] ) ) };

   // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
   public MarcoCuadroCombinado()
   {
      super( "Prueba de JComboBox" );
      setLayout( new FlowLayout() ); // establece el esquema del marco     

      imagenesJComboBox = new JComboBox( nombres ); // establece JComboBox
      imagenesJComboBox.setMaximumRowCount( 3 ); // muestra tres filas

      imagenesJComboBox.addItemListener(
         new ItemListener() // clase interna an�nima
         {
            // maneja evento de JComboBox
            public void itemStateChanged( ItemEvent evento )
            {
               // determina si est� seleccionada la casilla de verificaci�n
               if ( evento.getStateChange() == ItemEvent.SELECTED )
                  etiqueta.setIcon( iconos[ 
                     imagenesJComboBox.getSelectedIndex() ] );
            } // fin del m�todo itemStateChanged
         } // fin de la clase interna an�nima
      ); // fin de la llamada a addItemListener

      add( imagenesJComboBox ); // agrega cuadro combinado a JFrame
      etiqueta = new JLabel( iconos[ 0 ] ); // muestra el primer icono
      add( etiqueta ); // agrega etiqueta a JFrame
   } // fin del constructor de MarcoCuadroCombinado
} // fin de la clase MarcoCuadroCombinado


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
