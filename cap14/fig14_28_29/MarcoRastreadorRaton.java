// Fig. 14.28: MarcoRastreadorRaton.java
// Demostraci�n de los eventos de rat�n.
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoRastreadorRaton extends JFrame
{
   private JPanel panelRaton; // panel en el que ocurrir�n los eventos de rat�n
   private JLabel barraEstado; // etiqueta que muestra informaci�n de los eventos

   // El constructor de MarcoRastreadorRaton establece la GUI y 
   // registra los manejadores de eventos de rat�n
   public MarcoRastreadorRaton()
   {
      super( "Demostracion de los eventos de raton" );

      panelRaton = new JPanel(); // crea el panel
      panelRaton.setBackground( Color.WHITE ); // establece el color de fondo
      add( panelRaton, BorderLayout.CENTER ); // agrega el panel a JFrame

      barraEstado = new JLabel( "Raton fuera de JPanel" ); 
      add( barraEstado, BorderLayout.SOUTH ); // agrega etiqueta a JFrame

      // crea y registra un componente de escucha para los eventos de rat�n y de su movimiento
      ManejadorRaton manejador = new ManejadorRaton(); 
      panelRaton.addMouseListener( manejador ); 
      panelRaton.addMouseMotionListener( manejador ); 
   } // fin del constructor de MarcoRastreadorRaton

   private class ManejadorRaton implements MouseListener, 
      MouseMotionListener 
   {
      // Los manejadores de eventos de MouseListener
      // manejan el evento cuando se suelta el rat�n justo despu�s de oprimir el bot�n
      public void mouseClicked( MouseEvent evento )
      {
         barraEstado.setText( String.format( "Se hizo clic en [%d, %d]", 
            evento.getX(), evento.getY() ) );
      } // fin del m�todo mouseClicked

      // maneja evento cuando se oprime el rat�n
      public void mousePressed( MouseEvent evento )
      {
         barraEstado.setText( String.format( "Se oprimio en [%d, %d]", 
            evento.getX(), evento.getY() ) );
      } // fin del m�todo mousePressed

      // maneja evento cuando se suelta el bot�n del rat�n despu�s de arrastrarlo
      public void mouseReleased( MouseEvent evento )
      {
         barraEstado.setText( String.format( "Se solto en [%d, %d]", 
            evento.getX(), evento.getY() ) );
      } // fin del m�todo mouseReleased

      // maneja evento cuando el rat�n entra al �rea
      public void mouseEntered( MouseEvent evento )
      {
         barraEstado.setText( String.format( "Raton entro en [%d, %d]", 
            evento.getX(), evento.getY() ) );
         panelRaton.setBackground( Color.GREEN );
      } // fin del m�todo mouseEntered

      // maneja evento cuando el rat�n sale del �rea
      public void mouseExited( MouseEvent evento )
      {
         barraEstado.setText( "Raton fuera de JPanel" );
         panelRaton.setBackground( Color.WHITE );
      } // fin del m�todo mouseExited

      // Los manejadores de eventos de MouseMotionListener manejan
      // el evento cuando el usuario arrastra el rat�n con el bot�n oprimido
      public void mouseDragged( MouseEvent evento )
      {
         barraEstado.setText( String.format( "Se arrastro en [%d, %d]", 
            evento.getX(), evento.getY() ) );
      } // fin del m�todo mouseDragged

      // maneja evento cuando el usuario mueve el rat�n
      public void mouseMoved( MouseEvent evento )
      {
         barraEstado.setText( String.format( "Se movio en [%d, %d]", 
            evento.getX(), evento.getY() ) );
      } // fin del m�todo mouseMoved
   } // fin de la clase interna ManejadorRaton
} // fin de la clase MarcoRastreadorRaton

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